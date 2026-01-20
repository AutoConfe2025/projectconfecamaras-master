# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  InformaciónExógena - XML

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @InformacionExogenaXML
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  InformaciónExógena - XML
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Información Exógena - XML
    Entonces realizara acciones de Información Exógena-XML
