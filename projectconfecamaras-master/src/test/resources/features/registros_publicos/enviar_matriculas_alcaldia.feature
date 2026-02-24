# language: es

Característica: revision de flujo de modulo de enviar matriculas a alcaldia

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoEnviarMatriculasAlcaldia @SII4
  Escenario: valido el flujo de Enviar matriculas a alcaldia
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Enviar matrículas a Alcaldía"
    Entonces realizo el flujo de enviar matriculas a la alcaldia