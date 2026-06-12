# language: es
Característica: Validar que permita la revision de revision SIPREF Asentamientos

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RevisionSIPREF_Asentamientos @Bandejas @SII4
  Escenario: revision sipref asentamientos
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Revision SIPREF (Asentamientos)
    Entonces validar las acciones de revision sipref asentamientos