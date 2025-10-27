# language: es

Característica: Liquidar renovacion Simulador

  @liquidarRenovacionSimulador @BloqueDos @general
  Escenario: Liquidar renovacion Simulador
    Dado Confecamaras requiere realizar Liquidar renovacion Simulador
    Cuando Confecamaras ingresa a la aplicacion Sii3 con sus credenciales asignadas
    Y seleccione Consultas y Transacciones, Consultas Registros Publicos, Liquidacion Renovacion Simulador
    Entonces validara que aparece el total de la preliquidacion

