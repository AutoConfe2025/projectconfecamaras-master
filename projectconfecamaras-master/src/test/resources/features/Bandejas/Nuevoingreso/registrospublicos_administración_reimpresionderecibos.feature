# language: es
Característica: Validar que permita la revision
  de Registros Públicos - Administración - Reimpresión de Recibos

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @administracion_ReimpresiondeRecibos  @SII4
  Escenario: Registros Públicos - Administración - Reimpresión de Recibos
    Y ingreso al sistema SII3 como admin16
    Cuando query para traer datos numOperacion numRecibo
    Cuando Buscamos por el boton principal de busqueda la bandeja Reimpresión de Recibos
    Entonces realizara acciones de Reimpresion de Recibos
