# language: es
Característica: Validar que me permita ver
  inscripciones de preponente que no esten en firme

  @MantenimientoCommon @BloqueOcho @general
  Escenario: Inscripcion no firme
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | admin    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Mantenimiento Common que abrira una nueva ventana
    Entonces validara la existencia de los titulos de cada seccion