# language: es

Característica: Liquidacion renovacion con ley 1780 - básico

  @RenovacionLiquidacionLey1780 @BloqueData2 @general
  Escenario: Liquidacion renovacion con ley 1780
    Dado Confecamaras requiere liquidacion renovacion
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y haga la liquidacion
    Entonces debera ver el recibo con las generalidades