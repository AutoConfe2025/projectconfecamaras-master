# language: es

Característica: valida de bandeja de tramites reingresados

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaTramitesReingresadosEnProcesoPDF @SII4
  Escenario: ingreso a la bandeja tramites reingresados en proceso y valido la descarga del pdf
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja con captura "09" "Tramites reingresados (En reparto)"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaTramitesReingresadosEnProcesoAgregarComentario @SII4
  Escenario: ingreso a la bandeja Tramites reingresados en proceso agergar comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja con captura "09" "Tramites reingresados (En reparto)"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionBandejaTramitesReingresadosEnProcesoValidaComentarios @SII4
  Escenario: ingreso a la bandeja tramites reingresados en proceso y valido los comentarios
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja con captura "09" "Tramites reingresados (En reparto)"
    Entonces valido los comentarios de la bandeja

  @ValidacionBandejaTramitesReingresadosEnProcesoEscanear @SII4
  Escenario: ingreso a la bandeja Tramites reingresados en proceso escanear
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja con captura "09" "Tramites reingresados (En reparto)"
    Entonces realizo el proceso de escanear

  @ValidacionBandejaTramitesReingresadosEnProcesoFinalizar @SII4
  Escenario: ingreso a la bandeja Tramites reingresados en proceso escanear
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja con captura "09" "Tramites reingresados (En reparto)"
    Entonces realizo el proceso de escaneo y revision