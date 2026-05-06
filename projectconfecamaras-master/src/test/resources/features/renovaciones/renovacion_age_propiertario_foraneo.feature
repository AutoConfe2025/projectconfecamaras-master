# language: es

Característica: flujo de renovacion age propietario foraneo

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionPorpietarioForaneo #@Renovacion @SII4
  Escenario: realizo el flujo de renovacion age propietario foraneo
    Y ingreso al sistema SII3 como usuario admin
    Entonces ingreso a la bandeja "Mantenimiento CommonXX"
    Y realizo la actualizacion en la bandeja mantenimiento
    Entonces realizo las validaciones de la matricula "AGE_PROPIETARIO_FORANEO"