# language: es

Característica: flujo de certificados certificado automatico matricula publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoMatriculaPublico @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico matricula publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico matricula "41427"
    Entonces realizo el proceso de pago del certificado publico