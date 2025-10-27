# language: es

Característica: Consulta Calculo Digito de Verificacion

  @consultaCalculoDigito @BloqueUno @general
  Escenario: Validar Digito de Verificacion
    Dado Confecamaras requiere generar un codigo de verificacion
     Cuando Confecamaras ingrese en la aplicacion con sus credenciales
     Y seleccione Consultas y Transacciones, Consultas Registros Publicos, Calcular digito de verificacion
     Entonces podra generar el digito de verificacion ingresando cedula nit