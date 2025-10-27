# language: es

Característica: Reasignacion Codigo Barras

  @codigoBarras @BloqueData @general
  Escenario: Reasignacion Codigo de Barras
    Dado Confecamaras requiere reasignar el codigo de barras
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Digitacion
    Entonces ingresara el codigo de barras y completara los campos solicitados
    Y validara que se haya realizado correctamente la reasignacion del codigo de barras