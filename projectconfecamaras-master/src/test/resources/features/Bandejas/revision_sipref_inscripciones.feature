# language: es
Característica: Validar que permita

  @RevisionSIPREFInscripciones @BloqueOcho @general
  Escenario: Validar revision de inscripciones
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Revisión SIPREF (Inscripciones) que abrira una nueva ventana
    Entonces realizara las acciones de revision de inscripciones
