# language: es

Característica: Mantenimiento Secuencias / Mantenimiento Motivos Reimpresion /
  Mantenimiento Maestro Certificas / Mantenimiento Maestro Tipo Tramites Devoluciones / Mantenimiento Maestro Identificadores

  @mantenimientoSecuencias @BloqueUno @general
  Escenario: Mantenimiento Secuencias
    Dado Confecamaras requiere realizar el mantenimiento secuencias
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara el mantenimiento secuencias

  @mantenimientoMotivosReimpresion @BloqueUno @general
  Escenario: Mantenimiento Motivos Reimpresion
    Dado Confecamaras requiere realizar el mantenimiento motivos reimpresion
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara el mantenimiento motivos reimpresion

  @mantenimientoCertificas @BloqueUno @general
  Escenario: Mantenimiento Maestro Certificas
    Dado Confecamaras requiere realizar el mantenimiento maestro certificas
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara el mantenimiento maestro certificas

  @mantenimientoTipoTramitesDev @BloqueUno @general
  Escenario: Mantenimiento Maestro Tipo Tramites Devoluciones
    Dado Confecamaras requiere realizar el mantenimiento maestro tipo tramites devoluciones
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara el mantenimiento tipo tramites devoluciones

  @mantenimientoMaestroIdent @BloqueUno @general
  Escenario: Mantenimiento Maestro Identificadores
    Dado Confecamaras requiere realizar el mantenimiento maestro identificadores
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces realizara el mantenimiento de maestro identificadores