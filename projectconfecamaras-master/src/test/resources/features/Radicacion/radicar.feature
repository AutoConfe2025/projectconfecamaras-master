# language: es

Característica: Radicar Actos y Documentos Sin Costo / Radicar Deposito de estados financieros

  @actosDocumentosSinCosto @BloqueTres @general
  Escenario: Radicar Actos y Documentos Sin Costo
    Dado Confecamaras requiere Radicar Actos y Documentos Sin Costo
    Cuando Confecamaras ingresa en la aplicacion Sii3 con sus credenciales
    Y seleccione consulta por matricula e ingrese el numero correspondiente
    Entonces validara que se radico los documentos sin costo