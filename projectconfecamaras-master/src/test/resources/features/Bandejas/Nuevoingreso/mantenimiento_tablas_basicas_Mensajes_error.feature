# language: es
Característica: Validar que permita la revision
  de revision Mensajes error

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @mantenimiento_tablas_basicas_Mensajes_error @SII4
  Escenario: mantenimiento tablas basicas Mensajes error
    Y ingreso al sistema SII3 como admin16
    Cuando Buscamos por el boton principal de busqueda la bandeja Mensajes error
    Entonces realizara acciones de Mensajes error
