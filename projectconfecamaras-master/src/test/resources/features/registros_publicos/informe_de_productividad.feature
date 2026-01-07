# language: es

Característica: revision de flujo de informe de productividad

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoInformeProductividad
  Escenario: valido el flujo de informe de productividad
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Informe de productividad"
    Entonces realizo el flujo de informe de productividad