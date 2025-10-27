# language: es

Característica: Compra de certificado de un EST por Opcion Consulta Acciones como usuario publico

  @CoCertificadoCaEstUsPu @Certificados @general

  Escenario: Certificado EST (CA)-Usuario Publico (CoCertificadoCaEstUsPu)
    Dado Confecamaras que un usuario publico realice la comprar un certificado por la opcion consulta acciones Establecimiento
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de consulta acciones y realizar la compra de un certificado Establecimiento
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 399 |
      | Certificados | 1   |
    Entonces el sistema debe generar un certificado por opcion Consulta Acciones de Establecimiento