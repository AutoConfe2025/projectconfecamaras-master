# language: es

Característica: flujo de certificados certificado automatico existencia caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoExistenciaCaja @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico de existencia caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de certificado automatico "42567"
    Entonces realizo el proceso de pago del certificado