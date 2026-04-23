# language: es

Característica: flujo de renovacion persona juridica establecimiento publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoPersonaJuridicaEstablecimientoPublico @RenovacionPublico @SII4
  Escenario: realizo el flujo de validacion para persona juridica establecimiento publico
    Y ingreso al sistema SII3 como usuario publico externo
    Cuando realizo el flujo de valores con establecimiento usuario publico "600.000.000" "PERSONA_JURIDICA_EST_CAJA"
    Entonces realizo el flujo de persona juridica establecimiento publico