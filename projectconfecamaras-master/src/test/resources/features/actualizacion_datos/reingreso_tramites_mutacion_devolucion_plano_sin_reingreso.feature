# language: es

Característica: flujo de reingreso de tramites mutacion devolucion de plano rin reingreso

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoReingresoDeTramitesMutacionDevolucionDePlanoRinReingresoo @Mutacion @SII4
  Escenario: realizo el flujo de reingreso de tramites mutacion devolucion de plano rin reingreso
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de reingreso de tramites mutacion devolucion de plano rin reingreso "76826"
    Entonces realizo el flujo de recibir el pago de la devolucion plano sin reingreso
    Y realizo el flujo de reingreso devolucion plano sin registro