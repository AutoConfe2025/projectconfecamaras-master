# language: es

Característica: flujo de renovacion agil PJ

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras agil

  @FlujoRenovacionAgilPj @Renovacion @SII4
  Escenario: realizo el flujo de renovacion agil PJ
    Y ingreso al sistema SII3 como usuario en renovacion agil pj
    Cuando realizo el flujo de renovacion agil pj "2.000.000.000"
    Entonces realizo el proceso de pago agil pj