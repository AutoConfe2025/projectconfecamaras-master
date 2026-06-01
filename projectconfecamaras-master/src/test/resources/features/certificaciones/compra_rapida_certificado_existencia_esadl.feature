# language: es

Característica: flujo de certificados compra rapida certificado existencia esadl

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras certificados

  @FlujoCertificadoCompraRapidaCertificadoExistenciaEsdal @Certificaciones @SII4
  Escenario: realizo el flujo de generar compra rapida certificado existencia esadl
    Cuando realizo el flujo de compra rapida certificado existencia esadl "S0000005"
    Entonces realizo el proceso de pago del certificado publico