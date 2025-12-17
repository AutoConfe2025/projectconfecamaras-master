# language: es
Característica: Validar Proceso de PQR



  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @PQR
  Escenario: Pqr
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja PQRs
    Entonces validara las acciones de PQR con codigo de barras "739027" "01"