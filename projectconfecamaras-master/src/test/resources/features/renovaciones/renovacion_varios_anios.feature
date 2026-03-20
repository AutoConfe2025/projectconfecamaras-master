# language: es

Característica: flujo de renovacion matricula varios anios

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoMatriculaVariosAnios @SII4
  Escenario: realizo el flujo de matricula varios anios
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de valores varios anios "VARIOS_ANIOS" "20.000.000"
    Entonces valido que se realice el proceso de varios anios