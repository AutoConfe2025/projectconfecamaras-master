# language: es

Característica: Ingresos por Municipio - Expediente

  @ingresosPorMunicipio @BloqueSiete @general
  Escenario: Ingresos por Municipio - Expediente
    Dado Confecamaras requiere consultar Ingresos por Municipio - Expediente
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese el rango de fechas para consultar los ingresos
    Entonces podra visualizar el enlace de descarga de ingresos por municipio

