# language: es
Característica: Validar que permita la revision
  de revision Mantenimiento cajas basicas - Calendario

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Mantenimientocajasbasicas_calendario @SII4
  Escenario: Mantenimiento e informes Calendario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Calendario
    Entonces realizara acciones de Calendario
