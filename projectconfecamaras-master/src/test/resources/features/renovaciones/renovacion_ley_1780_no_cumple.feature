# language: es

Característica: flujo de renovacion matricula renovacion con ley 1780 no cumple

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @RenovacionLey1780NoCumple @Renovacion @SII4
  Escenario: realizo el flujo renovacion con ley 1780 no cumple
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores ley 1780 no cumple "RENOVACION_1780_NO_CUMPLE" "20.0000.000"
    Entonces realizjo el flujo de renovacion con ley 1780 no cumple