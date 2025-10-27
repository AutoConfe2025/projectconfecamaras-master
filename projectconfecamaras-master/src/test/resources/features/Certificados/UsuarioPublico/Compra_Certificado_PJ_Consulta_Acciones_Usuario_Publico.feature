# language: es

Característica: Compra de certificado de un Persona Juridica por Opcion Acciones como usuario publico

  @CoCertificadoCaPjUsPu @Certificados @general

  Escenario: Certificado PJ (CA)-Usuario Publico (CoCertificadoCaPjUsPu)
    Dado Confecamaras que un usuario publico realice la comprar un certificado por menu acciones PJ
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de menu acciones y realizar la compra de un certificado PJ
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 46860 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado por opcion menu acciones de PJ