# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Comparativo Renovaciones

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @ComparativoRenovaciones @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Comparativo Renovaciones
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Comparativo Renovaciones
    Entonces realizara acciones de Comparativo Renovaciones