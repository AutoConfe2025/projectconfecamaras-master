# language: es

Característica: Detallado Recibos Reversados

 @detalladoRecibosReversados @BloqueSiete @general
  Escenario: Detallado Recibos Reversados
    Dado Confecamaras requiere consultar Detallado Recibos Reversados
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas operador y formato
    Entonces podra visualizar el enlace de descarga de recibos reservados

