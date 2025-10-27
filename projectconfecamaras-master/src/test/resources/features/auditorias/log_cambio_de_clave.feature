# language: es

Característica: Log Cambio De Clave

  @logCambioClave @BloqueSeis @general
  Escenario: Log Cambio De Clave
    Dado Confecamaras requiere consultar el log de cambio de clave
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese un rango de fechas
    Entonces podra visualizar el log correspondiente a ese rango de fechas