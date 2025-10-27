# language: es
Característica: Validar caracteristicas de Tramites devueltos
  como usuario quiero realizar las acciones disponibles

  @TramitesDevueltos
  Escenario: Validar tramites devueltos
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Trámites Devueltos que abrira una nueva ventana
    Entonces validara las acciones de tramites devueltos relacionados al codigo de barras 687673