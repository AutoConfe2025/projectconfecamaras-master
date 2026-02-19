# language: es

Característica: revision de flujo de detallado de caja para analisis

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoDetalladoCajaAnalisis @SII4
  Escenario: valido el flujo de detallado de caja para analisis
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Detallado de Caja para Análisis"
    Entonces realizo el flujo de detallado de caja para analisis