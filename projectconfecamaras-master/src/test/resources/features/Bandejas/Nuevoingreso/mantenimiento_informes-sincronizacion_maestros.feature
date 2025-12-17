# language: es
Característica: Validar que permita la revision
  de revision Mantenimiento e informes - sincronizacion maestros (JSP7)

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Mantenimientoeinformessincronizacion_maestros
  Escenario: Mantenimiento e informes sincronizacion maestros
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Sincronización Maestros desde JSP7
    Entonces realizara acciones de sincronizacion maestros
