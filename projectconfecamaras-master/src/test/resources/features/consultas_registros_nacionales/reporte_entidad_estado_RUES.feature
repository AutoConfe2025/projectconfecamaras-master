# language: es

Característica: validacion de reporte entidad estado rues

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionReporteEntidadEstadoRUES
  Escenario: valido el proceso de entidad de estado Rues
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Reporte Entidad del estado (RUES)"
    Entonces ingreso el numero de NIT "810002311"
