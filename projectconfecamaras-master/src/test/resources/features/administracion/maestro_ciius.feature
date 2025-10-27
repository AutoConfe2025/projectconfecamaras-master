# language: es

Característica: Maestro CIIUS

  @maestroCiius @BloqueSiete @general
  Escenario: Maestro CIIUS
    Dado Confecamaras requiere editar la informacion comercial de un establecimiento
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de maestro ciius y edite la informacion
    Entonces podra visualizar los cambios realzados