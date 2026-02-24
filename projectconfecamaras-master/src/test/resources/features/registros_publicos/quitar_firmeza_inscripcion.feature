# language: es

Característica: revision de flujo de Quitar firmeza inscripción

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoQuitarFirmezaInscripcion @SII4
  Escenario: valido el flujo de Quitar firmeza inscripción
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Quitar firmeza inscripción"
    Entonces reealizo el flujo de quitar firmeza inscripcion