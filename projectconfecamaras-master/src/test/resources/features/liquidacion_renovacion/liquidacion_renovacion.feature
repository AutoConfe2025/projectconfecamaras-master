# language: es

Característica: proceso de liquidacion renovacion simulador

Antecedentes: ingreso plataforma confecamaras
  Dado Confecamaras necesita hacer el proceso de liquidacion renovacion

  @LiquidacionRenovacionNombre
  Escenario: proceso de liquidacion renovacion por nombre
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el ingreso al modulo por "Nombre"
    Entonces valido el proceso de matricula

  @LiquidacionRenovacionNitCedula
  Escenario: proceso de liquidacion renovacion por Nit o cedula
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el proceso por "Identicación"
    Entonces valido el proceso de matricula por identificacion

  @LiquidacionRenovacionProponente
  Escenario: proceso de liquidacion renovacion por proponente
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el proceso usando "Proponente"
    Entonces valido el proceso de matricula por proponente

  @LiquidacionRenovacionPalabra
  Escenario: proceso de liquidacion renovacion por palabras
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el proceso con "Palabras"
    Entonces valido el proceso de matricula por palabras
