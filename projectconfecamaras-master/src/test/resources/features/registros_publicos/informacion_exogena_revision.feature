# language: es

Característica: revision de flujo de modulo de registros publicos informacion exogena revision

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoInformacionExogenaRevision
  Escenario: valido el flujo de informeacion exogena revision
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Información Exógena - Revisión"
    Entonces realizo el flujo de informacion exogena revision