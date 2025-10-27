# language: es

Característica: Inventario Scripts

  @inventarioScripts @BloqueSeis @general
  Escenario:Inventario Scripts
    Dado Confecamaras requiere consultar el inventario de scripts
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20         |
      | Usuario        | ADMGEN28   |
      | Identificacion | 1010184230 |
      | Contraseña     | 8980217    |
    Y ingrese al apartado de inventario de scripts
    Entonces podra visualizar el contenido del inventario