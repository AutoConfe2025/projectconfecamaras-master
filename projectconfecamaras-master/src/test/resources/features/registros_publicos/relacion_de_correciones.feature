# language: es

Característica: revision de flujo de relacion de correcciones

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoRelacionCorrecciones
  Escenario: valido el flujo de relacion de correcciones
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Relación de correcciones"
    Entonces diligencio el formulario para el flujo de relacion de correcciones