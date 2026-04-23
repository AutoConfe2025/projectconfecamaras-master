# language: es

Característica: flujo de renovacion sucursal publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionSucPublico #@Renovacion @Renovacion @SII4
  Escenario: realizo el flujo de renovacion suc publico
    Y ingreso al sistema SII3 como usuario publico externo
    Cuando realizo el flujo de valores publico "SUC_CAJA"
    Entonces realizo el flujo de suc con publico