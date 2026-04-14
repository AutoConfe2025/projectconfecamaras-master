# language: es

Característica: flujo de renovacion matricula renovacion con ley 1780 renuncia

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionLey1780Renuncia @Renovacion @SII4
  Escenario: realizo el flujo de renovacion de ley 1780 renuncia
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores ley 1780 renuncia "RENOVACION_1780_CUMPLE"
    Entonces realizjo el flujo de renovacion con ley 1780 renuncia