# language: es

Característica: Desbloquear liquidacion (Pago en Caja) / Desbloquear liquidacion (en Pago Electronico) /
  Desbloquear liquidacion (en Firmado Electronico) / Desbloquear liquidacion (Formulario Final)

  @pagoCaja @BloqueData @general
  Escenario: Desbloquear liquidacion (Pago en Caja)
    Dado Confecamaras se encuentra en el aplicativo ConfecamaraSII
    Cuando el usuario ingresa el numero de recuperacion de la liquidacion pago en caja
    Entonces podra validar su correcta activacion en pago en caja

  @pagoElectronico @BloqueData @general
  Escenario: Desbloquear liquidacion (en Pago Electronico)
    Dado Confecamaras requiere Desbloquear liquidacion Pago Electronico
    Cuando el usuario ingresa el numero de recuperacion de la liquidacion en pago electronico
    Entonces podra validar su correcta activacion en pago electronico

  @firmadoElectronico @BloqueData @general
  Escenario: Desbloquear liquidacion (en Firmado Electronico)
    Dado Confecamaras requiere Desbloquear liquidacion Firmado Electronico
    Cuando el usuario ingresa el numero de recuperacion de la liquidacion en firmado electronico
    Entonces podra validar su correcta activacion en firmado electronico

  @formularioFinal @BloqueData @general
  Escenario: Desbloquear liquidacion (Formulario Final)
    Dado Confecamaras requiere Desbloquear liquidacion Formulario Final
    Cuando el usuario ingresa el numero de recuperacion de la liquidacion formulario final
    Entonces podra validar su correcta activacion en formulario final