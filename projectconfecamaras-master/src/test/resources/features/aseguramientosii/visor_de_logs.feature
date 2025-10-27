# language: es

Característica: Visor De Logs

  @visorDeLogs @BloqueSeis @general
  Escenario:Visor De Logs
    Dado Confecamaras requiere consultar el visor de logs
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | admin    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y ingrese al apartado de visor de logs
    Entonces podra visualizar los logs segun el tipo de log que el usuario elija