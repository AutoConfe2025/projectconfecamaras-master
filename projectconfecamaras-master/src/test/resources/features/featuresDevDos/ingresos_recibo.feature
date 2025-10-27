# language: es

Característica: Ingresos por Recibo

  @ingresosRecibo @BloqueDos @general
  Escenario: Ingresos por Recibo
    Dado Confecamaras requiere realizar los Ingresos por Recibo
    Cuando ingresa en la aplicacion web Sii3 con las credenciales correctas
    Y seleccione Integracion ERP RUES CFE, Mantenimiento e Informes, Ingresos por Recibo
    Entonces validara que se genera la Relacion de movimientos por recibo