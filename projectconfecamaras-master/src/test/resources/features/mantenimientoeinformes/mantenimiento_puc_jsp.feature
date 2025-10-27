# language: es

Característica: Mantenimiento PUC JSP7

  @mantenimientoJsp @BloqueCinco @general
  Escenario:Mantenimiento PUC
    Dado Confecamaras requiere consultar el registro de los mantenimientos puc
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese al aparatdo de mantenimiento puc
    Entonces podra visualizar la tabla de mantenimiento y sus datos