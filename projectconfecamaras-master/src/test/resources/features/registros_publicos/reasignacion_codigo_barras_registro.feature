# language: es

Característica: revision de flujo de reasignacion codigo de barras (registro)

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoReasignacionCodigoBarrasRegistro
  Escenario: valido el flujo de estadisticas y extracciones extraccion de libros Actos
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Reasignación Código de Barras (registro)"
    Entonces realizo el flujo del proceso de reasignacion "739171"