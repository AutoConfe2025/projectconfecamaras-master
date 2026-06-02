package com.co.confecamaras.database.NuevasConexiones;

import com.co.confecamaras.database.DataBaseConnection;
import net.serenitybdd.core.Serenity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScriptRenovacionAgilEsadlDB {

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
                LEFT JOIN sii_manizales.mreg_est_propietarios mep
                    ON mep.matriculapropietario = i.matricula
                WHERE i.matricula <> ''
                  AND i.organizacion = '12'
                  AND i.categoria = '1'
                  AND i.ctrestmatricula = 'IA'
                  AND i.ultanoren = '2025'
                  AND i.ciiu1 <> 'A0111'
                  AND i.ciiu2 = ''
                  AND i.acttot < 1000000000
                  AND i.ctrclaseespeesadl NOT IN ('49', '61')
                GROUP BY i.matricula
                HAVING COUNT(mep.matriculapropietario) = 0
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
                  AND vinculo = '4170'
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
            // Equivalente SQL:
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

                        throw new RuntimeException("❌ No se pudo obtener el numid final");
                    }
                }
            }

            // =========================================================
            // 6. GUARDAR EN SERENITY SESSION
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