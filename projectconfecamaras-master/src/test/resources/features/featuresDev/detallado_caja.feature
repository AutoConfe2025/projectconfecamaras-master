# language: es

Característica: Detallado de Caja

  @detalladoCaja @BloqueUno @general
  Escenario: Detallado de Caja
    Dado Confecamaras requiere consultar el Detallado de Caja
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Integracion ERP RUES CFE, Mantenimiento e Informes, Detallado de Caja por Cajero
    Entonces podra consultar el Detallado de Caja por Cajero con los siguientes datos