# language: es
Característica: Validar caracteristicas de Relación de radicaciones
  como usuario quiero realizar las acciones disponibles

  @RelacionRadicaciones
  Escenario: Validar relacion de radicaciones
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Relación de radicaciones que abrira una nueva ventana
    Entonces validara las acciones de relacion de radicaciones al codigo de barras 692626
  #692634
  #692629
