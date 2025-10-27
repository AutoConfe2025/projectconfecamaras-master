# language: es

Característica: Compra de certificado de un EST por Opcion Consulta Detallada como usuario publico

  @CoCertificadoCdEstUsPu @Certificados @general

  Escenario: Certificado EST (CD)-Usuario Publico
    Dado Confecamaras que un usuario publico realice la comprar un certificado por consulta detallada Establecimiento
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de consulta detallada y realizar la compra de un certificado Establecimiento
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 399 |
      | Certificados | 1   |
    Entonces el sistema debe generar un certificado por opcion Consulta Detallada de Establecimiento