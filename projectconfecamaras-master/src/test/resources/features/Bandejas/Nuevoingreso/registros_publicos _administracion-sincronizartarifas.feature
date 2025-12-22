# language: es
Característica: Validar que permita la revision
  de Registros Públicos - Administración - Sincronizar tarifas

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @SincronizarTarifas
  Escenario: Registros Públicos - Administración - Sincronizar tarifas
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Sincronizar tarifas
    Entonces realizara acciones de  Sincronizar Tarifas
