# language: es

Característica: flujo de renovacion sucursal con caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionAgePublico @Renovacion @SII4
  Escenario: realizo el flujo de renovacion suc caja
    Y ingreso al sistema SII3 como usuario publico externo
    Cuando realizo el flujo de valores age publico "AGE_CAJA"
    Entonces realizo el flujo de renovacion Age publico