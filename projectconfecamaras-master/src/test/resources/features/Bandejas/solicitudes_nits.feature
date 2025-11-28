# language: es

Característica: validacion de bandeja recursos de reposicion

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaNitsPendientes
  Escenario: ingreso a la bandeja nits y valido la seccion de pendientes
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en pendientes y realizo las validaciones

  @ValidacionBandejaNitsAsignadas
  Escenario: ingreso a la bandeja nits y valido la seccion de asignadas
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en asignadas y realizo las validaciones

  @ValidacionBandejaNitsErroneas
  Escenario: ingreso a la bandeja nits y valido la seccion de erroneas
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en erroneas y realizo las validaciones

  @ValidacionBandejaNitsSolicitudNits
  Escenario: ingreso a la bandeja nits y valido la seccion de erroneas
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Solicitudes de Nits"
    Entonces ingreso la "01/05/2025" en comerciantes sin NIT y realizo las validaciones
