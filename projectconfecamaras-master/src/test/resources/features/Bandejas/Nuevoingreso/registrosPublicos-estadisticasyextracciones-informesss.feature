# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Informes SS

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @InformesSS @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Informes SS
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Informes SS
    Entonces realizara acciones de Informes SS
