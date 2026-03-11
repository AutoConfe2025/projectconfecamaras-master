# language: es

Característica: revision de escaneo nueva digitalizacion off line imagenes

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoMOduloDigitalizacionOFf @SII4
  Escenario: valido el flujo de escaneo nueva digitalizacion off line imagenes
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Nueva Digitalización Off Line Imágenes"
    Entonces consulto el proceso con el numero de codigo "739148"
    Y realizo las validaciones correspondientes del modulo