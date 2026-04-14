# language: es

Característica: flujo de renovacion matricula persona natural estado inactivo

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaPersonaNaturalEstadoInactivo @Renovacion @SII4
  Escenario: realizo el flujo de matricula persona natural estado inactivo
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores estado inactivo natural "INACTIVA_PERSONA_NATURAL"
    Entonces valido la matricula en estado inactivo