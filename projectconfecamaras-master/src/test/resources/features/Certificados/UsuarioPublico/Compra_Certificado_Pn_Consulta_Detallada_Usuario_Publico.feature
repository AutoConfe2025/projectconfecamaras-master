# language: es

Característica: Compra de certificado de un Persona Nacional por Consulta Detallada como usuario publico

  @CoCertificadoCdPnUsPu @Certificados @general

  Escenario: Certificado PN (CD)-Usuario Publico (CoCertificadoCdPnUsPu)
    Dado Confecamaras que un usuario publico realice la comprar un certificado PN
    Cuando ingrese al sistema SII3 como usuario publico por Consulta Detallada y realizar la compra de un certificado PN
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 42901 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado de PN