# language: es

Característica: Firmado Manuscrito sobre

  @firmadoManuscritoSobre @BloqueData2 @general
  Escenario: Firmado Manuscrito sobre
    Dado Confecamaras requiere realizar el firmado de manuscrito sobre
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Consultas y Transacciones, Consultas Registros Publicos, Actualizacion de datos mutacion
    Entonces retomara el tramite y generara el codigo qr para su validacion
