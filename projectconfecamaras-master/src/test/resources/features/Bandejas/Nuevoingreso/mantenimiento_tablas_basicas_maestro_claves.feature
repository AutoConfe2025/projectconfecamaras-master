# language: es
Característica: Validar que permita la revision
  de revision transacciones rues

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @mantenimiento_tablas_basicas_maestro_claves
  Escenario: mantenimiento_tablas_basicas_maestro_claves
    Y ingreso al sistema SII3 como admin16
    Cuando Buscamos por el boton principal de busqueda la bandeja Opciones
    Entonces realizara acciones de Maestro de Claves
