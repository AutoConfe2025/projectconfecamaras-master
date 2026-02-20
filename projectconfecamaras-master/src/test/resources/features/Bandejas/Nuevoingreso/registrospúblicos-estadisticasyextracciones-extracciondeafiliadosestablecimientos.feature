# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Extracción de Afiliados Establecimientos

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @ExtraccióndeAfiliadosEstablecimientos @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Extracción de Afiliados Establecimientos
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Extracción de Afiliados Establecimientos
    Entonces realizara acciones de Extraccion de Afiliados Establecimientos
