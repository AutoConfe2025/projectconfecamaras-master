# language: es

Característica: revision de flujo de modulo de Soportes de Caja (Unitarios)

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoSoportesDeCaja @SII4
  Escenario: valido el flujo de Soportes de Caja (Unitarios)
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Soportes de Caja (Unitarios)"
    Entonces realizo el flujo de soportes de caja