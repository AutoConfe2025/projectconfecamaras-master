# language: es

Característica: Mantenimiento Maestro Transacciones Registro / Mantenimiento Tablas Codigos  /
  Mantenimiento Sedes / Mantenimiento Actos / Mantenimiento Jurisdiccion

  @mantenimientoTransaccionesRegistro @BloqueUno @general
  Escenario: Mantenimiento Maestro Transacciones Registro
    Dado Confecamaras requiere realizar el mantenimiento maestro transacciones registro
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Administracion Maestro Transacciones Registro
    Entonces realizara el mantenimiento maestro transacciones registro

  @mantenimientoTablasCodigos @BloqueUno @general
  Escenario: Mantenimiento Tablas Codigos
    Dado Confecamaras requiere realizar el mantenimiento de tablas codigos
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion Tablas Codigos
    Entonces realizara el mantenimiento de tabla codigos

  @mantenimientoSedes @BloqueUno @general
  Escenario: Mantenimiento Sedes
    Dado Confecamaras requiere realizar el mantenimiento de sedes
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion Sedes
    Entonces realizara el mantenimiento sedes

  @mantenimientoActos @BloqueUno @general
  Escenario: Mantenimiento Actos
    Dado Confecamaras requiere realizar el mantenimiento de actos
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion Actos
    Entonces realizara el mantenimiento actos

  @mantenimientoJurisdiccion @BloqueUno @general
  Escenario: Mantenimiento Jurisdiccion
    Dado Confecamaras requiere realizar el mantenimiento de jurisdiccion
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion Municipios Jurisdiccion
    Entonces realizara el mantenimiento jurisdiccion

  @mantenimientoTiposComentarios @BloqueUno @general
  Escenario: Mantenimiento Tipos Comentarios
    Dado Confecamaras requiere realizar el mantenimiento de tipos comentarios
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Administracion Tipos de Comentarios
    Entonces realizara el mantenimiento de tipos comentarios