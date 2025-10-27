# language: es

Característica: Ingresos Por Servicio - Tipos de Venta

  @ingresoServicioTipoVenta @BloqueCinco @general
  Escenario: Ingresos Por Servicio - Tipos de Venta
    Dado Confecamaras requiere consultar el Ingreso por servicios tipo benta
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas a consultar
    Entonces podra descargar csv de la info