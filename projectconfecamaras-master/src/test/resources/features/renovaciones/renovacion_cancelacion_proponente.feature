# language: es

Característica: flujo de actualizacion proponente

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoActualizacionProponente #@Renovacion @SII4
  Escenario: realizo el flujo de renovacion actualizacion de Proponente
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso al modulo de cancelacion "ACTUALIZACION_PROPONENTES"
    Entonces realizo el proceso de cancelacion de proponente