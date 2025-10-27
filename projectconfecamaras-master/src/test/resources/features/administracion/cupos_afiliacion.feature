# language: es

Característica: Cupos Afiliacion

  @cuposAfiliado #@BloqueSiete @general
  Escenario: Cupos Afiliacion
    Dado Confecamaras requiere agregar un nuevo cupo
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
#    Y ingrese al ingresar al apartado de cupo afiliados ingrese uno nuevo
#    Entonces podra visualizar el nuevo cupo afiliado y los existentes