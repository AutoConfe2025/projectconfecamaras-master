# language: es

Característica: flujo de renovacion matricula actividad no comercial

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaActividadNoComercial @Renovacion @SII4
  Escenario: realizo el flujo de matricula actividad no comercial
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores actividad no comercial "ACTIVIDAD_NO_COMERCIAL_"
    Entonces valido que se realice el pago del proceso de renovacion comercial