# language: es
Característica: Validar que permita la revision
  de revision Maestro de trámites sin costo

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @MaestroDeTramitesSinCosto
  Escenario: Maestro de trámites sin costo
    Y ingreso al sistema SII3 como admin16
    Cuando Buscamos por el boton principal de busqueda la bandeja Maestro de trámites sin costo
    Entonces realizara acciones de Maestro De Tramites Sin Costo
