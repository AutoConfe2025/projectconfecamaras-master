# language: es

Característica: Extraccion Experian Nuevo / Extraccion Informa Nuevo

  @extraccionExperianNuevo @BloqueDos @general
  Escenario: Extraccion Experian (nuevo)
    Dado Confecamaras requiere realizar la Extraccion Experian Nuevo
    Cuando ingresa sus credenciales de cajaqa en la aplicacion SII3
    Y seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Experian Nuevo
    Entonces verificara que se generan los resportes

  @extraccionInformaNuevo @BloqueDos @general
  Escenario: Extraccion Informa (nuevo)
    Dado Confecamaras requiere realizar la Extraccion Informa Nuevo
    Cuando ingresa sus credenciales de cajaqa en la aplicacion SII3
    Y seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Extraccion Informa Nuevo
    Entonces validara que se generan los resportes