# language: es

Característica: validacion de bandeja tramites no archivados

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaTramitesNoArchivadosPDF @Bandejas @SII4
  Escenario: ingreso a la bandeja tramites no archivados pdf
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "745719" "15" "Tramites no Archivados"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaTramitesNoArchivadosAgregarComentarios @Bandejas @SII4
  Escenario: ingreso a la bandeja tramites no archivados agregar comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "745719" "15" "Tramites no Archivados"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionBandejaTramitesNoArchivadosComentarios @Bandejas @SII4
  Escenario: ingreso a la bandeja tramites no archivados validar comntarios
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "745719" "15" "Tramites no Archivados"
    Entonces valido los comentarios de la bandeja tramites

  @ValidacionBandejaTramitesNoArchivadosArchivar @Bandejas @SII4
  Escenario: ingreso a la bandeja tramites no archivados archivar
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "745719" "15" "Tramites no Archivados"
    Entonces  realizo el proceso para archivar tramite no archivado "742606" "15"