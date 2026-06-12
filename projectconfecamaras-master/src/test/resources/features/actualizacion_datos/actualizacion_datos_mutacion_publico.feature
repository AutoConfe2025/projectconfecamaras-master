# language: es

Característica: flujo de actualizacion de datos mutacion publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoActualizacionDatosMutacionPublico @Mutacion @SII4
  Escenario: realizo el flujo de actualizacion de datos mutacion publico
    Y ingreso al sistema SII4 como usuario publico
    Entonces realizo el flujo de actualizacion de datos mutacion publico "56563"
    Cuando realizo el flujo de recibir el pago de la mutacion publico