# language: es

Característica: Mtto Devoluciones

  @mttoDevoluciones @BloqueSeis @general
  Escenario: Mtto Devoluciones
    Dado Confecamaras requiere consultar o editar una devolucion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado mtto devoluciones y edite o ingrese la info necesaria
    Entonces podra visualizar la informacion actualizada