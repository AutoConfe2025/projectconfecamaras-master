# language: es

Característica: Reversion Parcial

  @reversionParcial @BloqueData3 @general
  Escenario: Reversion Parcial
    Dado Confecamaras requiere realizar la Reversion Parcial
    Cuando ingresa las credenciales en la aplicacion SII3
    Y seleccione Integracion ERP RUES CFE, Mantenimiento e Informes, Reversion parcial
    Entonces validara que las opciones permiten realizar las funciones de reversar, editar y asignar