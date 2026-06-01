# language: es

Característica: flujo de actualizacion de datos mutacion Caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoActualizacionDatosMutacionCaja @RenovacionPublico @SII4
  Escenario: realizo el flujo de actualizacion de datos mutacion caja
    Y ingreso al sistema SII3 como usuario publico
    Entonces realizo el flujo de actualizacion de datos mutacion caja "43138"
    Cuando realizo el flujo de recibir el pago de la mutacion