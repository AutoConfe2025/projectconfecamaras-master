# language: es

Característica: flujo de certificados compra rapida certificado existencia proponente

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados

  @FlujoCertificadoCompraRapidaCertificadoExistenciaProponente @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado existencia proponente
    Cuando realizo el flujo de compra rapida certificado existencia proponente "3971"
    Entonces realizo el proceso de pago del certificado publico