# language: es

Característica: flujo de renovacion agil ESADL

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras agil

  @FlujoRenovacionAgilEsadl @Renovacion @SII4
  Escenario: realizo el flujo de renovacion agil Esadl
    Y ingreso al sistema SII3 como usuario en renovacion agil ESADL
    Cuando realizo el flujo de renovacion agil esadl "30000000"
    Entonces realizo el pago del proceso