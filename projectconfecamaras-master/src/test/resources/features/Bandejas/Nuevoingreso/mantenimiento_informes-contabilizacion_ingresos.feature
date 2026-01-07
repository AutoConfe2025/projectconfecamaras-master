# language: es
Característica: Validar que permita la revision
  de revision Mantenimiento e informes - Contabilización Ingresos (JSP7)

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @MantenimientoeinformesContabilizaciónIngresos
  Escenario: Mantenimiento e informes Contabilización Ingresos
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Contabilización Ingresos (JSP7)
    Entonces realizara acciones de contabilizacion ingresos
