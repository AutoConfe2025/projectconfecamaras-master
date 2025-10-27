# language: es

Característica: Renovacion Persona Natural con Establecimiento / Renovacion PN Establecimiento Usuario Externo

  @renovacionPersonaNaturalEstablecimiento @BloqueData2 @general @renovacionMercantil
  Escenario: Renovacion Persona Natural con Establecimiento
    Dado Confecamaras requiere realizar la Renovacion de Persona Natural con Establecimiento
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione la consulta e ingrese el numero de matricula comenzara la renovacion
    Entonces finalizando la prueba validara el resultado

  @renovacionPNEstUsuarioExterno @BloqueData2 @general @renovacionMercantil
  Escenario: Renovacion PN Establecimiento Usuario Externo
    Dado Confecamaras requiere realizar la Renovacion PN Establecimiento Usuario Externo
    Cuando Confecamaras usa las credenciales de usuario externo para ingresar en la aplicacion
    Y seleccione Renovar matricula mercantil e ingrese el numero de matricula
    Entonces validara que la renovacion pn establecimiento usuario externo se realizo de manera exitosa