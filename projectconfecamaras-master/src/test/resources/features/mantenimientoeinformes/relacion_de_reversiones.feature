# language: es

Característica: Relacion de Reversiones (Motivo)

  @relacionDeReversiones @BloqueSiete @general
  Escenario: Relacion de Reversiones
    Dado Confecamaras requiere consultar Relacion de Reversiones
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese las fechas para la extraccion
    Entonces podra visualizar el enlace de descarga de relacion de reversiones

