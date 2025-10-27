# language: es

Característica: Detallado de Impuesto de Registro (SIREP)

  @detalladoDeImpuesDeRegistro @BloqueSiete @general
  Escenario: Detallado de Impuesto de Registro
    Dado Confecamaras requiere consultar el impuesto por registro sirep
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas y correo
    Entonces podra visualizar el codigo de extraccion