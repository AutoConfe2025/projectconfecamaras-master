# language: es
Característica: Validar que permita la revision
  de Registros Públicos - Administración - Sincronizar Certificas Matrícula

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @SincronizarCertificasMatrícula @SII4
  Escenario: Registros Públicos - Administración - Sincronizar Certificas Matrícula
    Y ingreso al sistema SII3 como admin20
    Cuando Buscamos por el boton principal de busqueda la bandeja Sincronizar Certificas Matrícula
    Entonces realizara acciones de  Sincronizar Certificas Matricula
