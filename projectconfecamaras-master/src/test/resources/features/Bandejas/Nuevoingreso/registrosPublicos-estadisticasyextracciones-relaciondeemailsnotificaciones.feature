# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Relación de EMAILs (notificaciones)

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RelaciónDeEmailssnotificaciones @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Relación de EMAILs (notificaciones)
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Relación de EMAILs (notificaciones)
    Entonces realizara acciones Relación de EMAILs notificaciones