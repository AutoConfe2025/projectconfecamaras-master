# language: es

Característica: flujo de certificados certificado automatico proponente publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoProponentePublico @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico proponente publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico proponente "3351"
    Entonces realizo el proceso de pago del certificado publico