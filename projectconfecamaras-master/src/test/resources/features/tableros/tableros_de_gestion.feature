# language: es

Característica: Tableros de gestion

  @tablerogestion @BloqueCinco @general
  Escenario: Consulta tablero
    Dado Confecamaras requiere consultar tablero de gestion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |


    Y busque los tableros de gestion
    Entonces podra consultar el tablero matriculados
    Y podra ver el tablero matriculados vs meta
    Y podra ver el tablero total ingresos vs presopuesto
    Y podra ver el tablero ingresos por tipo ingreso
    Y podra ver el tablero comparativo ingreso por grupo de ingreso