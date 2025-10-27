# language: es
Característica: Validar caracteristicas de Tramites no archivados
  como usuario quiero realizar las acciones disponibles

  @TramitesNoArchivados
  Escenario: Validar tramites no archivados
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Trámites no Archivados que abrira una nueva ventana
    Entonces validara las acciones de tramites no archivados relacionados al codigo de barras 692102