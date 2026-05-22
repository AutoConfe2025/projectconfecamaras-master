# language: es

Característica: flujo de certificados certificado automatico libros caja

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoLibrosCaja @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico libros caja
    Y ingreso al sistema SII3 como usuario publico
    Cuando realizo el flujo de certificado automatico libros "43999"
    Entonces realizo el proceso de pago del certificado