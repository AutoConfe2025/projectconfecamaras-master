# language: es

Característica: revision de escaneo digitalizar documentos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionEscaneoDigitalizarDocumentosPDF @DigitalizarDocumentos
  Escenario: ingreso a la bandeja digitalizar documentos y realizo las validaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a bandeja "739148" "01" "Digitalizar documentos"
    Entonces valido el proceso de descarga del PDF

  @ValidacionEscaneoDigitalizarDocumentosAgregarComentario @DigitalizarDocumentos
  Escenario: ingreso a la bandeja digitalizar documentos y realizo las validaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a bandeja "739148" "01" "Digitalizar documentos"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionEscaneoDigitalizarDocumentosVerComentario @DigitalizarDocumentos
  Escenario: ingreso a la bandeja digitalizar documentos y realizo las validaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a bandeja "739148" "01" "Digitalizar documentos"
    Entonces valido los comentarios de la bandeja

  @ValidacionEscaneoDigitalizarEscanear @DigitalizarDocumentos
  Escenario: ingreso a la bandeja digitalizar documentos y realizo las validaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a bandeja "739148" "01" "Digitalizar documentos"
    Entonces realizo el proceso de escanear

  @ValidacionEscaneoDigitalizarEscanearYRevision @DigitalizarDocumentos
  Escenario: ingreso a la bandeja digitalizar documentos y realizo las validaciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a bandeja "739148" "01" "Digitalizar documentos"
    Entonces realizo el proceso de escaneo y revision



