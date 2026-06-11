# language: es

Característica: validacion de revision sipref inscripciones

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionRevisionSiprefInscripcionesNotificar @Bandejas @SII4
  Escenario: valido el flujo con el boton de notificar revision sipref
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Revision SIPREF (Inscripciones)"
    Y ingreso la fecha de la busqueda "2017-01-01"
    Entonces realizo el proceso de notificar

  @ValidacionRevisionSiprefInscripcionesRevisado @Bandejas @SII4
  Escenario: valido el flujo con el boton de notificar marco como revisado
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Revision SIPREF (Inscripciones)"
    Y ingreso la fecha de la busqueda "2017-01-01"
    Entonces marco como revisado