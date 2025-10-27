# language: es

Característica: Compra Certificado Pn Usuario Externo

  @compraCertificadoPnUsuarioExterno @BloqueDos @general
  Escenario: Compra Certificado Pn Usuario Externo
    Dado Confecamaras requiere realizar la Compra Certificado Pn Usuario Externo
    Cuando ingresa las credenciales de usuario externo en la aplicacion SII3
    Y seleccione Certificados e ingrese el numero de la matricula
    Entonces validara que realizo la compra del certificado con su usuario externo