# language: es

Característica: flujo de reingreso de tramites reforma procede el reingreso del documento

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoReingresoDeTramitesProcedeReingresoDocumento @Mutacion @SII4
  Escenario: realizo el flujo de reingreso de tramites reforma procede el reingreso del documento
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de reingreso de tramites reforma procede el reingreso del documento "56417"
    Y realizo el pago de devolucion plano sin reingreso
    Entonces finalizo el flujo de procede el reingreso del documento