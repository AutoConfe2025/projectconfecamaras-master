# language: es

Característica: Compra de certificado de un agencia por Opcion Consulta Acciones como usuario publico

  @CoCertificadoCaAgenciaUsPu @Certificados @general

  Escenario: Certificado Agencia (CA)-Usuario Publico (CoCertificadoCaAgenciaUsPu)
    Dado Confecamaras que un usuario publico realice la comprar de certificado por opcion Acciones agencia
    Cuando ingrese al sistema SII3 como usuario publico por la opcion Acciones y realizar la compra de un certificado agencia
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula      | 29734                          |
      | Certificados   | 1                              |
    Entonces el sistema debe generar un certificado por opcion Acciones de agencia