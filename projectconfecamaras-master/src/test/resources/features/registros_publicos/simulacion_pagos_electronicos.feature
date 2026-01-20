# language: es

Característica: revision de flujo de modulo de simulacion de pagos electronicos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoSimulacionPagosElectronicos
  Escenario: valido el flujo de simulacion de pagos electronicos
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Simulación de Pagos Electrónicos"
    Entonces realizo el flujo de simulacion de pagos electronicos