# language: es

Característica: revision de flujo de relacion de devoluciones (SII)

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRelacionDeDevolucionesSII @SII4
  Escenario: valido el flujo de relacion de devoluciones (SII)
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Relación de devoluciones (SII)"
    Entonces hago el flujo de relacion de devoluciones