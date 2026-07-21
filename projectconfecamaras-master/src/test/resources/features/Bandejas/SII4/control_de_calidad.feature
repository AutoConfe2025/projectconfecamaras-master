# language: es

Característica: validacion de bandeja control de calidad

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

    @ValidacionBandejaControlCalidadPDF  @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja recursos de reposicion y valido la descarga del pdf
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces valido el proceso de descarga del PDF

  @ValidacionBandejaControlCalidadAgregarComentario @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja recursos agergar comentario
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces realizo la validacion de agregar un comentario

  @ValidacionBandejaControlCalidadValidarComentario @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja validar comentarios
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces valido los comentarios de la bandeja

  @ValidacionBandejaControlCalidadCertificado @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja certificado
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces valido el modulo de ver certificado

  @ValidacionBandejaControlCalidadDigitacion @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja valido digitacion
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces valido el modulo de digitacion

  @ValidacionBandejaControlCalidadConfirmar @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja confirmar proceso
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces confirmo el proceso de control de calidad

  @ValidacionBandejaControlCalidadRegresarEstudio @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja regresar a estudio
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces confirmo el regreso de estudio

  @ValidacionBandejaControlCalidadRegresarDigitacion @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja regresar a digitacion
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces confirmo el regreso a digitacion

  @ValidacionBandejaControlCalidadArchivar @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja archivar
    Y ingreso al sistema SII3 como usuario publico
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces  realizo el proceso para archivar el tramite "748085" "38"


  @ValidacionBandejaControlCalidadPDF @Control_de_calidad @Bandejas @SII4
  Escenario: ingreso a la bandeja recursos de reposicion y valido la descarga del pdf
    Y ingreso al sistema SII3 como usuario admin
    Cuando Cuando ingreso a la bandeja "748085" "38" "control de calidad"
    Entonces valido el proceso de descarga del PDF
