# language: es

Característica: revision de flujo de modulo de registros publicos revision kardex prepagos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRevisionKardexPrepagos
  Escenario: valido el flujo de revision kardex prepagos
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Revisión Kardex Prepagos"
    Entonces realizo el flujo de revision kardex prepagos