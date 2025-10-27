# language: es

Característica: Maestro Clases Vinculos


  @maestroClasesVicnulos @BloqueSiete @general
  Escenario: Maestro Clases Vinculos
    Dado Confecamaras requiere editar la informacion de un maestro vinculo
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al apartado de maestro clases vinculos e ingrese la nueva informacion
    Entonces podra visualizar los cambios realzados en el maestro vinculo editado