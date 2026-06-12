# language: es

Característica: flujo de mutacion alto impacto Caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMutacionAltoImpactoCaja @Mutacion @SII4
  Escenario: realizo el flujo de mutacion alto impacto Caja
    Y ingreso al sistema SII3 como usuario publico
    Entonces realizo el flujo de mutacion alto impacto caja "49455"
    Cuando realizo el flujo de recibir el pago de la mutacion