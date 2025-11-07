# language: es

Característica: validacion de bandejas oficios y requerimientos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaEstudioGeneralPDF
  Escenario: ingreso a la bandeja oficios y requerimientos y descargar el pdf
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja oficios requerimientos "739254" "04"
    Entonces realizo la validacion de el boton rutas

  @ValidacionBandejaOficiosRequerimientosComentarios
  Escenario: ingreso a la bandeja oficios y requerimientos y agregar un comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja oficios requerimientos "739254" "04"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionBandejaOficiosRequerimientosReponderOficio
  Escenario: ingreso a la bandeja oficios y requerimientos y responder el oficio
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja oficios requerimientos "739254" "04"
    Entonces realizo el proceso de responder oficio

  @ValidacionBandejaOficiosRequerimientosArchivar
  Escenario: ingreso a la bandeja oficios y requerimientos y responder el oficio
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja oficios requerimientos "739254" "04"
    Entonces realizo el proceso de archivar oficio requerimiento "739254" "04"