# language: es

Característica: flujo de certificados compra rapida certificados especiales NO

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados especiales

  @FlujoCertificadoCompraRapidaCertificadoEspecialNo @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado especiales NO
    Cuando realizo el flujo de compra rapida certificado especiales no "43742"
    Entonces realizo el proceso de pago del certificado publico