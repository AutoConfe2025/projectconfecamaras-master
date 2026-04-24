# language: es

Característica: flujo de renovacion consultas externas ESADL publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras con matricula "ESADL_ORG_CATORCE_CAJA"

  @FlujoEsadlPublicoConsultaExterna @RenovacionPublico @SII4
  Escenario: realizo el flujo de validacion para esadl catorce publico consulta externa
    Y ingreso al sistema SII3 como usuario publico externo con matricula
    Cuando realizo el flujo de valores sin establecimiento usuario publico consulta externa "30.000.000.0000"
    Entonces realizo el flujo de esadl con usuario publico Externo
