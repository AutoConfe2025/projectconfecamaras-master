# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  directlinkrenovaciones

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @DirectLinkRenovaciones
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  directlinkrenovaciones
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Direct Link Renovaciones
    Entonces realizara acciones de Direct Link Renovaciones
