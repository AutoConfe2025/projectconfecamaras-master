# language: es

Característica: Ingresos Por C Costo

  @ingresoCCosto @BloqueCinco @general
  Escenario:Ingresos Por C Costo
    Dado Confecamaras requiere consultar el Ingreso por C costos
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas a consultar con los costos
    Entonces podra descargar los ingresos por costo