# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Abogados - Asignar XML a código de barras (proponentes)

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @AsignarXMLacódigodebarras_proponentes
  Escenario:  Registros Públicos - Abogados - Asignar XML a código de barras (proponentes)
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Asignar XML a código de barras (proponentes)
    Entonces realizara acciones de Asignar XML acodigo de barras_proponentes
