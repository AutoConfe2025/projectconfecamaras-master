# language: es
Característica: Validar Digitacion general



  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @DigitacionGeneral
  Escenario: Digitacion General
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda el elemento Digitacion General
    Entonces validara las acciones de Digitacion General con codigo de barras 739445