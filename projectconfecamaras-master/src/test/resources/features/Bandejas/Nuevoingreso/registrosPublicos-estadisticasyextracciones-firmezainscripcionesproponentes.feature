# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Firmeza Inscripciones Proponentes

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @PonerEnFirme
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Firmeza Inscripciones Proponentes
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Firmeza Inscripciones Proponentes
    Entonces realizara acciones de Firmeza Inscripciones Proponentes
