# language: es

Característica: flujo de renovacion persona natural establecimiento publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionPersonaNatrualEstablecimientoPublico @RenovacionPublico @SII4
  Escenario: realizo el flujo de renovacion persona natural establecimiento publico
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores usuario publico "21.000.000" "PERSONA_NATURAL_EST_CAJA"
    Entonces realizo el flujo de persona natural con establecimiento
