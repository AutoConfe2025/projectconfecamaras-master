package com.co.confecamaras.database.NuevasConexiones;

import com.co.confecamaras.database.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScriptRenovacionAgilDB {

    public void ejecutarFlujoCompleto() {

        try (Connection conn = DataBaseConnection.getConnection()) {

            System.out.println("📌 BD conectada: " + conn.getCatalog());

            conn.setAutoCommit(true);

            // 1. DELETE
            String delete = """
                DELETE FROM sii_manizales.mreg_liquidacion
                WHERE emailcontrol = 'alanrios@confecamaras.org.co';
            """;

            try (PreparedStatement stmt = conn.prepareStatement(delete)) {
                int rows = stmt.executeUpdate();
                System.out.println("🧹 DELETE ejecutado - filas: " + rows);
            }

            // 2. SELECT
            String select = """
                SELECT i.matricula
                FROM sii_manizales.mreg_est_inscritos i
                INNER JOIN sii_manizales.mreg_est_propietarios mep
                    ON mep.matriculapropietario = i.matricula
                WHERE i.matricula <> ''
                  AND i.ultanoren = '2025'
                  AND i.organizacion = '01'
                  AND i.ctrestmatricula = 'MA'
                  AND i.actcte < '10000000'
                GROUP BY i.matricula
                HAVING COUNT(mep.matriculapropietario) = 1
                LIMIT 1
            """;

            String matricula = null;

            try (PreparedStatement stmt = conn.prepareStatement(select);
                 ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    matricula = rs.getString("matricula");
                    System.out.println("🎯 Matrícula obtenida: " + matricula);
                } else {
                    throw new RuntimeException("❌ No se encontró matrícula");
                }
            }

            // 3. UPDATE
            String update = """
                UPDATE sii_manizales.mreg_est_inscritos
                SET numid = '1026265084',
                    nit = '10262650841'
                WHERE matricula = ?
            """;

            try (PreparedStatement stmt = conn.prepareStatement(update)) {

                stmt.setString(1, matricula);
                int rows = stmt.executeUpdate();
                System.out.println("✏️ UPDATE ejecutado - filas: " + rows);
            }

            // 🔥 4. ESPERA CRÍTICA
            System.out.println("⏳ Esperando que el sistema procese cambios...");
            Thread.sleep(5000); // 🔥 prueba con 3-10 segundos

            System.out.println("✅ Flujo completo ejecutado correctamente");

        } catch (Exception e) {
            throw new RuntimeException("❌ Error ejecutando flujo completo", e);
        }
    }
}