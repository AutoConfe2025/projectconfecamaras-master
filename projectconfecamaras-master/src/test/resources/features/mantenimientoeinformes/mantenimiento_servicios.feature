# language: es

Característica: Mantenimiento Servicio

  @mantenimientoServicio @BloqueCinco @general
  Escenario: Mantenimiento Servicio
    Dado Confecamaras requiere ingresar datos al servicio y la parametrizacion nif
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese los datos de servicio y nif
    Entonces podra visualizar los datos ingresados