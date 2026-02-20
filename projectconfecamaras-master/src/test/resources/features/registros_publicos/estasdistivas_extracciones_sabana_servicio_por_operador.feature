# language: es

Característica: revision de flujo de estadisticas y extracciones saba de servicios por operador

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoEstadisticasExtraccionesSabanaServicioPorOperador
  Escenario: valido el flujo de estadisticas y extracciones saba de servicios por operador
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Sábana de servicios por operador"
    Entonces realizo el flujo de validacion de sabana de servicio por operador