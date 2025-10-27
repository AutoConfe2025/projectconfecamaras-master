# language: es

Característica: Consulta Vinculos Identificacion

  @consultaVinculosIdentificacion @BloqueDos @general
  Escenario: Consulta Vinculos Identificacion
    Dado Confecamaras requiere realizar la Consulta Vinculos Identificacion
    Cuando ingresa las credenciales asignadas en el aplicativo
    Y seleccione el modulo Vinculos Identificacion para realizar una busqueda
    Entonces validara el resultado de esta consulta