# language: es

Característica: Ingreso Por Servicio

  @ingresoServicio @BloqueCinco @general
  Escenario: Ingreso Por Servicio
    Dado Confecamaras requiere consultar el Ingreso por servicio
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese los datos de servicio
    Entonces podra descargar la info de servicio