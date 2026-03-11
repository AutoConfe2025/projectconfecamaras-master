# language: es

Característica: revision de proceso cambio de domicilio de proponentes

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @CambioDomicilioProponente @SII4
  Escenario: valido el flujo de cambio de domicilio de proponentes
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Cambio domicilio proponentes"
    Entonces realizo el flujo de cambio de domicilio de proponentes "900195023"
    Y ingreso de nuevo al ambiente y hago las validaciones "Cambio domicilio proponentes"