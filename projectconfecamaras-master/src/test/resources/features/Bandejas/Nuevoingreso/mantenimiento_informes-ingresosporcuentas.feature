# language: es
Característica: Validar que permita la revision
  de revision Mantenimiento e informes - Ingresos por Cuentas

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @MantenimientoeinformesingresosCuentas @SII4
  Escenario: Mantenimiento e informes ingresos por cuentas
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Ingresos por Cuenta
    Entonces realizara acciones de Ingresos por cuentas
