# language: es

Característica: Mantenimiento Usuarios Ws / Permisos Especiales /
  Mantenimientos Alertas Administrativas / Mantenimientos Alertas Registro / Firmas Digitales

  @mantenimientoUsuariosWs @BloqueCuatro @ConDataDevUnoUno @general
  Escenario: Mantenimiento Usuarios Ws
    Dado Confecamaras requiere realizar el mantenimiento usuarios ws
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione ASEGURAMIENTO DEL S.I.I Mantenimiento del sii
    Entonces realizara el mantenimiento de usuarios ws

  @permisosEspeciales @BloqueCuatro @ConDataDevUnoUno @general
  Escenario: Permisos Especiales
    Dado Confecamaras requiere realizar permisos especiales
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione PARAMETRIZACION ERP Mantenimiento tablas básicas
    Entonces realizara permisos especiales

  @mantenimientoAlertAdmin @BloqueCuatro @ConDataDevUnoUno @general
  Escenario: Mantenimientos Alertas Administrativas
    Dado Confecamaras requiere realizar el mantenimiento de alertas administrativas
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara el mantenimiento alertas administrativas

  @mantenimientoAlertRegistro @BloqueCuatro @ConDataDevUnoUno @general
  Escenario: Mantenimientos Alertas Registro
    Dado Confecamaras requiere realizar el mantenimiento de alertas registro
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara el mantenimiento alertas registro

  @firmasDigitales @BloqueUno @general
  Escenario: Firmas Digitales
    Dado Confecamaras requiere realizar firmas digitales
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara firmas digitales