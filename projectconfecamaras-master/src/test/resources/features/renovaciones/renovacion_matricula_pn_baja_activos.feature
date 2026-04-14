# language: es

Característica: flujo de renovacion matricula persona natural baja activos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaPersonaNaturalBajaActivos @Renovacion @SII4
  Escenario: realizo el flujo de matricula persona natural activos
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores baja activos "PERSONA_NATURAL_BAJA_ACTIVOS"
    Entonces realizjo el flujo de baja de activos