# language: es
Característica: Validar que permita la revision
  de revision Mantenimiento e informes - migracion de activoss (JSP7)

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Mantenimientoeinformesmigraciondeactivos
  Escenario: Mantenimiento e informes migraciondeactivos
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Migración de Activos a JSP7
    Entonces realizara acciones de migracion de activos
