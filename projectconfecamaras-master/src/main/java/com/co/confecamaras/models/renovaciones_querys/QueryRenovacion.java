package com.co.confecamaras.models.renovaciones_querys;

public enum QueryRenovacion {

    PERSONA_NATURAL_EST_CAJA("""
            SELECT i.matricula
                           FROM sii_manizales.mreg_est_inscritos i
                           INNER JOIN sii_manizales.mreg_est_propietarios mep
                               ON mep.matriculapropietario = i.matricula
                           WHERE i.matricula <> ''
                             AND i.ultanoren = '2025'
                             AND i.organizacion = '01'
                             AND i.ctrestmatricula = 'MA'
                             AND i.actcte < 10000000
                             AND i.ciiu2 = ""
                           GROUP BY i.matricula
                           HAVING COUNT(mep.matriculapropietario) = 1
                           LIMIT 1
            """),

    PERSONA_JURIDICA_EST_CAJA("""
            SELECT i.matricula
            FROM sii_manizales.mreg_est_inscritos i
            INNER JOIN sii_manizales.mreg_est_propietarios mep 
                ON mep.matriculapropietario = i.matricula
            WHERE i.matricula <> ''
              AND i.ultanoren = '2025'
              AND i.organizacion = '16'
              AND i.categoria = '1'
              AND i.ctrestmatricula = 'MA'
              AND CAST(REPLACE(i.actcte, '.', '') AS UNSIGNED) < 500000000
              AND CAST(REPLACE(i.acttot, '.', '') AS UNSIGNED) < 500000000
              AND EXISTS (
                    SELECT 1 
                    FROM sii_manizales.mreg_est_inscritos e
                    WHERE e.matricula = i.matricula
                      AND e.ctrestmatricula = 'MA'
              )
            GROUP BY i.matricula, i.actcte, i.acttot
            HAVING COUNT(mep.matriculapropietario) = 1
            LIMIT 1
            """),

    ESADL_ORG_CATORCE_CAJA("""                      
                                SELECT i.matricula
                                      FROM sii_manizales.mreg_est_inscritos i
                                      LEFT JOIN sii_manizales.mreg_est_propietarios mep
                                      ON mep.matriculapropietario = i.matricula
                                      WHERE i.matricula <> ''
                                      AND i.organizacion = '14'
                                      AND i.categoria = '1'
                                      AND i.ctrestmatricula = 'IA'
                                      AND i.ultanoren = '2025'
                                      AND i.ciiu1 <> 'A0111'
                                      AND i.ciiu2 = ""
                                      AND i.acttot < 1000000000
                                      AND i.ctrclaseespeesadl NOT IN ('49', '61')
                                      GROUP BY i.matricula
                                      HAVING COUNT(mep.matriculapropietario) = 0
                                      LIMIT 1;
            """),

    ESADL_ORG_DOCE_CAJA("""
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
                                         AND i.ciiu2 = ""
                                         AND i.acttot < 1000000000
                                         AND i.ctrclaseespeesadl NOT IN ('49', '61')
                                         GROUP BY i.matricula
                                         HAVING COUNT(mep.matriculapropietario) = 0
                                         LIMIT 1;
            """),

    SUC_CAJA("""
            SELECT i.matricula
            FROM sii_manizales.mreg_est_inscritos i
            WHERE i.matricula <> ''
              AND i.ultanoren = '2025'
              AND i.organizacion = '03'
              AND i.categoria = '2'
              AND i.ctrestmatricula = 'MA'
              AND i.actcte < 200000000
            LIMIT 1
            """),

    AGE_CAJA("""
            SELECT i.matricula
            FROM sii_manizales.mreg_est_inscritos i
            WHERE i.matricula <> ''
              AND i.ultanoren = '2025'
              AND i.organizacion = '03'
              AND i.categoria = '3'
              AND i.ctrestmatricula = 'MA'
              AND i.actcte < 99000000
            LIMIT 1
            """),

    AGE_CAJA_1("""
            SELECT i.matricula
            FROM sii_manizales.mreg_est_inscritos i
            WHERE i.matricula <> ''
              AND i.ultanoren = '2026'
              AND i.organizacion = '03'
              AND i.categoria = '3'
              AND i.ctrestmatricula = 'MA'
              AND i.actcte < 99000000
            LIMIT 1
            """),

    VARIOS_ANIOS("""
            SELECT matricula
                   FROM sii_manizales.mreg_est_inscritos
                   WHERE organizacion = '01'
                   AND ultanoren = '2023'
                   and ctrestmatricula = 'MA'
                   AND acttot < '5000000'
                   LIMIT 1
            """),

    INACTIVA_PERSONA_JURIDICA("""
            SELECT matricula
                   FROM mreg_est_inscritos
                   WHERE organizacion IN ('16')
                   AND ctrestmatricula = 'MI'
                   AND ultanoren = 2022
                   LIMIT 1
            """),

    INACTIVA_PERSONA_NATURAL("""
            SELECT i.matricula
                          FROM sii_manizales.mreg_est_inscritos i
                          INNER JOIN sii_manizales.mreg_est_propietarios mep
                              ON mep.matriculapropietario = i.matricula
                          WHERE i.matricula IS NOT NULL
                              AND i.organizacion = '01'
                              AND i.ctrestmatricula = 'MI'
                              AND i.ultanoren LIKE '%2022%'
                          GROUP BY i.matricula
                          HAVING COUNT(mep.matriculapropietario) = 1
                          LIMIT 1
            """),

    ACTIVIDAD_NO_COMERCIAL_("""
                SELECT matricula
                              FROM sii_manizales.mreg_est_inscritos
                              WHERE organizacion = '01'
                              and ctrestmatricula = 'MA'
                              and ultanoren = '2025'
                              AND ciiu1='A0111'
                              LIMIT 1
            """),

    PERSONA_NATURAL_BAJA_ACTIVOS("""
                SELECT i.matricula
                                                            from sii_manizales.mreg_est_inscritos i
                                                            INNER JOIN sii_manizales.mreg_est_propietarios mep ON mep.matriculapropietario = i.matricula
                                                            WHERE i.matricula <> ''
                                                            AND i.ultanoren = '2025'
                                                            AND i.organizacion = '01'
                                                            AND i.ctrestmatricula = 'MA'
                                                            AND i.actcte > '200000000'
                                                            AND i.actcte < '500000000'
                                                            GROUP BY i.matricula
                                                            having count(mep.matriculapropietario) = 1
                                                            LIMIT 1
            """),

    PERSONA_NATURAL_BAJA_AFILIADA("""
                SELECT i.matricula
                                                            from sii_manizales.mreg_est_inscritos i
                                                            INNER JOIN sii_manizales.mreg_est_propietarios mep
                                                            ON mep.matriculapropietario = i.matricula
                                                            INNER JOIN sii_manizales.mreg_est_inscritos e
                                                            ON e.matricula = mep.matricula
                                                            and e.ctrestmatricula = 'MA'
                                                            and e.ultanoren = '2025'
                                                            WHERE i.matricula <> ''
                                                            AND i.ultanoren = '2025'
                                                            AND i.organizacion = '01'
                                                            AND i.ctrestmatricula = 'MA'
                                                            AND i.ctrafiliacion = '1'
                                                            AND i.actcte < '10000000'
                                                            GROUP BY i.matricula
                                                            having count(mep.matriculapropietario) = 1
                                                            LIMIT 1
            """),

    PERSONA_NATURAL_RENOVADA_RELIQUIDACION("""
                SELECT i.matricula
                                                 from sii_manizales.mreg_est_inscritos i
                                                 INNER JOIN sii_manizales.mreg_est_propietarios mep
                                                 ON mep.matriculapropietario = i.matricula
                                                 INNER JOIN sii_manizales.mreg_est_inscritos e
                                                 ON e.matricula = mep.matricula
                                                 and e.ctrestmatricula = 'MA'
                                                 and e.ultanoren = '2026'
                                                 WHERE i.matricula <> ''
                                                 AND i.ultanoren = '2026'
                                                 AND i.organizacion = '01'
                                                 AND i.ctrestmatricula = 'MA'
                                                 AND i.actcte < '10000000'
                                                 GROUP BY i.matricula
                                                 having count(mep.matriculapropietario) = 1
                                                 LIMIT 1
            """),

    RENOVACION_1780_CUMPLE("""
                SELECT i.matricula
                                                        from sii_manizales.mreg_est_inscritos i
                                                        INNER JOIN sii_manizales.mreg_est_propietarios mep ON mep.matriculapropietario = i.matricula
                                                        WHERE i.matricula <> ''
                                                        AND i.ultanoren = '2025'
                                                        AND i.fecmatricula > '20250101'
                                                        AND i.organizacion = '01'\s
                                                        AND i.ctrestmatricula = 'MA'
                                                        AND i.ctrbenley1780 ='S'
                                                        AND i.cumplerequisitos1780 = 'S'
                                                        AND i.cumplerequisitos1780primren = ''
                                                        AND i.renunciabeneficios1780 = ''
                                                        AND i.actcte < '500000000'
                                                        GROUP BY i.matricula
                                                        having count(mep.matriculapropietario) = 1
                                                        LIMIT 1
            """),

    RENOVACION_1780_NO_CUMPLE("""
                SELECT i.matricula
                                                        from sii_manizales.mreg_est_inscritos i
                                                        INNER JOIN sii_manizales.mreg_est_propietarios mep ON mep.matriculapropietario = i.matricula
                                                        WHERE i.matricula <> ''
                                                        AND i.ultanoren = '2025'
                                                        AND i.fecmatricula > '20250101'
                                                        AND i.organizacion = '01'\s
                                                        AND i.ctrestmatricula = 'MA'
                                                        AND i.ctrbenley1780 ='S'
                                                        AND i.cumplerequisitos1780 = 'N'
                                                        AND i.cumplerequisitos1780primren = ''
                                                        AND i.renunciabeneficios1780 = ''
                                                        AND i.actcte < '500000000'
                                                        GROUP BY i.matricula
                                                        having count(mep.matriculapropietario) = 1
                                                        LIMIT 1
            """),

    AGE_PROPIETARIO_FORANEO("""
                SELECT matricula
                                                               FROM sii_manizales.mreg_est_inscritos
                                                               WHERE organizacion = '03'
                                                               AND categoria = '3'
                                                               and ultanoren = '2025'
                                                               and ctrestmatricula = 'MA'
                                                               LIMIT 1
            """),

    SUC_PROPIETARIO_FORANEO("""
                SELECT matricula
                                                                      FROM sii_manizales.mreg_est_inscritos
                                                                      WHERE organizacion = '03'
                                                                      AND categoria = '2'
                                                                      and ultanoren = '2025'
                                                                      and ctrestmatricula = 'MA'
                                                                      LIMIT 1
            """),

    ACTIVIDAD_NO_COMERCIAL("""
                SELECT i.matricula
                       from sii_manizales.mreg_est_inscritos i
                       INNER JOIN sii_manizales.mreg_est_propietarios mep
                       ON mep.matriculapropietario = i.matricula
                       WHERE i.matricula <> ''
                       AND i.ultanoren = '2025'
                       AND i.organizacion = '01'
                       AND i.ctrestmatricula = 'MA'
                       AND i.actcte < '10000000'
                       GROUP BY i.matricula
                       having count(mep.matriculapropietario) = 1
                       LIMIT 1
            """),

    UPDATE_NO_COMERCIAL("""
                UPDATE sii_manizales.mreg_est_inscritos
                SET ciiu2 ='A0111'
                WHERE matricula = '%s'
            """),

    ACTIVIDAD_NO_COMERCIAL_FINAL("""
                SELECT i.matricula
                FROM sii_manizales.mreg_est_inscritos i
                WHERE organizacion = '01'
                  AND ctrestmatricula = 'MA' 
                  AND ultanoren = '2025'
                  AND ciiu2='A0111'
                LIMIT 1
            """),

    RENOVACION_AGIL_DELETE("""
        DELETE FROM sii_manizales.mreg_liquidacion
        WHERE emailcontrol = 'alanrios@confecamaras.org.co';
    """),

    RENOVACION_AGIL_UPDATE("""
        UPDATE sii_manizales.mreg_est_inscritos
        SET numid = '1026265084',
            nit = '10262650841'
        WHERE matricula = (
            SELECT matricula FROM (
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
            ) AS subquery
        );
    """);

    ;


    private final String sql;

    QueryRenovacion(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public static QueryRenovacion from(String value) {
        try {
            return QueryRenovacion.valueOf(value.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("No existe el query en el enum: [" + value + "]");
        }
    }
}
