# language: es

Característica: flujo de reingreso de tramites reforma procede devolucion de plano sin reingreso

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoReingresoTramiteReformaDevolucionPlanoSinreingreso @Mutacion @SII4
  Escenario: flujo de reingreso de tramites reforma procede devolucion de plano sin reingreso
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de reingreso de tramites reforma devolucion plano sin reingreso "56417"
    Y realizo el pago de devolucion plano sin reingreso
    Entonces finalizo el flujo de Reingreso devolucion de plano sin reingreso