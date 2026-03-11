# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Prediligenciados Renovación Reg. Mercantil

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @PrediligenciadosRenovacion @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Prediligenciados Renovación Reg. Mercantil
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Prediligenciados Renovación Reg. Mercantil
    Entonces realizara acciones de Prediligenciados Renovacion
