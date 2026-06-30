# language: es

Característica: validacion de bandeja solicitudes nit

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaNitsPendientes @Bandejas @SII4
  Escenario: ingreso a la bandeja nits y valido la seccion de pendientes
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en pendientes y realizo las validaciones

  @ValidacionBandejaNitsAsignadas @Bandejas @SII4
  Escenario: ingreso a la bandeja nits y valido la seccion de asignadas
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en asignadas y realizo las validaciones

  @ValidacionBandejaNitsErroneas @Bandejas @SII4
  Escenario: ingreso a la bandeja nits y valido la seccion de erroneas
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en erroneas y realizo las validaciones

  @ValidacionBandejaNitsSolicitudNits @Bandejas @SII4
  Escenario: ingreso a la bandeja nits y valido la seccion de solicitudes nits
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en comerciantes sin NIT y realizo las validaciones
