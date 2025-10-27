# language: es

Característica: Ingreso Por Cuenta

  @ingresoCuenta @BloqueCinco @general
  Escenario: Ingreso Por Cuenta
    Dado Confecamaras requiere consultar el Ingreso por cuentas
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese los datos de cuenta
    Entonces podra descargar la info