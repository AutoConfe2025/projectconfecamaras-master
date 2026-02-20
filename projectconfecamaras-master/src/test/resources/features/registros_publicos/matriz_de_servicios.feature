# language: es

Característica: revision de flujo de matriz de servicios

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoMatrizDeServiciosSic
  Escenario: valido el flujo de matriz de servicios
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Matriz de servicios"
    Entonces realizo el flujo de matriz de servicios