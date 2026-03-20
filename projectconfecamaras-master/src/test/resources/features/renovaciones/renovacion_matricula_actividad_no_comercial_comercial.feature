# language: es

Característica: flujo de renovacion matricula actividad no comercial, Comercial

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaActividadNoComercialComercial @SII4
  Escenario: realizo el flujo de matricula actividad no comercial, comercial
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores actividad no comercial
    Entonces valido que se realice el pago del proceso de renovacion