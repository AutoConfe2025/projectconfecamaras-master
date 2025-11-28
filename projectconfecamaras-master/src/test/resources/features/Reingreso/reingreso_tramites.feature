# language: es

Característica: valida el reingreso de tramites

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @reingresoTramites @BloqueData @general
  Escenario: Reingreso de Tramites
    Dado Confecamaras requiere realizar el Reingreso de Tramites
    Cuando Confecamaras ingresa las credenciales asignadas en el aplicativo
    Y seleccione el Modulo de Registro, Registros publicos - gestions de caja, Reingreso de tramites
    Entonces validara el reingreso del codigo de barras