# language: es

Característica: Mantenimiento emails programados


  @mmantenimientoEmailsProgramados @BloqueSeis @general
  Escenario: Mantenimiento emails programados
    Dado Confecamaras requiere editar la informacion de un email
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al apartado de emails programados e ingrese la info
    Entonces podra visualizar los cambios realzados en el email editado