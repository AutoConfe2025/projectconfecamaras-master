# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Relación de Reimpresión Certificados

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RelaciondeReimpresionCertificados
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Relación de Reimpresión Certificados
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Relación de Reimpresión Certificados
    Entonces realizara acciones de Relacion de Reimpresion Certificados
