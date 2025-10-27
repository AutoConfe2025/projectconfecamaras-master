# language: es

Característica: Maestro Descuento

  @maestroDescuento @BloqueSiete @general
  Escenario: Maestro Descuento
    Dado Confecamaras requiere agregar un nuevo codigo de descuento
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de tabla maestro de descuento e ingrese los datos
    Entonces podra visualizar el nuevo maestro de descuento agregado