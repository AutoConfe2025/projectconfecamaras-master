# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Gestión de caja - Detallado de Impuesto de Registro

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @DetalladodeImpuestodeRegistro @SII4
  Escenario:  Registros Públicos - Gestión de caja - Detallado de Impuesto de Registro
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Detallado de Impuesto de Registro" seleccionada "Detallado de Impuesto de Registro" "2"
    Entonces realizara acciones de Detallado de Impuesto de Registro
