# language: es

Característica: flujo de renovacion consultas externas AGE publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras con matricula "AGE_CAJA"

  @FlujoRenovacionAGEConsultaExterna @SII4
  Escenario: realizo el flujo de renovacion age publico consulta externa
    Y ingreso al sistema SII3 como usuario publico externo con matricula
    Cuando realizo el flujo de valores publico consulta externa SUC
    Entonces realizo el flujo de renovacion Age publico