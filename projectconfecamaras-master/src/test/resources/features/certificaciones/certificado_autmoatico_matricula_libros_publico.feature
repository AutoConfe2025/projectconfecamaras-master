# language: es

Característica: flujo de certificados certificado automatico matricula libros publico

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @FlujoCertificadoAutomaticoMatriculaLibrosPublico @Certificaciones @SII4
  Escenario: realizo el flujo de generar el certificado automatico matricula libros publico
    Y ingreso al sistema SII3 como analista
    Cuando realizo el flujo de certificado automatico matricula libros "51505"
    Entonces realizo el proceso de pago del certificado publico