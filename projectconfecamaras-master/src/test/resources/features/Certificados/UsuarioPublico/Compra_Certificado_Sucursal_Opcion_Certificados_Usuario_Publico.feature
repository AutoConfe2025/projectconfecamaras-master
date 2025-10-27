# language: es

Característica: Compra de certificado Sucursal por Opcion Certificados como usuario publico

  @CoCertificadoOcSucursalUsPu @Certificados @general

  Escenario: Certificado Sucursal (OC)-Usuario Publico (@CoCertificadoOcSucursalUsPu)
    Dado Confecamaras que un usuario publico realice la comprar un certificado Sucursal
    Cuando ingrese al sistema SII3 como usuario publico por la opcion de certificados y realizar la compra de un certificado Sucursal
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 89569 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado de Sucursal