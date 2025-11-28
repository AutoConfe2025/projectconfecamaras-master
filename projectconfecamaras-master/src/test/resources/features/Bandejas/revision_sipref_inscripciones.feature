# language: es

Característica: validacion de bandejas Estudio General

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionRevisionSiprefInscripcionesNotificar
  Escenario: valido el flujo con el boton de notificar
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Revision SIPREF (Inscripciones)"
    Y ingreso la fecha de la busqueda "11/07/2025"
    Entonces realizo el proceso de notificar

  @ValidacionRevisionSiprefInscripcionesRevisado
  Escenario: valido el flujo con el boton de notificar
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Revision SIPREF (Inscripciones)"
    Y ingreso la fecha de la busqueda "11/07/2025"
    Entonces marco como revisado