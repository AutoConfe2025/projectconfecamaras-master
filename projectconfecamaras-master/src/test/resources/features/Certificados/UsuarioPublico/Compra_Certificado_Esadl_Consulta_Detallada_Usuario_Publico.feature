# language: es

Característica: Compra de certificado de un ESADL por Opcion Consulta Detallada como usuario publico

  @CoCertificadoCdEsadlUsPu @Certificados @general

  Escenario: Certificado ESADL (CD)-Usuario Publico
    Dado Confecamaras que un usuario publico realice la comprar un certificado por consulta detallada ESADL
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de consulta detallada y realizar la compra de un certificado ESADL
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | S0000019 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado por opcion Consulta Detallada de ESADL