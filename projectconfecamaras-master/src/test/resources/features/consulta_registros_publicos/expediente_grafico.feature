# language: es

Característica: revision de flujo de consulta de registros publicos expediente grafico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoExpedienteGrafico @SII4
  Escenario: valido el flujo de expediente grafico
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Expediente gráfico"
    Entonces realizo la validacion del flujo expediente grafico