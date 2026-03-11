# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Relación de Nits Asignados

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RelacionDeNitsAsignados @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Relación de Nits Asignados
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Relación de Nits Asignados
    Entonces realizara acciones de Relación de Nits Asignados
