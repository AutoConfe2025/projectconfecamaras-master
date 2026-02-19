# language: es

Característica: revision de gestion de caja informe diario de caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoModuloInformeDiarioDeCaja @sii4
  Escenario: valido el flujo de informe diario de caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Informe diario de caja"
    Entonces realizo las validaciones sobre el modulo de informe diario de caja "Informe diario de caja"