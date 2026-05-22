# language: es

Característica: flujo de certificados certificado automatico proponente caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoProponenteCaja @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico proponente caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de certificado automatico proponente "3351"
    Entonces realizo el proceso de pago del certificado