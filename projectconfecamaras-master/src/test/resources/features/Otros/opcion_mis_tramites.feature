# language: es

Característica: Opcion Mis Tramites Usuario Cajero / Opcion Mis Tramites Usuario Externo

  @opcionMisTramitesUsuarioCajero @BloqueTres @general
  Escenario: Opcion Mis Tramites Usuario Cajero
    Dado Confecamaras requiere realizar la Opcion Mis Tramites Usuario Cajero
    Cuando ingresa las credenciales de usuario cajero en la aplicacion SII3
    Y busque una sociedad para realizar una inscripcion de documentos
    Entonces validara que las opciones me permiten ver la ruta del documento y finalizar su digitalizacion

  @opcionMisTramitesUsuarioExterno @BloqueTres @general
  Escenario: Opcion Mis Tramites Usuario Externo
    Dado Confecamaras requiere realizar la Opcion Mis Tramites Usuario Externo
    Cuando ingresa sus credenciales de usuario externo en la aplicacion SII3
    Y busque una matricula para realizar una actualizacion de datos mutacion
    Entonces validara que la opcion mis tramites me permite continuar con la mutacion