# language: es

Característica: Evaluar Variables De Sesion

  @variablesDeSesion @BloqueSeis @general
  Escenario:Evaluar Variables De Sesion
    Dado Confecamaras requiere consultar las variables de sesion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al apartado de variables de sesion
    Entonces podra visualizar las variables des sesion existentes