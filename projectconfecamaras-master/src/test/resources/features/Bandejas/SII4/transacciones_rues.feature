# language: es
Característica: Validar que permita la revision
  de revision transacciones rues

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Transacciones_Rues
  Escenario: Transacciones Rues
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Transacciones RUES
    Entonces realizara acciones de Transacciones Rues
