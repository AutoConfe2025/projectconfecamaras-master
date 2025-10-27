# language: es

Característica:  Extraccion de Matriculados / Extraccion de Afiliados

  @matriculados @BloqueDos @general
  Escenario: Extraccion de Matriculados
    Dado Confecamaras requiere realizar la Extraccion de Matriculados
    Cuando ingresa en la aplicacion Sii3 con las credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Matriculados
    Entonces validara que la extraccion matriculados se realizo correctamente

  @afiliados @BloqueDos @general
  Escenario: Extraccion de Afiliados
    Dado Confecamaras requiere realizar la Extraccion de Afiliados
    Cuando ingresa en la aplicacion Sii3 con las credenciales asignadas
    Y seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Afiliados
    Entonces validara que la extraccion afiliados se realizo correctamente