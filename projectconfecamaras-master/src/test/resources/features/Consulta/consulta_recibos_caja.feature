# language: es

Característica: Consulta Recibos de Caja

  @consultaReciboCaja @BloqueUno @general
  Escenario: Consulta Recibos de Caja
    Dado Confecamaras requiere consultar los recibos de caja
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Consultas y Transacciones, Consultas Registros Publicos, Recibos
    Entonces podra consultar mediante el numero de recibo el recibo
