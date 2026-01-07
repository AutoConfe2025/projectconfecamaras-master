# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Gestión de caja - Detallado de Impuesto de Registro

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @DetalladodeImpuestodeRegistro
  Escenario:  Registros Públicos - Gestión de caja - Detallado de Impuesto de Registro
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Detallado de impuesto de registro
    Entonces realizara acciones de Detallado de Impuesto de Registro
