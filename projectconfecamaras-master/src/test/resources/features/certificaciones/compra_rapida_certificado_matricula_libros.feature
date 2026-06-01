# language: es

Característica: flujo de certificados compra rapida certificado matricula libros

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados

  @FlujoCertificadoCompraRapidaCertificadoMatriculaLibros @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado matricula libros
    Cuando realizo el flujo de compra rapida certificado libros matriculas "51505"
    Entonces realizo el proceso de pago del certificado publico