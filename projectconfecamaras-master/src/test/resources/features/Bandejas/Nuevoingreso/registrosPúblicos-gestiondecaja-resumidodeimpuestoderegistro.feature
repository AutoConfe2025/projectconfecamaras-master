# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Gestión de caja - Resumido de Impuesto de Registro

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @ResumidodeImpuestodeRegistro
  Escenario:  Registros Públicos - Gestión de caja -  Resumido de Impuesto de Registro
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Resumido de Impuesto de Registro
    Entonces realizara acciones de Resumido de Impuesto de Registro
