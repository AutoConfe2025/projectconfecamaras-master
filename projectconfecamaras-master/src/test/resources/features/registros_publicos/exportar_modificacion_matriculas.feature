# language: es

Característica: revision de flujo de estadisticas y extracciones exportar modificcion matriculas

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoExportarModificacionMatriculas @SII4
  Escenario: valido el flujo de exportar modificacion de matriculas
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Exportar Modificación Matrículas"
    Entonces realizo el flujo de exportar modificacion matriculas