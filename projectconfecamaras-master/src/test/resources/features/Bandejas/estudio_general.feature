# language: es

Característica: validacion de bandejas Estudio General

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaEstudioGeneralPDF
  Escenario: ingreso a la bandeja estudio general y valido descarga PDF
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso al modulo de validacion de bandeja "739420" "04"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaEstudioGeneralComentario
  Escenario: ingreso a la bandeja estudio general y valido comentarios
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso al modulo de validacion de bandeja "739420" "04"
    Entonces valido los comentarios de la bandeja

  @ValidacionBandejaEstudioGeneralGrabarComentario
  Escenario: ingreso a la bandeja estudio general y creo un nuevo comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso al modulo de validacion de bandeja "739420" "04"
    Entonces ingreso un nuevo comentario

  @ValidacionBandejaEstudioGeneralEstudiar
  Escenario: ingreso a la bandeja estudio general y valido la seccion de estudiar
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso al modulo de validacion de bandeja "739420" "04"
    Entonces realizo el proceso de estudio "739420"

  @ValidacionBandejaEstudioGeneralArchivar
  Escenario: ingreso a la bandeja estudio general y valido la seccion de archivar
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso al modulo de validacion de bandeja "739420" "04"
    Entonces  realizo el proceso para archivar el tramite "739420" "04"