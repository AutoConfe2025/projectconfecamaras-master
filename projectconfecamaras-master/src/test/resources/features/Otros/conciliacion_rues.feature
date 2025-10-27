# language: es

Característica: Conciliacion RUES

  @conciliacionRues @BloqueDos @general
  Escenario: Conciliacion RUES
    Dado Confecamaras requiere realizar la Conciliacion RUES
    Cuando ingresa sus credenciales en la aplicacion SII3
    Y seleccione Integracion ERP RUES CFE, Mantenimiento e Informes, Conciliacion RUES
    Entonces validara que las opciones de exportar funcionan correctamente