# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Relación de desistimientos

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RelacionDeDesistimientos
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Relación de desistimientos
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Relación de desistimientos
    Entonces realizara acciones de Relación de desistimientos
