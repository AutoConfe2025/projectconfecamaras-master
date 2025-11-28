# language: es

Característica: revision de recibos de caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionRevisionPorNumeroDelRecibo
  Escenario: valido el flujo con el boton de notificar
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Revisión Recibos de Caja"
    Entonces realizo la validacion por numero de recibo "S001118991" "1010184230" "20250923"