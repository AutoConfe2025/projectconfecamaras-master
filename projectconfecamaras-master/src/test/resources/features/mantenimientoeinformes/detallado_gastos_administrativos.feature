# language: es

Característica: Detallado Gastos Administrativos

  @detalladoGastosAdministrativos @BloqueSiete @general
  Escenario: Detallado Gastos Administrativos
    Dado Confecamaras requiere consultar Detallado Gastos Administrativos
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas y formato deseado
    Entonces podra visualizar el enlace de descarga de gastos administrativos





