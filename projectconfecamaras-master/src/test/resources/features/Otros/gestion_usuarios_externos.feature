# language: es

Característica: Gestion Usuarios Externos

  @gestionUsuariosExternos @BloqueData2 @general
  Escenario: Gestion Usuarios Externos
    Dado Confecamaras requiere realizar una Gestion Usuarios Externos
    Cuando Confecamaras ingresa a la aplicacion Sii3 con sus credenciales
    Y seleccione Modulo de Registro, Registros publicos admimistracion, Gestion de Usuarios Externos
    Entonces validara que las opciones de busqueda y agregar ususario funcionan correctamente