# language: es

Característica: Mtto Liquidaciones

  @mttoLiquidaciones @BloqueSeis @general
  Escenario: Mtto Liquidaciones
    Dado Confecamaras requiere editar info de una liquidacion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al ingresar al apartado de mtto liquidacion e ingrese la info
    Entonces podra visualizar la nueva info agregada de la liquidacion