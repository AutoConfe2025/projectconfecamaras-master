# language: es

Característica: revision de flujo de modulo de registros publicos exportar Log Registros

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoExportarLogRegistros @SII4
  Escenario: valido el flujo de exporta log de registrtos
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Exportar LOG Registros"
    Entonces realizo el flujo de exportar log de resgistros