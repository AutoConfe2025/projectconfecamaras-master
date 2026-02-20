# language: es

Característica: Historial De transacciones

  @historialytransacciones @BloqueCinco @general
  Escenario: Consultar historial y transacciones
    Dado Confecamaras requiere consultar su historial de transacciones
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y haga la consulta de historial y transacciones
    Entonces podra ver el historial