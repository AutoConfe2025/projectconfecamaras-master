# language: es

Característica: revision de flujo de modulo de registros publicos firmado electronico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoFirmadoElectronico @SII4
  Escenario: valido el flujo de firmado electronico
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Firmado electronico"
    Entonces realizo el flujo de firmado electronico