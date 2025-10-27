# language: es

Característica: Resumido de Impuesto de Registro (SIREP)

  @resumidoDeImpuestosDeRegistro @BloqueSiete @general
  Escenario: Resumido de Impuesto de Registro (SIREP)
    Dado Confecamaras requiere consultar Resumido de Impuesto de Registro
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas para generar el reporte resumido
    Entonces podra visualizar el enlace de descarga de resumido

