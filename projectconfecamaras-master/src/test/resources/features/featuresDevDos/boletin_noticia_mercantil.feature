# language: es

Característica: Boletin Noticia Mercantil

  @boletinNoticiaMercantil @BloqueDos @general
  Escenario: Boletin Noticia Mercantil
    Dado Confecamaras requiere realizar el Boletin Noticia Mercantil
    Cuando ingresa las credenciales de cajaqa en la aplicacion SII3
    Y seleccione Modulo de Registro, Registros publicos estadisticas extracciones, Boletin Noticia Mercantil
    Entonces verificara que se genera el resporte