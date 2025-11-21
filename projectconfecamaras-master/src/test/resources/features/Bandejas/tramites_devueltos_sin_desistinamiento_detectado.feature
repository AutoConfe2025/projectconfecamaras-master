# language: es
Característica: Validar Proceso tramites devueltos sin destinamineto detectados



  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @TramitesdevueltosSindesitinamientodetectado
  Escenario: Tramites devueltos sin destinamiento detectado
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Tramites Devueltos SIN Desistimiento Decretado
    Entonces validar las acciones de tramites devueltos sin desistimiento detectado con codigo de barras "739281" "06"