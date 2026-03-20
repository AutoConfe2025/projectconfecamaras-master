# language: es

Característica: flujo de renovacion esadl con doce con publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoEsadlDocePublico @Renovacion @SII4
  Escenario: realizo el flujo de validacion para esadl doce publico
    Y ingreso al sistema SII3 como usuario publico externo
    Cuando realizo el flujo de valores sin establecimiento usuario publico "30.000.000.0000" "ESADL_ORG_DOCE_CAJA"
    Entonces realizo el flujo de esadl con usuario publico