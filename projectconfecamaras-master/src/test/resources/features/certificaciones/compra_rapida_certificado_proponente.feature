# language: es

Característica: flujo de certificados compra rapida certificado proponente

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados

  @FlujoCertificadoCompraRapidaCertificadoProponente @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado proponente
    Cuando realizo el flujo de compra rapida certificado proponente "3351"
    Entonces realizo el proceso de pago del certificado publico