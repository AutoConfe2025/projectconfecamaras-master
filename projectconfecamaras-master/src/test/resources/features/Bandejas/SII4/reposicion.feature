# language: es

Característica: validacion de bandeja recursos de reposicion

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaRecurosDeReposicionPDF @SII4
  Escenario: ingreso a la bandeja recursos de reposicion y valido la descarga del pdf
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja recursos "745929" "04"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaRecurosDeReposicionComentarios @SII4
  Escenario: ingreso a la bandeja recursos de reposicion y valido los comentarios
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja recursos "745929" "04"
    Entonces valido los comentarios de la bandeja

  @ValidacionBandejaRecurosDeReposicionIngresoComentarios @SII4
  Escenario: ingreso a la bandeja recursos de reposicion y ingreso un comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja recursos "745929" "04"
    Entonces ingreso un nuevo comentario

  @ValidacionBandejaRecurosDeReposicionResponder @SII4
  Escenario: ingreso a la bandeja recursos de reposicion y respondo un comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja recursos "745929" "04"
    Entonces realizo el proceso de responder recurso

  @ValidacionBandejaRecurosDeReposicionArchivar @SII4
  Escenario: ingreso a la bandeja recursos de reposicion archivo el proceso
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja recursos "745929" "04"
    Entonces  se realiza el proceso para archivar el tramite "745929" "04"