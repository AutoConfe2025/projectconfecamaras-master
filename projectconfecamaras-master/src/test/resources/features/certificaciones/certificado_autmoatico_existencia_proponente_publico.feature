# language: es

Característica: flujo de certificados certificado automatico existencia proponente publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoExistenciaProponentePublico @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico proponente publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico existencia proponente "130311"
    Entonces realizo el proceso de pago del certificado publico