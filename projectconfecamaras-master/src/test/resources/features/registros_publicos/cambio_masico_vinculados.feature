# language: es

Característica: revision de flujo de modulo de cambio maviso vinculados

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoCambioMasivoVinculados
  Escenario: valido el flujo de cambio masivo vinculados
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Cambio masivo vinculados"
    Entonces realizo el flujo de cambio masivo de vinculados