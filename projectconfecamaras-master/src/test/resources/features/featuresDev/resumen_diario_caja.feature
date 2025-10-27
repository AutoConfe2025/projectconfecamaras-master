# language: es

Característica: Resumen Diario de Caja

  @resumenCaja @BloqueCuatro @general
  Escenario: Resumen Diario de Caja
    Dado Confecamaras requiere consultar el Resumen diario de Caja
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Integracion ERP RUES CFE, Mantenimiento e Informes, Resumen Diario de Caja
    Entonces podra consultar el Resumen Diario de Caja
    Y descargar el resumen