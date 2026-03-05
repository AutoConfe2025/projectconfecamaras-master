# language: es

Característica: Radicar Deposito de estados financieros

  @DepositoEstadosFinancieros @BloqueTres @general
  Escenario: Radicar Deposito de estados financieros
    Dado Confecamaras requiere Radicar Deposito de estados financieros
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y seleccione Consultas y Transacciones, Tramites registros publicos, Deposito de estados financieros
    Entonces validara que se realizo el deposito de estados financieros de manera exitosa