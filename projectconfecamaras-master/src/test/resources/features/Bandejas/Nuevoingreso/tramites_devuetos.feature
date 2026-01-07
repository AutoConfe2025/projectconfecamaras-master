# language: es
Característica: Validar caracteristicas de Tramites devueltos
  como usuario quiero realizar las acciones disponibles

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras

  @TramitesDevueltos
  Escenario: Validar Tramites devueltos
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja (R) Tramites Devueltos.
    Entonces validara las acciones de tramites devueltos relacionados al codigo de barras "739374" "05"