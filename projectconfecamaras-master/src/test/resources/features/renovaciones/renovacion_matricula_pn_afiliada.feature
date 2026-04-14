# language: es

Característica: flujo de renovacion matricula persona natural afiliada

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaPersonaNaturalAfiliada @Renovacion @SII4
  Escenario: realizo el flujo de matricula persona natural afiliada
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores pn afiliada "PERSONA_NATURAL_BAJA_AFILIADA"
    Entonces realizjo el flujo de persona natural afiliada