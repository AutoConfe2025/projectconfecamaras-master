package com.co.confecamaras.database.NuevasConexiones;

import com.co.confecamaras.database.DataBaseConnection;
import net.serenitybdd.core.Serenity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScriptRenovacionAgilPj {

    public String ejecutarFlujoCompleto() {

        try (Connection conn = DataBaseConnection.getConnection()) {

            System.out.println("📌 BD conectada: " + conn.getCatalog());

            conn.setAutoCommit(true);

            // =========================================================
            // 1. DELETE
            // =========================================================
            String delete = """
                DELETE FROM sii_manizales.mreg_liquidacion
                WHERE emailcontrol = 'eiden@confecamaras.org.co';
            """;

            try (PreparedStatement stmt = conn.prepareStatement(delete)) {

                int rows = stmt.executeUpdate();

                System.out.println("🧹 DELETE ejecutado - filas: " + rows);
            }

            // =========================================================
            // 2. SELECT MATRICULA
            // =========================================================
            String selectMatricula = """
                SELECT i.matricula
                FROM sii_manizales.mreg_est_inscritos i
                INNER JOIN sii_manizales.mreg_est_propietarios mep
                    ON mep.matriculapropietario = i.matricula
                WHERE i.matricula <> ''
                  AND i.ultanoren = '2025'
                  AND i.organizacion = '16'
                  AND i.ctrestmatricula = 'MA'
                  AND i.actcte < '10000000'
                GROUP BY i.matricula
                HAVING COUNT(mep.matriculapropietario) = 1
                LIMIT 1
            """;

            String matricula = null;

            try (PreparedStatement stmt = conn.prepareStatement(selectMatricula);
                 ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    matricula = rs.getString("matricula");

                    System.out.println("🎯 Matrícula obtenida: " + matricula);

                } else {

                    throw new RuntimeException("❌ No se encontró matrícula");
                }
            }

            // =========================================================
            // 3. SELECT NUMID
            // =========================================================
            String selectNumid = """
                SELECT numid
                FROM sii_manizales.mreg_est_vinculos
                WHERE matricula = ?
                  AND vinculo = '2170'
                  AND estado = 'V'
            """;

            String numid = null;

            try (PreparedStatement stmt = conn.prepareStatement(selectNumid)) {

                stmt.setString(1, matricula);

                try (ResultSet rs = stmt.executeQuery()) {

                    if (rs.next()) {

                        numid = rs.getString("numid");

                        System.out.println("🆔 Numid obtenido: " + numid);

                    } else {

                        throw new RuntimeException("❌ No se encontró numid");
                    }
                }
            }

            // =========================================================
            // 4. UPDATE
            // =========================================================
            String update = """
                UPDATE usuarios_nacionales.usuarios_verificados
                SET numid = ?
                WHERE nombre = 'RIOS MARIN EIDEN SANTIAGO'
            """;

            try (PreparedStatement stmt = conn.prepareStatement(update)) {

                stmt.setString(1, numid);

                int rows = stmt.executeUpdate();

                System.out.println("✏️ UPDATE ejecutado - filas: " + rows);
            }

            // =========================================================
            // 5. SELECT FINAL
            // Equivalente:
            // SELECT @numid AS numid;
            // =========================================================
            String selectFinal = """
                SELECT ? AS numid
            """;

            String numidFinal = null;

            try (PreparedStatement stmt = conn.prepareStatement(selectFinal)) {

                stmt.setString(1, numid);

                try (ResultSet rs = stmt.executeQuery()) {

                    if (rs.next()) {

                        numidFinal = rs.getString("numid");

                        System.out.println("✅ Numid final: " + numidFinal);

                    } else {

                        throw new RuntimeException("❌ No se pudo obtener numid final");
                    }
                }
            }

            // =========================================================
            // 6. GUARDAR EN SERENITY
            // =========================================================
            Serenity.setSessionVariable("numid").to(numidFinal);

            // =========================================================
            // 7. RETORNAR DATO FINAL
            // =========================================================
            return numidFinal;

        } catch (Exception e) {

            throw new RuntimeException("❌ Error ejecutando flujo completo", e);
        }
    }
}
