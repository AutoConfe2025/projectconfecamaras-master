# language: es
Característica: Validar que permita revisar los expedientes


  @ExpedientesRevision @BloqueOcho @general
  Escenario: Validar los expedientes en revision
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Expedientes en revisión que abrira una nueva ventana
    Entonces realizara las acciones que se encuentran disponibles