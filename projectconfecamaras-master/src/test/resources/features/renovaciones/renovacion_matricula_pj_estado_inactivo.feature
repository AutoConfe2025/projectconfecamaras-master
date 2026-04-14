# language: es

Característica: flujo de renovacion matricula persona juridica estado inactivo

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaPersonaJuridicaEstadoInactivo @Renovacion @SII4
  Escenario: realizo el flujo de matricula persona juridica estado inactivo
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores estado inactivo juridica "INACTIVA_PERSONA_JURIDICA"
    Entonces valido la matricula en estado inactivo