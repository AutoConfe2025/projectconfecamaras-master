# language: es
Característica: Validar tramite con desistimiento sin archivar
  como usuario quiero realizar las acciones disponibles

  @DesistimientoSinArchivar @BloqueOcho @general
  Escenario: Validar desistimiento sin archivar
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Trámite con Desistimiento Sin Archivar que abrira una nueva ventana
    Entonces validara las acciones de desistimiento sin archivar relacionados al codigo de barras 567377