# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Gestión de caja - Generar clave prepago

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @GenerarClavePrepago
  Escenario:  Registros Públicos - Gestión de caja -  Genera clave prepago
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Genera clave prepago
    Entonces realizara acciones de Genera clave prepago
