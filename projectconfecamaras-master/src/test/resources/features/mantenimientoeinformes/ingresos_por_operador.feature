# language: es

Característica: Ingresos por Operador

  @ingresosPoeOperador @BloqueSeis @general
  Escenario: Ingresos por Operador
    Dado Confecamaras requiere consultar Ingresos por Operador
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas y tipo detalle
    Entonces podra visualizar el enlace de descarga de ingresos por operador

