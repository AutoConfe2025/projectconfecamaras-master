# language: es

Característica:  Mantenimiento Kardex SII / Mantenimiento Recibo Caja / Mantenimiento Usuarios /
  Mantenimiento Opciones / Mantenimiento Servicios / Mantenimiento Servicios RUES /
  Mantenimiento Tipo de Tramite

  @mantenimientoKardexSII @BloqueUno @general
  Escenario: Mantenimiento Kardex SII
    Dado Confecamaras requiere realizar el Mantenimiento Kardex SII
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Mantenimiento Kardex SII
    Entonces capturara y validara los datos para la prueba


  @mantenimientoReciboCaja @BloqueUno @general
  Escenario: Mantenimiento Recibos de Caja
    Dado Confecamaras requiere realizar el Mantenimiento Recibos de Caja
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Mantenimiento Recibos Caja
    Entonces capturara y validara los datos para la prueba de recibos


  @mantenimientoUsuarios @BloqueUno @general
  Escenario: Mantenimiento Usuarios
    Dado Confecamaras requiere realizar el Mantenimiento de Usuarios
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Parametrizacion ERP, Tablas Basicas, Usuarios
    Entonces comenzara con el mantenimiento de usuarios

    #NP

  @mantenimientoOpciones @BloqueUno @general
  Escenario: Mantenimiento Opciones
    Dado Confecamaras requiere realizar el Mantenimiento Opciones
    Cuando Confecamaras ingresa en la aplicacion con las credenciales de administrador
    Y seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Opciones
    Entonces validara que las opciones funcionen correctamente

  @mantenimientoServicios @BloqueUno @general
  Escenario: Mantenimiento Servicios
    Dado Confecamaras requiere realizar el Mantenimiento Servicios
    Cuando Confecamaras ingresa en la aplicacion con sus credenciales de administrador
    Y seleccione Modulo de Registro, Registros publicos - administracion, Servicios
    Entonces validara que las opciones funcionan correctamente

  @mantenimientoServiciosRues @BloqueUno @general
  Escenario: Mantenimiento Servicios RUES
    Dado Confecamaras requiere realizar el Mantenimiento servicios RUES
    Cuando Confecamaras ingresa en la aplicacion con sus credenciales administrador
    Y seleccione Modulo de Registro, Registros publicos - administracion, Servicios RUES
    Entonces validara que la opcion editar funciona correctamente

  @mantenimientoTipoTramite @BloqueUno @general
  Escenario: Mantenimiento Tipo de Tramite
    Dado Confecamaras requiere realizar el Mantenimiento Tipo de Tramite
    Cuando Confecamaras ingresa en la aplicacion con las credenciales administrador
    Y seleccione Modulo de Registro, Registros publicos - administracion, Tipo de Tramite
    Entonces validara que funciona correctamente
