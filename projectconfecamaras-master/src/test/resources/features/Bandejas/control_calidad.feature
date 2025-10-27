# language: es
Característica: Validar caracteristicas de Control de calidad
  como usuario quiero realizar las acciones disponibles

  @ControlCalidad
  Escenario: Validar el control de calidad
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Control de calidad que abrira una nueva ventana
    Entonces validara las acciones de control de calidad al codigo de barras 692253