# language: es
Característica: Validar Correcciones



  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Correcciones @SII4
  Escenario: correcciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Correcciones
    Entonces validar las acciones de correcciones con codigo de barras "739454" "23"