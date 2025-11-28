# language: es

Característica: validacion de bandeja revision de desistimientos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaRevisionDesistimientosPDF
  Escenario: ingreso a la bandeja revision de desistimientos valido pdf
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "14259614" "39" "Revision Desistimientos"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaRevisionDesistimientosVerDesistimiento
  Escenario: ingreso a la bandeja revision de desistimientos ver desistimientos
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "14259614" "39" "Revision Desistimientos"
    Entonces ingreso y valido el desistimiento

  @ValidacionBandejaRevisionDesistimientosVerComentarios
  Escenario: ingreso a la bandeja revision de desistimientos ver comentarios
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "14259614" "39" "Revision Desistimientos"
    Entonces valido los comentarios de la bandeja

  @ValidacionBandejaRevisionDesistimientosAgregarComentarios
  Escenario: ingreso a la bandeja revision de desistimientos agrego comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "14259614" "39" "Revision Desistimientos"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionBandejaRevisionDesistimientosConfirmacionTelefonica
  Escenario: ingreso a la bandeja revision de desistimientos agrego comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "14259614" "39" "Revision Desistimientos"
    Entonces realizo la confirmacion telefonica

  @ValidacionBandejaRevisionDesistimientosNotificadoPresencial
  Escenario: ingreso a la bandeja revision de desistimientos valido notificado presencialmente
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "14259614" "39" "Revision Desistimientos"
    Entonces valido el modulo de marcar notificado presencial

  @ValidacionBandejaRevisionDesistimientosArchivar
  Escenario: ingreso a la bandeja revision de desistimientos archivo el proceso
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "14259614" "39" "Revision Desistimientos"
    Entonces archivo el proceso en la bandeja desistimientos