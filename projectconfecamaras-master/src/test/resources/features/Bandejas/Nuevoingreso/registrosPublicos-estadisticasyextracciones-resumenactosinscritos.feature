# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones - Resumen actos inscritos

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Resumenactosinscritos
  Escenario:  Registros Públicos - Estadísticas y Extracciones - Resumen actos inscritos
    Y ingreso al sistema SII3 como admin16
    Cuando Buscamos por el boton principal de busqueda la bandeja Resumen actos inscritos
    Entonces realizara acciones de Resumen actos inscritos
