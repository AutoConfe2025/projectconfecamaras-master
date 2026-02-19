# language: es
Característica: Validar que me permita ver
  inscripciones de preponente que no esten en firme

  @InscripcionNoFirme @BloqueOcho @general
  Escenario: Validar Inscripcion no firme
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Inscripcion - No están en Firme que abrira una nueva ventana
    Entonces validara las acciones de inscripcon no firme con el registro 3877