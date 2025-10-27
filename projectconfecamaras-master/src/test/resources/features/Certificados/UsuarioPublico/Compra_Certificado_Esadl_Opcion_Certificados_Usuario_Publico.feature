# language: es

Característica: Compra de un certificado ESADL por Opcion Certificados como usuario publico

  @CoCertificadoOcEsadlUsPu @Certificados @general

  Escenario: Certificado ESADL (OC)-Usuario Publico
    Dado Confecamaras que un usuario publico realice la comprar un certificado ESADL
    Cuando ingrese al sistema SII3 por la URL del Home como usuario publico por la opcion de certificados y realizar la compra
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | S0000042 |
      | Certificados | 1        |
    Entonces el sistema debe generar un certificado de ESADL