# language: es

Característica: flujo de renovacion consultas externas persona juridica publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras con matricula "PERSONA_JURIDICA_EST_CAJA"

  @FlujoPersonaJuridicaEstPublicoConsultaExterna @SII4
  Escenario: flujo persona juridica con establecimiento publico
    Y ingreso al sistema SII3 como usuario publico externo con matricula
    Cuando realizo el flujo de valores usuario publico matricula "600.000.000"
    Entonces realizo el flujo de persona juridica y usuario publico externo con matricula