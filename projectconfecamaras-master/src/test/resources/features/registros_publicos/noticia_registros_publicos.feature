# language: es

Característica: revision de flujo de noticia de registros publicos modulo de resgistro

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRegistrosPublicosNoticiDeRegistro @SII4
  Escenario: valido el flujo de registros publicos modulo de resgistro
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Noticia registros públicos" seleccionada "Noticia registros públicos" "2"
    Entonces valido el flujo de noticias de registros publicos