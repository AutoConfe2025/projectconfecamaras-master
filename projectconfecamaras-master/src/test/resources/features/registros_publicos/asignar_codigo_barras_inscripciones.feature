# language: es

Característica: revision de flujo de modulo de registros auditorias asignar codigos de barras a inscripciones

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoAsignarCodigoBarras
  Escenario: valido el flujo de de barras a inscripciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Asignar Códigos Barras a Inscripciones"
    Entonces valido el codigo de barras generado