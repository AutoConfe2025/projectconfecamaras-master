# language: es

Característica: Matricula con embargo


  @MatriculaConEmbargo @BloqueCinco @general
  Escenario: Matricula con embargo
    Dado Confecamaras requiere hacer una renovacion de matricula estando esta embargada
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese la cantidad a renovar
    Entonces podra ver los datos generales de matricula