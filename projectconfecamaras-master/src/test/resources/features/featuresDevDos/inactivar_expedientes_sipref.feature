# language: es

Característica: Inactivar expedientes SIPREF

  @inactivarExpedientesSipref @BloqueDos @general
  Escenario: Inactivar expedientes SIPREF
    Dado Confecamaras requiere Inactivar expedientes SIPREF
    Cuando ingresa en la aplicacion Sii3 con las credenciales
    Y seleccione Modulo de Registro, Procesos sipref gobernabilidad, Inactivar expedientes sipref
    Entonces validara que la inactivacion se realizo correctamente