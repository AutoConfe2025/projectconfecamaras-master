# language: es

Característica: Compra de certificado de un Agencia por Opcion Certificados como usuario publico

  @CoCertificadoOcAgenciaUsPu @Certificados @general

  Escenario: Certificado Agencia (OC)-Usuario Publico
    Dado Confecamaras que un usuario publico realice la comprar un certificado Agencia
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de certificados y realizar la compra de un certificado Agencia
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 29734 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado de Agencia