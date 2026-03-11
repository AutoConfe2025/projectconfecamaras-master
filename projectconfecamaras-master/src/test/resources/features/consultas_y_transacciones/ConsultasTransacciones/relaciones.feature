# language: es

Característica: Relacion De Matriculados / Relacion Renovados

  @relacionDeMatriculados @BloqueCinco @general
  Escenario: Relacion Matriculados
    Dado Confecamaras requiere consultar relacion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese el rango de fechas de consulta
    Entonces podra ver la informacion


  @relacionDeRenovados @BloqueCinco @general
  Escenario: Relacion Renovados
    Dado Confecamaras requiere consultar relacion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese el rango de fechas de consulta de renovados
    Entonces podra ver la informacion