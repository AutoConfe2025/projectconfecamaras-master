# language: es

Característica: Consultas Liquidaciones

  @consultaLiquidaciones @BloqueDos @general
  Escenario: Consultas Liquidaciones
    Dado Confecamaras requiere realizar los Consultas Liquidaciones
    Cuando ingresa en la aplicacion web con las credenciales correctas
    Y seleccione Modulo de Registro, Registros publicos consultas internas, Consulta liquidaciones
    Entonces validara que realizo las consultas por cada modulo de busqueda