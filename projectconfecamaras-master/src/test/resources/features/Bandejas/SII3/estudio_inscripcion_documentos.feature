# language: es

Característica: Estudio e Inscripcion de Documentos Mercantil / Estudio e Inscripcion de Documentos Proponente

  @estudioDocumentosMercantil @BloqueCuatro @general
  Escenario: Estudio e Inscripcion de Documentos Mercantil
    Dado Confecamaras requiere realizar el Estudio e Inscripcion de Documentos Mercantil
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Estudio Mercantil
    Entonces ingresara el codigo de barras mercantil y los datos necesarios

  @estudioInscripcionDocumentos @BloqueData @general
  Escenario: Estudio Inscripcion de Documentos Proponente - Inscripcion
    Dado Confecamaras requiere realizar el Estudio Inscripcion de Documentos Proponente - Inscripcion
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Estudio RegPro
    Entonces ingresara el codigo de barras proponente