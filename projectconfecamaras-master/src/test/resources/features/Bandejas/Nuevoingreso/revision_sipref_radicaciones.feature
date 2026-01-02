# language: es
Característica: Validar que permita la revision
  de revision SIPREF Radicaciones

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RevisionSIPREF_Radicaciones @SII4
  Escenario: Tramites devueltos sin destinamiento detectado
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Revision SIPREF (Radicaciones)
    Entonces validar las acciones de revision sipref radicaciones