# language: es

Característica: flujo de renovacion esadl con doce 61 62 con externo

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoEsadlDoce6162ClaseExterno @RenovacionPublico @SII4
  Escenario: realizo el flujo de validacion para esadl doce clase 61 62 externo
    Y ingreso al sistema SII3 como usuario publico externo
    Cuando realizo el flujo de valores sin establecimiento usuario publico "20.000.000" "ESADL_ORG_DOCE_CLASE_61_62"
    Entonces realizo el flujo de esadl con usuario publico Externo clase 61 62