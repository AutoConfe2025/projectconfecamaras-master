# language: es

Característica: flujo de inscripcion proponente caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoIncripcionProponenteCaja @Mutacion @SII4
  Escenario: realizo el flujo de inscripcion proponente caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de inscripcion proponente caja "44453"
    Entonces realizo el flujo de recibir el pago de la inscripcion de proponente