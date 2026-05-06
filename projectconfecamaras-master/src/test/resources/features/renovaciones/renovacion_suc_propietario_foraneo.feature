# language: es

Característica: flujo de renovacion suc propietario foraneo

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoRenovacionSucPorpietarioForaneo @Renovacion @SII4
  Escenario: realizo el flujo de renovacion suc propietario foraneo
    Y ingreso al sistema SII3 como usuario admin
    Entonces ingreso a la bandeja "Mantenimiento CommonXX"
    Y realizo la actualizacion en la bandeja mantenimiento
    Entonces realizo las validaciones de la matricula "SUC_PROPIETARIO_FORANEO"