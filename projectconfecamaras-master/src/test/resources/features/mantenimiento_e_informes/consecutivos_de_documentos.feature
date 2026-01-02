# language: es

Característica: revision de recibos de caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionRevisionPorNumeroDelRecibo @SII4
  Escenario: valido el flujo con el boton de notificar
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Consecutivos de Documentos"
    Entonces realizo el proceso de grabacion email "1" "0"