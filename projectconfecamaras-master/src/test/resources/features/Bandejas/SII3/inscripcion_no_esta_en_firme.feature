# language: es

Característica: validacion de bandeja recursos de reposicion

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionBandejaInscripcionNoEstaEnFirmeXML @SII4
  Escenario: ingreso a la bandeja inscripcion no esta en firme XML
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso a la bandeja "Inscripcion - No están en Firme"
    Entonces valida el XML