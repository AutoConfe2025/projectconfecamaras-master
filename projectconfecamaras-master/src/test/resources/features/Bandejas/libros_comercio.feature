# language: es
Característica: Validar caracteristicas de libros de comercio

  @LibrosComercio @BloqueOcho
  Escenario: Validar libros de comercio
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Libros de comercio que abrira una nueva ventana
    Entonces validara las acciones de libros de comercios relacionados al codigo de barras 701377