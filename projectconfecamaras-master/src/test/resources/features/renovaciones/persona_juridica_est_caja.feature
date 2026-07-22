# language: es

  Característica: flujo de renovacion persona juridica EST caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoPersonaJuridicaEstCaja @Renovacion @SII4
  Escenario: realizp el flujo de validacion para persona juridica establecimiento caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el formulario de registro matricula mercantil "600.000.000" "PERSONA_JURIDICA_EST_CAJA"
    Entonces realizo el flujo de persona juridica establecimiento caja