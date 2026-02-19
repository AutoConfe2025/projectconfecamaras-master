# language: es

Característica: revision de flujo de conteo de inscripciones de libros

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoPermisosEspeciales
  Escenario: valido el flujo de conteo de inscripciones libros
    Y ingreso al sistema SII3 como usuario publico16 admin
    Cuando ingreso solo bandeja "Permisos especiales"
    Entonces realizo el proceso de permisos especiales