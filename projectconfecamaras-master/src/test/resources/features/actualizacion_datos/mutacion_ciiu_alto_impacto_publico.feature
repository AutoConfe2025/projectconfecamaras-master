# language: es

Característica: flujo de mutacion alto impacto Publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMutacionAltoImpactoPublico @mutacion @SII4
  Escenario: realizo el flujo de mutacion alto impacto Publico
    Y ingreso al sistema SII4 como usuario publico
    Entonces realizo el flujo de mutacion alto impacto publico "249535"
    Cuando realizo el flujo de recibir el pago de la mutacion publico