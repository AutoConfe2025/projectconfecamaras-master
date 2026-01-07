# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Escaneo - Relación de anexos documentales

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RelaciondeAnexosDocumentales
  Escenario:  Registros Públicos - Escaneo - Relación de anexos documentales
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Relación de anexos documentales
    Entonces realizara acciones de Relacion de Anexos Documentales
