# language: es

Característica: Reingreso de Tramites en Bloque

  @reingresoTramitesBloque @BloqueData @general
  Escenario: Reingreso de Tramites en Bloque
    Dado Confecamaras requiere realizar el Reingreso de tramites en bloque
    Cuando Confecamaras ingresa las credenciales asignadas en el home page
    Y seleccione el Modulo de Registro, Registros publicos - gestions de caja, Reingreso de tramites en bloque
    Entonces validara el reingreso de los codigos de barras