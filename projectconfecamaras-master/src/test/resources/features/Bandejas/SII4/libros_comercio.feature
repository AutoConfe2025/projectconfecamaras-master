# language: es
Característica: Validar caracteristicas de libros de comercio

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @LibrosComercio @Bandejas @SII4
  Escenario: Validar libros de comercio
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Libros de comercio
    Entonces validara las acciones de libros de comercios relacionados al codigo de barras 747629