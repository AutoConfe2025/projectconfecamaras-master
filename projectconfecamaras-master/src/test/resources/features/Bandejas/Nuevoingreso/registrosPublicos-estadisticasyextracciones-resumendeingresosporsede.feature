# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones - Resumen de Ingresos por sede

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @ResumendeIngresosPorSede
  Escenario:  Registros Públicos - Estadísticas y Extracciones - Resumen de Ingresos por sede
    Y ingreso al sistema SII3 como admin16
    Cuando Buscamos por el boton principal de busqueda la bandeja Resumen de Ingresos por sede
    Entonces realizara acciones de Resumen de Ingresos por sede
