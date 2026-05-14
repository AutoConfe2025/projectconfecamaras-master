# language: es

Característica: flujo de renovacion esadl org catorce clase 49 61 con caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoEsadlCatorce4961Caja @RenovacionPublico @SII4
  Escenario: realizo el flujo de validacion para esadl catorce 49 61 caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores sin establecimiento clase 49 61 "20.000.000" "ESADL_ORG_CATORCE_CLASE_41_69"
    Entonces realizo el flujo de esadl 49 61