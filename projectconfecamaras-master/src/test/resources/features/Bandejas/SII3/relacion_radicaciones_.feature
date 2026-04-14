# language: es

Característica: validacion de bandeja relacion de radicaciones

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaRelacionRadicacionesPDF @SII4
  Escenario: ingreso a la bandeja relacion de radicaciones ver ruta
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "747360" "16" "Relacion de radicaciones"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaRelacionRadicacionesAñadirComentarios @SII4
  Escenario: ingreso a la bandeja relacion de radicaciones añadir comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "747360" "16" "Relacion de radicaciones"
    Entonces ingreso un nuevo comentario

  @ValidacionBandejaControlCalidadArchivar @SII4
  Escenario: ingreso a la bandeja archivar
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "747360" "16" "Relacion de radicaciones"
    Entonces  realizo el proceso para archivar radicacion "739471" "16"

  @ValidacionBandejaControlCalidadAgregarComentario @SII4
  Escenario: ingreso a la bandeja y agrego comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "747360" "16" "Relacion de radicaciones"
    Entonces realizo la validacion de agregar un comentario

