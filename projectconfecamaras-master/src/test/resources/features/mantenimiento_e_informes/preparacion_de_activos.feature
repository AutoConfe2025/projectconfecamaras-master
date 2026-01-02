# language: es

Característica: validacion modulo de preparacion de activos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidacionModuloRevisionActivos @SII4
  Escenario: valido flujo de preparacion de activos
    Y ingreso al sistema SII3 como usuario admin
    Cuando ingreso solo bandeja "Preparación de Activos"
    Y lleno el formulario de mantenimiento de activos
    Entonces exporto el archivo de excel
