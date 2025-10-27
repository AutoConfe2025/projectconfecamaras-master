# language: es

Característica: Compra de certificado Proponente por Consulta Detallada como usuario publico

  @CoCertificadoCdPpUsPu @Certificados @general

  Escenario: Certificado RUP (CD)-Usuario Publico (CoCertificadoCdPpUsPu)
    Dado Confecamaras que un usuario publico realice la comprar un certificado RUP por Consulta Detallada
    Cuando ingrese al sistema SII3 como usuario publico por Consulta Detallada y realizar la compra de un certificado RUP
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Proponente     | 3817                           |
      | Certificados   | 1                              |
    Entonces el sistema debe generar un certificado de RUP por Consulta Detallada