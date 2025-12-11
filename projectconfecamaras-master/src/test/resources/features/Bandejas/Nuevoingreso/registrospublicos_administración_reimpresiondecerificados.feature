# language: es
Característica: Validar que permita la revision
  de Registros Públicos - Administración - Reimpresión de Certificados

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @administracion_ReimpresiondeCertificados
  Escenario: Registros Públicos - Administración - Reimpresión de Certificados
    Y ingreso al sistema SII3 como admin16
    Cuando query para traer datos numOperacion numRecibo
    Cuando Buscamos por el boton principal de busqueda la bandeja Reimpresión de Certificados
    Entonces realizara acciones de Reimpresion de Certificados
