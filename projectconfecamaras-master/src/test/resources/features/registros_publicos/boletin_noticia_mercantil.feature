# language: es

Característica: revision de flujo de modulo de registros publicos boletin de noticia mercantil

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoBoletinNoticiaMercantil @SII4
  Escenario: valido el flujo de boletin de noticia mercantil
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Boletin Noticia Mercantil"
    Entonces realizo el flujo de boletin de noticia mercantil