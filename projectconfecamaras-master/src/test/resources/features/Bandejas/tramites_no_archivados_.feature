# language: es

Característica: validacion de bandeja tramites no archivados

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaTramitesNoArchivadosPDF @SII4
  Escenario: ingreso a la bandeja tramites no archivados
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "742606" "15" "Tramites no Archivados"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaTramitesNoArchivadosAgregarComentarios @SII4
  Escenario: ingreso a la bandeja tramites no archivados
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "742606" "15" "Tramites no Archivados"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionBandejaTramitesNoArchivadosComentarios @SII4
  Escenario: ingreso a la bandeja tramites no archivados
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "742606" "15" "Tramites no Archivados"
    Entonces valido los comentarios de la bandeja tramites

  @ValidacionBandejaTramitesNoArchivadosArchivar @SII4
  Escenario: ingreso a la bandeja tramites no archivados
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "742606" "15" "Tramites no Archivados"
    Entonces  realizo el proceso para archivar tramite no archivado "742606" "15"