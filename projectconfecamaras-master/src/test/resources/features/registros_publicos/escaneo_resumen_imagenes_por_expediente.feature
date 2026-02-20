# language: es

Característica: revision de flujo de escaneo resumen de imagenes por expediente

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoEscaneoResumenImagenesPorExpediente
  Escenario: valido el flujo de escaneo resumen de imagenes por expediente
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Resumen de imágenes por expediente"
    Entonces valido el flujo completo resumen de imagenes por expedientes