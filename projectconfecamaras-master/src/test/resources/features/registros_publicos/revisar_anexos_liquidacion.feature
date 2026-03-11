# language: es

Característica: revision de flujo de resumen de procesos especiales revisar anexos liquidacion

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRevisarAnexosLiquidacion @SII4
  Escenario: valido el flujo de revisar anexos liquidacion
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Revisar Anexos Liquidacion"
    Entonces realizo el flujo de revisar anexos liquidacion