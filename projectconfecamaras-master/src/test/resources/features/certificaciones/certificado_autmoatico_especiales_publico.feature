# language: es

Característica: flujo de certificados certificado automatico especiales publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoEspecialesPublico @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico especiales publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico especiales "44469"
    Entonces realizo el proceso de pago del certificado publico