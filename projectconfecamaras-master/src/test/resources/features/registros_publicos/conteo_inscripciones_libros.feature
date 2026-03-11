# language: es

Característica: revision de flujo de conteo de inscripciones de libros

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoConteoInscripciones @SII4
  Escenario: valido el flujo de conteo de inscripciones libros
    Y ingreso al sistema SII3 como usuario publico16
    Cuando ingreso solo bandeja "Conteo de Inscripciones en Libros"
    Entonces realizo el flujo completo de conteo de inscripciones en libros