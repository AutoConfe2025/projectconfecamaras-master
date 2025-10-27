# language: es

Característica: Consulta Desistimientos Decretados

  @consultaDesistimientos @BloqueUno @general
  Escenario: Consulta Desistimientos Decretados
    Dado Confecamaras requiere consultar Desistimientos Decretados
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Consultas y Transacciones, Consultas Registros Publicos, Desistimientos decretados
    Entonces podra visualizar el Acto de desistimiento con el numero
    Y validara el resultado mostrado