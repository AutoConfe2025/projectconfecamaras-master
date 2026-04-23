# language: es

Característica: flujo de renovacion matricula renovacion con ley 1780 cumple

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionLey1780Mantiene @Renovacion @SII4
  Escenario: realizo el flujo de matricula persona natural ya renovada reliquidacion
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores ley 1780 mantiene "RENOVACION_1780_CUMPLE"
    Entonces realizjo el flujo de renovacion con ley 1780 mantiene