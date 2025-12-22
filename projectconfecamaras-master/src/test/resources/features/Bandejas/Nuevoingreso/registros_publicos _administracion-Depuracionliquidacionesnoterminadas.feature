# language: es
Característica: Validar que permita la revision
  de Registros Públicos - Administración - Depuración liquidaciones no terminadas

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @DepuraciónLiquidacionesNoTerminadas
  Escenario: Registros Públicos - Administración - Depuración liquidaciones no terminadas
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Depuración liquidaciones no terminadas
    Entonces realizara acciones de Depuración liquidaciones no terminadas
