# language: es

Característica: Matricula Persona Natural Sin Establecimiento

  @matriculaPersonaNaturalSinEstablecimiento @BloqueCuatro @general
  Escenario: Matricula Persona Natural Sin Establecimiento
    Dado Confecamaras requiere realizar la Matricula de una Persona Sin Establecimiento
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Consultas y Transacciones, Tramites Registros Publicos
    Entonces validara que se realizo el registro de la persona de manera exitosa