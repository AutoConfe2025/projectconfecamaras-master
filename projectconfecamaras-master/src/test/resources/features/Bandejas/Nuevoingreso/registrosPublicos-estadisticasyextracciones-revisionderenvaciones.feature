# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Revisión de Renovaciones

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RevisiondeRenvaciones
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Revisión de Renovaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Revisión de Renovaciones
    Entonces realizara acciones de Revision de Renvaciones