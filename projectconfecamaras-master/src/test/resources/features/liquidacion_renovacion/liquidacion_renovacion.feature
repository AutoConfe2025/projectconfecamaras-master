# language: es

Característica: proceso de liquidacion renovacion simulador

Antecedentes: ingreso plataforma confecamaras
  Dado Confecamaras ingresa al sistema de confecamaras

  @LiquidacionRenovacionNombre @SII4
  Escenario: proceso de liquidacion renovacion por nombre
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el ingreso al modulo por "Nombre"
    Entonces valido el proceso de matricula

  @LiquidacionRenovacionNitCedula @SII4
  Escenario: proceso de liquidacion renovacion por Nit o cedula
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el proceso por "Identificación"
    Entonces valido el proceso de matricula por identificacion

  @LiquidacionRenovacionProponente @SII4
  Escenario: proceso de liquidacion renovacion por proponente
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el proceso usando "Proponente"
    Entonces valido el proceso de matricula por proponente

  @LiquidacionRenovacionPalabra @SII4
  Escenario: proceso de liquidacion renovacion por palabras
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el proceso con "Palabras"
    Entonces valido el proceso de matricula por palabras
