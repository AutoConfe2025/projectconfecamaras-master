# language: es

Característica: revision de flujo de modulo de Regenerar soportes (Bloque)

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRegenerarSoporteBloque
  Escenario: valido el flujo de Regenerar soportes (Bloque)
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Regenerar soportes (Bloque)"
    Entonces realizo el flujo de regenerar soportes bloque