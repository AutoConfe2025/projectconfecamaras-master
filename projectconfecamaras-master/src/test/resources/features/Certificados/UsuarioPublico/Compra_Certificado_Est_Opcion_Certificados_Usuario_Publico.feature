# language: es

Característica: Compra de certificado de un Establecimiento por Opcion Certificados como usuario publico

  @CoCertificadoOcEstUsPu @Certificados @general

  Escenario: Certificado Est (OC)-Usuario Publico
    Dado Confecamaras que un usuario publico realice la comprar un certificado EST
    Cuando ingrese al sistema SII3 por la URL del Home como usuario publico por la opcion de certificados y realizar la compra de un certificado EST
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 399 |
      | Certificados | 1   |
    Entonces el sistema debe generar un certificado de EST