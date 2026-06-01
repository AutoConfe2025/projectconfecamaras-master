# language: es

Característica: flujo de certificados certificado automatico existencia esadl publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoEsadlPubilco @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico esadl publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico esadl "S0000005"
    Entonces realizo el proceso de pago del certificado publico