# language: es

Característica: Compra de certificado de un Agencia por Consulta Detallada como usuario publico

  @CoCertificadoCdAgenciaUsPu @Certificados @general

  Escenario: Certificado Agencia (CD)-Usuario Publico (CoCertificadoCdAgenciaUsPu)
    Dado Confecamaras que un usuario publico realice la comprar un certificado Agencia por Consulta Detallada
    Cuando ingrese al sistema SII3 como usuario publico por Consulta Detallada y realizar la compra de un certificado Agencia
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 29734 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado desde Consulta Detalladade para Agencia