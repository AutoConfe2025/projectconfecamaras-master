# language: es

Característica: Compra de certificado Proponente por Opcion Certificados como usuario publico

  @CoCertificadoCrPpUsPu @Certificados @general

  Escenario: Certificado RUP (OC)-Usuario Publico
    Dado Confecamaras que un usuario publico realice la comprar un certificado RUP
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de certificados y realizar la compra de un certificado RUP
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Proponente    | 3710 |
      | Certificados  | 1    |
    Entonces el sistema debe generar un certificado de RUP