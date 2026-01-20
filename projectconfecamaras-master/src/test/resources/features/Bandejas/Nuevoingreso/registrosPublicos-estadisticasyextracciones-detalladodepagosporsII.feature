# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Detallado de Pagos por SII

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @DetalladoDePagosPorSII
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Detallado de Pagos por SII
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Detallado de Pagos por SII
    Entonces realizara acciones de Detallado de Pagos por SII
