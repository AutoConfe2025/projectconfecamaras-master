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
            WHERE i.matricula <> ''
              AND i.organizacion = '14'
              AND i.categoria = '1'
              AND i.ctrestmatricula = 'IA'
              AND i.ultanoren = '2025'
              AND i.ciiu1 <> 'A0111'
              AND i.acttot < 10000000000
            LIMIT 1
            """),

    ESADL_ORG_DOCE_CAJA("""
            SELECT i.matricula
            FROM sii_manizales.mreg_est_inscritos i
            WHERE i.matricula <> ''
              AND i.organizacion = '12'
              AND i.categoria = '1'
              AND i.ctrestmatricula = 'IA'
              AND i.ultanoren = '2025'
              AND i.ciiu1 <> 'A0111'
              AND i.acttot < 10000000000
            LIMIT 1
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
                              FROM sii_manizales.mreg_est_inscritos\s
                              WHERE organizacion = '01'\s
                              and ctrestmatricula = 'MA'\s
                              and ultanoren = '2025'
                              AND ciiu1='A0111'
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
            """);


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
