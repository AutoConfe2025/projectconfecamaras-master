# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Informes Contraloria

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @InformesContraloria
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Informes Contraloria
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Informes Contraloria
    Entonces realizara acciones de Informes Contraloria