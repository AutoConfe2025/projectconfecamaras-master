# language: es

Característica: validacion de bandeja inscripcion no esta en firme

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaInscripcionNoEstaEnFirmeXML @Bandejas @SII4
  Escenario: ingreso a la bandeja inscripcion no esta en firme XML
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Inscripcion - No están en Firme"
    Entonces valida el XML