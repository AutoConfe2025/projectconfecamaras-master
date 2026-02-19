# language: es
Característica: Validar Proceso de compraventas



  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Compraventas @SII4
  Escenario: Compraventas
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Compraventas
    Entonces validara las acciones de compraventas con codigo de barras "739455" "04"