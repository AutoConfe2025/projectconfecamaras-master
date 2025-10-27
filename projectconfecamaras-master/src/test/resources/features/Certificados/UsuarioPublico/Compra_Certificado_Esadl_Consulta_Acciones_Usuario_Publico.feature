# language: es

Característica: Compra de certificado de un ESADL por Opcion Consulta Acciones como usuario publico

  @CoCertificadoCaEsadlUsPu @Certificados @general

  Escenario: Certificado ESADL (CA)-Usuario Publico (CoCertificadoCaEsadlUsPu)
    Dado Confecamaras que un usuario publico realice la comprar de certificado por opcion Acciones ESADL
    Cuando ingrese al sistema SII3 como usuario publico por la opcion Acciones y realizar la compra de un certificado ESADL
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula      | S0016421                       |
      | Certificados   | 1                              |
    Entonces el sistema debe generar un certificado por opcion Acciones de ESADL