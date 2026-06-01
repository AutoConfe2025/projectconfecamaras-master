# language: es

Característica: flujo de certificados compra rapida certificado libros

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados

  @FlujoCertificadoCompraRapidaCertificadoLibros @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado libros
    Cuando realizo el flujo de compra rapida certificado libros "43999"
    Entonces realizo el proceso de pago del certificado publico