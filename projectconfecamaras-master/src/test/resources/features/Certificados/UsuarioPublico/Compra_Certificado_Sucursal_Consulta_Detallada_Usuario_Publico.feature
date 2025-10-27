# language: es

Característica: Compra de certificado Sucursal por Consulta Detallada como usuario publico

  @CoCertificadoCdSucursalUsPu @Certificados @general

  Escenario: Certificado Sucursal (CD)-Usuario Publico (CoCertificadoCdSucursalUsPu)
    Dado Confecamaras que un usuario publico realice la comprar de un certificado por consulta detallada Sucursal
    Cuando ingrese al sistema SII3 como usuario publico por la consulta detallada y realizar la compra de un certificado Sucursal
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 89569 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado por opcion Consulta Detallada de Sucursal