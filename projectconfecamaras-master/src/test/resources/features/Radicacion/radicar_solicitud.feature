# language: es

Característica: Radicar Solicitud de cancelacion Reg Mercantil

  @solicitudCancelacionMercantil @BloqueCuatro @general
  Escenario: Radicar Solicitud de cancelacion Reg Mercantil
    Dado Confecamaras requiere radicar la solicitud de cancelacion reg mercantil
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y ingrese el numero de matricula para solicitar la cancelacion
    Entonces podra radicar la solicitud de cancelacion