# language: es

Característica: Log ingreso al sistema SII3

  @logingresoSII3 @BloqueSeis @general
  Escenario: Log ingreso al sistema SII3
    Dado Confecamaras requiere consultar el log de ingreso al SII3
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | ADMIN   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese un rango de fechas en el aparatdo de ingreso al SII3
    Entonces podra visualizar el log correspondiente al ingreso al SII3