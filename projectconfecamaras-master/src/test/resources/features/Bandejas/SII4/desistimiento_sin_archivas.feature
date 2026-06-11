# language: es
Característica: Validar tramite con desistimiento sin archivar
  como usuario quiero realizar las acciones disponibles

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @DesistimientoSinArchivar @Bandejas @SII4
  Escenario: Validar desistimiento sin archivar
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Tramites con Desistimiento Sin Archivar
    Entonces validara las acciones de desistimiento sin archivar relacionados al codigo de barras 567377