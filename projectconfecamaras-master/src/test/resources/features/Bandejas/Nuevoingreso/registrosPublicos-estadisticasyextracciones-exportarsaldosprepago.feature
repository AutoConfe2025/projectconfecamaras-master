# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Exportar Saldos Prepago

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @ExportarSaldosPrepago @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Exportar Saldos Prepago
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Exportar Saldos Prepago
    Entonces realizara acciones de Exportar Saldos Prepago