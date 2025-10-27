# language: es

Característica: Desafiliacion Masiva

  @desafiliacionMasiva @BloqueData @general
  Escenario: Desafiliacion Masiva
    Dado Confecamaras requiere realizar la Desafiliacion Masiva
    Cuando ingresa las credenciales asignadas en la aplicacion SII3
    Y seleccione Modulo de Registro, Procesos sipref gobernabilidad, Desafiliacion Masiva
    Entonces validara que se puede realizar las desafiliaciones masivas