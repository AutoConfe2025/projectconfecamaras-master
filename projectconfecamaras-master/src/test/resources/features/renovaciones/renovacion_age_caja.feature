# language: es

Característica: flujo de renovacion sucursal con caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionAgeCaja #@Renovacion @SII4
  Escenario: realizo el flujo de renovacion age caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores caja "AGE_CAJA"
    Entonces realizo el flujo de renovacion Age