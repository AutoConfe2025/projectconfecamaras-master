# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones - Estadísticas por Servicio (Virtual)

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @EstadísticasPorServicioVirtual
  Escenario:  Registros Públicos - Estadísticas y Extracciones - Resumen de Ingresos por sede
    Y ingreso al sistema SII3 como admin16
    Cuando Buscamos por el boton principal de busqueda la bandeja Estadísticas por Servicio (Virtual)
    Entonces realizara acciones de Estadísticas por Servicio Virtual
