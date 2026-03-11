# language: es

Característica: revision de flujo de estadisticas y extracciones por servicio

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoEstadisticaPorServicios @SII4
  Escenario: valido el flujo de estadisticas por servicios
    Y ingreso al sistema SII3 como usuario publico16
    Cuando ingreso solo bandeja "Estadísticas por Servicio"
    Entonces realizo el flujo de estadistivas por servicio