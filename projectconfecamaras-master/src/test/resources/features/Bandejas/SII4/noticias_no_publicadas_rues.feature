# language: es
Característica: Validar que permita ver las noticias
  no publicadas en RUE

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @NoNoticiasEnRUE @Bandejas @SII4
  Escenario: Validar noticias no publicadas RUE
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Noticias No Publicadas En RUE
    Entonces buscara el registro RP01-38663-1 para validar las acciones de Noticias RUE

