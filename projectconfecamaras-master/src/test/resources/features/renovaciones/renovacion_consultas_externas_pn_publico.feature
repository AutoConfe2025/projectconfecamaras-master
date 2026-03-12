# language: es

Característica: flujo de renovacion consultas externas persona natural publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras con matricula "PERSONA_NATURAL_EST_CAJA"

    Escenario: el ingreso al sistema es exitoso
      Y ingreso al sistema SII3 como usuario publico externo con matricula
      Cuando realizo el flujo de valores usuario publico matricula "21.000.000"
      Entonces realizo el flujo de persona natural y usuario publico externo con matricula
