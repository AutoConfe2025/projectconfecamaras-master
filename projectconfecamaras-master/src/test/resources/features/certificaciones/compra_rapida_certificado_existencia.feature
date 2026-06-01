# language: es

Característica: flujo de certificados compra rapida certificado existencia

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados

  @FlujoCertificadoCompraRapidaCertificadoExistencia @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado existencia
    Cuando realizo el flujo de compra rapida certificado existencia "42567"
    Entonces realizo el proceso de pago del certificado publico