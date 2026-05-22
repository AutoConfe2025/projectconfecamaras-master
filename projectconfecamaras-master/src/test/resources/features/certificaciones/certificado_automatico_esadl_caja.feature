# language: es

Característica: flujo de certificados certificado automatico existencia esadl caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoEsadlCaja @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico esadl caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de certificado automatico esadl "S0000005"
    Entonces realizo el proceso de pago del certificado