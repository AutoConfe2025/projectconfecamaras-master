# language: es

Característica: flujo de certificados certificado automatico existencia publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoExistenciaPublico @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico de existencia publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico publico "42567"
    Entonces realizo el proceso de pago del certificado publico