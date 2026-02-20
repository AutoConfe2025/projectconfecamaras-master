# language: es

Característica: revision de flujo de estadisticas y extracciones relacion de placas asignados

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRelacionPlacasAsignadas @SII4
  Escenario: valido el flujo de relacion de placas asignados
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Relación de Placas Asignados"
    Entonces realizo el flujo de relacion de placas asignados