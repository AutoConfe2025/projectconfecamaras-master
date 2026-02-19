# language: es

Característica: revision de flujo de modulo de registros publicos extraccion no renovados ss 1727

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoExtraccionesNoRenovados1727 @SII4
  Escenario: valido el flujo de extraccion no renovados ss 1727
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Extraccion No renovados SS - 1727"
    Entonces realizo el flujo de extraccion no renovados ss - 1727