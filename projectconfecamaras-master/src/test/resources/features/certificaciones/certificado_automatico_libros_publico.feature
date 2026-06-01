# language: es

Característica: flujo de certificados certificado automatico libros publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoLibrosPublico @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico libros publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico libros "43999"
    Entonces realizo el proceso de pago del certificado publico