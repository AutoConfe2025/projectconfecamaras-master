# language: es

Característica: flujo de renovacion age publico con caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionAgePublico @Renovacion @SII4
  Escenario: realizo el flujo de renovacion age publico
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores age publico "AGE_CAJA"
    Entonces realizo el flujo de renovacion Age publico sin firma