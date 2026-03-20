# language: es

Característica: flujo de renovacion esadl con catorce con caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoEsadlCatorceCaja @Renovacion @SII4
  Escenario: realizo el flujo de validacion para esadl catorce caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores sin establecimiento "30.000.000.000" "ESADL_ORG_CATORCE_CAJA"
    Entonces realizo el flujo de esadl con caja