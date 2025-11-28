# language: es

Característica: validacion de bandeja relacion de radicaciones

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaRelacionRadicacionesPDF
  Escenario: ingreso a la bandeja relacion de radicaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "739471" "16" "Relacion de radicaciones"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaRelacionRadicacionesAñadirComentarios
  Escenario: ingreso a la bandeja relacion de radicaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "739471" "16" "Relacion de radicaciones"
    Entonces ingreso un nuevo comentario

  @ValidacionBandejaControlCalidadArchivar
  Escenario: ingreso a la bandeja archivar
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "739471" "16" "Relacion de radicaciones"
    Entonces  realizo el proceso para archivar radicacion "739471" "16"

  @ValidacionBandejaControlCalidadAgregarComentario
  Escenario: ingreso a la bandeja y agrego comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "739471" "16" "Relacion de radicaciones"
    Entonces realizo la validacion de agregar un comentario

