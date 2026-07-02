# language: es

Característica: validacion de bandejas Expedientes en revision

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionExpedientesEnRevisionCertiAntiguo @Bandejas @SII4
  Escenario: ingreso a la bandeja inscripcion no esta en firme XML
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Expedientes en revision"
    Entonces ingreso el codigo de barras "9960"
    Y valido el certificado antiguo formato

  @ValidacionExpedientesEnRevisionCertiAntiguo @Bandejas @SII4
  Escenario: ingreso a la bandeja inscripcion no esta en firme XML
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Expedientes en revision"
    Entonces ingreso el codigo de barras "9960"
    Y valido el certificado nuevo formato
