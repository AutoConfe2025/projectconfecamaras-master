# language: es

Característica: flujo de renovacion esadl con catorce 41 69 con externo

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoEsadlCatorce4169ClaseExterno @RenovacionPublico @SII4
  Escenario: realizo el flujo de validacion para esadl catorce clase 41 69 externo
    Y ingreso al sistema SII3 como usuario publico externo
    Cuando realizo el flujo de valores sin establecimiento usuario publico "20.000.000" "ESADL_ORG_CATORCE_CLASE_41_69"
    Entonces realizo el flujo de esadl con usuario publico Externo clase 41 69