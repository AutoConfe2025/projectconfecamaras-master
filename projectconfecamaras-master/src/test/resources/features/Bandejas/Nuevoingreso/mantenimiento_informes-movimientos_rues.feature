# language: es
Característica: Validar que permita la revision
  de revision Mantenimiento e informes - Movimientos RUES

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @MantenimientoeinformesmovimientosRUES @SII4
  Escenario: Mantenimiento e informes movimientos RUES
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Movimiento RUES
    Entonces realizara acciones de movimiento Rues
