# language: es

Característica: flujo de renovacion sucursal con caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionSucCaja #@Renovacion @Renovacion @SII4
  Escenario: realizo el flujo de renovacion suc caja
    Y ingreso al sistema SII3 como usuario publico40
    Cuando realizo el flujo de valores caja "SUC_CAJA_40"
    Entonces realizo el flujo de suc con caja