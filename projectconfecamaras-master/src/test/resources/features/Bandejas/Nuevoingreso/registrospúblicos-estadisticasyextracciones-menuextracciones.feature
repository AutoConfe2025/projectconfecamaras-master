# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones - Menú extracciones

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @MenuExtracciones
  Escenario:  Registros Públicos - Estadísticas y Extracciones - Menú extracciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Menú extracciones
    Entonces realizara acciones de Resumido de Menu extracciones
