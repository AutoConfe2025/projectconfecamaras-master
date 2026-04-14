# language: es

Característica: flujo de renovacion matricula persona natural ya renovada reliquidacion

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaPersonaNaturalRenovadaReliquidacion @Renovacion @SII4
  Escenario: realizo el flujo de matricula persona natural ya renovada reliquidacion
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores pn afiliada "PERSONA_NATURAL_RENOVADA_RELIQUIDACION"
    Entonces realizjo el flujo de persona natural afiliada