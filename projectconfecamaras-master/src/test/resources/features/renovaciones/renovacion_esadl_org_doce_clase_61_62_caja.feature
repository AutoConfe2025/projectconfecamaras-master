# language: es

Característica: flujo de renovacion esadl org doce clase 61 62 con caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoEsadlCatorce6162Caja @RenovacionPublico @SII4
  Escenario: realizo el flujo de validacion para esadl doce 61 62 caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores sin establecimiento clase 49 61 "20.000.000" "ESADL_ORG_DOCE_CLASE_61_62"
    Entonces realizo el flujo de esadl 49 61