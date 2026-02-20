# language: es

Característica: revision de flujo de modulo de registros publicos relacion sms

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRelacionSMS @SII4
  Escenario: valido el flujo de registrar publicar relacion de sms
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Relación de SMS"
    Entonces realizo el flujo de relacion de sms