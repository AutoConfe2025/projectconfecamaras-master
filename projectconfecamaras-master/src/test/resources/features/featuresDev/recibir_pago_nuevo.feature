# language: es

Característica: Recibir Pago Nuevo

  @recibirPagoNuevo @BloqueData @general
  Escenario: Recibir Pago Nuevo
    Dado Confecamaras requiere realizar recibir pago nuevo
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Gestion de Caja
    Entonces podra realizar la accion de recibir pago nuevo