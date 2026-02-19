# language: es

Característica: revision de flujo de modulo de registros publicos registrar y publicar reporte E.E

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRegistrarPublicarReporte @SII4
  Escenario: valido el flujo de registrar publicar reporte EE
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Registrar y Publicar Reporte E.E."
    Entonces valido la generacion del reporte E.E