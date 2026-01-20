# language: es

Característica: revision de flujo de estadisticas y extracciones relacion de liquidaciones

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRelacionLiquidacion
  Escenario: valido el flujo de relacion de liquidaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Relación de Liquidaciones"
    Entonces realizo el flujo de relacion de liquidaciones