# language: es

Característica: flujo de certificados compra rapida certificado matricula

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados

  @FlujoCertificadoCompraRapidaCertificadoMatricula @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado matricula
    Cuando realizo el flujo de compra rapida certificado matricula "41427"
    Entonces realizo el proceso de pago del certificado publico