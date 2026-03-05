# language: es

Característica: Prepagar Servicios

  @prepagarServicios @BloqueCinco @general
  Escenario: Prepagar Servicios
    Dado Confecamaras requiere prepagar los servicios
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consulte sus datos e ingrese la cantidad a prepagar
    Entonces podra realizar el previo pago de los servicios