# language: es

Característica: revision de flujo de informe sic

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoInformeSic @SII4
  Escenario: valido el flujo de informe sic
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Informes SIC"
    Entonces realizo el proceso de informes SIC