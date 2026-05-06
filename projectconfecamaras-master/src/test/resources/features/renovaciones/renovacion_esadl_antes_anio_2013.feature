# language: es

Característica: flujo de renovacion antes del año 2013

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionAntesDe2013 @Renovacion @SII4 @debug
  Escenario: realizo el flujo de renovacion antes del año 2013
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso al modulo con matricula "S0016562"
    Entonces realizo el proceso de validacion del modulo a renovar