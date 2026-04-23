# language: es

Característica: flujo de renovacion persona juridica publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoPersonaJuridicaPublico @RenovacionPublico @Renovacion @SII4
  Escenario: realizp el flujo de validacion para persona juridica publico
    Y ingreso al sistema SII3 como usuario publico externo
    Cuando realizo el flujo de valores sin establecimiento usuario publico "600.000.000" "PERSONA_JURIDICA_EST_CAJA"
    Entonces realizo el flujo persona juridica publico