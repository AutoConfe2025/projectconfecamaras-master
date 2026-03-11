  # language: es

  Característica: revision de flujo de escaneo resumen de imagenes por expediente

    Antecedentes: ingreso plataforma confecamaras
      Dado Confecamaras ingresa al sistema de confecamaras

    @ValidoFlujoEstadisticasExtraccionesExtraccionProponente @SII4
    Escenario: valido el flujo de escaneo resumen de imagenes por expediente
      Y ingreso al sistema SII3 como usuario publico
      Cuando ingreso solo bandeja "Extracción de Proponentes"
      Entonces realizo el proceso de extraccion de proponentes