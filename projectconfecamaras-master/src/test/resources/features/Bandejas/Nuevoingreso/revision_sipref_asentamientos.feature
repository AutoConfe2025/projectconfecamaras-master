# language: es
Característica: Validar que permita la revision
  de revision SIPREF Asentamientos

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RevisionSIPREF_Asentamientos
  Escenario: Tramites devueltos sin destinamiento detectado
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Revision SIPREF (Asentamientos)
    Entonces validar las acciones de revision sipref asentamientos