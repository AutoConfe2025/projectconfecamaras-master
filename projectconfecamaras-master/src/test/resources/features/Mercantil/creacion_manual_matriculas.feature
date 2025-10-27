# language: es

Característica: Creacion Manual de Matriculas

  @creacionManualMatriculas @BloqueDos @general
  Escenario: Creacion Manual de Matriculas
    Dado Confecamaras requiere realizar una Creacion Manual de Matriculas
    Cuando Confecamaras ingresa en la aplicacion Sii3 con sus credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos administracion, Creacion de Matriculas
    Entonces validara que la creacion de los distintos tipos de matricula se realizo correctamente