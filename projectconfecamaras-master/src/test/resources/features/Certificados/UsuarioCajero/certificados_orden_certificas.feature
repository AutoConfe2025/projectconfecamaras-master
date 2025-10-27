# language: es

Característica: Certificados Orden Certificas

  # @certificadosOrdenCertificas
  Escenario: Certificados Orden Certificas
    Dado Confecamaras requiere realizar los Certificados Orden Certificas
    Cuando ingresa a la aplicacion Sii3 con las credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos administracion, Modulos API de Integracion Rest Full
    Entonces validara que la activacion e inactivacion se realizo correctamente