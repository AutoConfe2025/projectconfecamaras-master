# language: es
Característica: Validar que permita la revision
  de revision Administración - Tipos Certificados Especiales

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @AdministraciónTiposCertificadosEspeciales @SII4
  Escenario: Registros Públicos - Administración - Tipos Certificados Especiales
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Tipos Certificados Especiales
    Entonces realizara acciones de tipos certificados especiales
