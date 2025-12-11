# language: es
Característica: Validar que permita la revision
  de revision Registros Públicos - Administración - zonas y comunas

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Administraciónzonasycomunas
  Escenario: Registros Públicos - Administración - zonas y comunas
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Zonas y comunas
    Entonces realizara acciones de zonas y comunas
