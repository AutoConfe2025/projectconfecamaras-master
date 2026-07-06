# language: es

Característica: flujo de certificados compra rapida certificados especiales SI

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados especiales

  @FlujoCertificadoCompraRapidaCertificadoEspecialSi @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado especiales SI
    Cuando realizo el flujo de compra rapida certificado especiales si "43742"
    Entonces realizo el proceso de pago del certificado publico