# language: es

Característica: flujo de renovacion persona natural establecimiento solicitud balance caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoPersonaNatrualSolicitudBalanceCaja @Renovacion @SII4
  Escenario: realizo el flujo de renovacion pn est solicitud balance caja
    Y ingreso al sistema SII3 como usuario admin
    Entonces ingreso a la bandeja "Mantenimiento CommonXX"
    Y realizo el proceso de actulalizacion de solicitud
    Entonces realiza el proceso de formlarios pn est sol balance "20.000.000" "PN_EST_SOL_BALANCE_CAJA"
    Y realiza el proceso de recibir el pago "Mantenimiento CommonXX"