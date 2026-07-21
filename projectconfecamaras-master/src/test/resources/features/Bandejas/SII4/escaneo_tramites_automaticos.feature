# language: es
Característica: Escaneo de tramites automaticos
  como usuario quiero observar el escaneo de tramites automaticos

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras

  @EscaneoTramitesAutomaticos @Bandejas @SII4
  Escenario: Escaneo de tramites automaticos
    #Dado el Usuario requiere ver la informacion en Confecamaras
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Escaneo trámites automáticos
    Entonces validara las acciones de escaneo de tramites al codigo de barras 748079
