# language: es

Característica: Compra de certificado de un Persona Juridica por Opcion Consulta Detallada como usuario publico

  @CoCertificadoCdPjUsPu @Certificados @general

  Escenario: Certificado PJ (CD)-Usuario Publico
    Dado Confecamaras que un usuario publico realice la comprar un certificado por consulta detallada PJ
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de consulta detallada y realizar la compra de un certificado PJ
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 46860 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado por opcion Consulta Detallada de PJ