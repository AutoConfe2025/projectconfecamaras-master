# language: es

Característica: flujo de certificados certificado automatico especiales caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoEspecialesCaja @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico especiales caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de certificado automatico especiales "44469"
    Entonces realizo el proceso de pago del certificado