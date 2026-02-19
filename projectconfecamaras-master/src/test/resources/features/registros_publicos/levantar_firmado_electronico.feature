# language: es

Característica: revision de flujo de modulo de registros publicos levantar firmado electronico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoLevantarFirmadoElectronico @SII4
  Escenario: valido el flujo de LEvantarFirmadoElectronico
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Levantar Firmado Electrónico"
    Entonces realizo el flujo de levantar firmado electronico