# language: es

Característica: revision de flujo de resumen de ingresos por fecha y sede

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoResumenIngresosPorFechaSede @SII4
  Escenario: valido el flujo de resumen de ingresos por fecha y sede
    Y ingreso al sistema SII3 como usuario publico16
    Cuando ingreso solo bandeja "Resumen de Ingresos Fecha y Sede"
    Entonces realizo el flujo de resumen de ingresos