# language: es

Característica: Mantenimiento Tabla de Retencion Documental / Mantenimiento Salarios Minimos Mensuales /
  Mantenimiento Tarifas / Mantenimiento Maestro de tramites sin costo / Mantenimiento Kardex Proponentes

  @mantenimientoTablaRetencion @BloqueUno @general
  Escenario: Mantenimiento Tabla de Retencion Documental
    Dado Confecamaras requiere realizar el mantenimiento tabla de retencion documental
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Tabla de Retencion Documental
    Entonces realizara el mantenimiento de tabla de retencion documental

  @mantenimientoSalariosMM @BloqueUno @general
  Escenario: Mantenimiento Salarios Minimos Mensuales
    Dado Confecamaras requiere realizar el mantenimiento salarios minimos mensuales
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Salarios Minimos Mensuales
    Entonces podra realizar el mantenimiento salarios minimos mensuales

  @mantenimientoTarifas @BloqueUno @general
  Escenario: Mantenimiento Tarifas
    Dado Confecamaras requiere realizar el mantenimiento de tarifas
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion, Tarifas
    Entonces podra realizar el mantenimiento de tarifas

  @mantenimientoMaestro @BloqueUno @general
  Escenario: Mantenimiento Maestro de tramites sin costo
    Dado Confecamaras requiere realizar el mantenimiento maestro de tramites sin costo
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion, Maestro de tramites sin costo
    Entonces podra realizar el mantenimiento de maestro de tramites sin costo

  @mantenimientoKardexPro @BloqueUno @general
  Escenario: Mantenimiento Kardex Proponentes
    Dado Confecamaras requiere realizar el mantenimiento de kardex proponentes
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales admin
    Y seleccione Modulo de Registro, Registros Publicos, Administracion, Mantenimiento Kardex Proponentes
    Entonces podra realizar el mantenimiento kardex proponentes