# language: es

Característica: flujo de actualizacion proponente

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoActualizacionProponente #@Renovacion @SII4
  Escenario: realizo el flujo de renovacion actualizacion de Proponente
    Y ingreso al sistema SII3 como usuario publico
    Entonces ingreso al modulo de actualizacion "ACTUALIZACION_PROPONENTES"
    Y lleno los formularios del proceso

