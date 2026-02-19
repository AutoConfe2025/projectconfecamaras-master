# language: es

Característica: flujo de renocacion persona natural EST caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoPersonaNaturalEstCaja @SII4
  Escenario: realizp el flujo de validacion para persona natural establecimiento caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el formulario de registro matricula mercantil "21.000.000" "PERSONA_NATURAL_EST_CAJA"
    Entonces completo el formulario de renovacion persona natural est caja