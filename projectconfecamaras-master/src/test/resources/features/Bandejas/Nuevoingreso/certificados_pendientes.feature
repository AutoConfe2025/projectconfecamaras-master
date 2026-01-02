# language: es
Característica: Validar certicados pendientes
  como usuario quiero realizar las acciones disponibles

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras

  @CertificadosPendientes @SII4
  Escenario: Validar certificados pendientes
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Certificados pendientes
    Entonces validara las acciones de certificados pendientes relacionados al recibo S001052591