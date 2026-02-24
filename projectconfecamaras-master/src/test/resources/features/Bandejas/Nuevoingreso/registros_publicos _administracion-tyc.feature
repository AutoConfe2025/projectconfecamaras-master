# language: es
Característica: Validar que permita la revision
  de revision Mantenimiento e informes - Movimientos RUES

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @AdministraciónTYC @SII4
  Escenario: Registros Públicos - Administración - T Y C
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja T y C
    Entonces realizara acciones de T Y C
