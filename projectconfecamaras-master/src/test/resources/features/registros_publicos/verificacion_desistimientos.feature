# language: es

Característica: revision de flujo de verificacion de desistimientos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoVerificacionDesistimientos @SII4
  Escenario: valido el flujo de verificacion de desistimientos
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Verificación Desistimientos"
    Entonces realizo el flujo de verificacion de desistimientos