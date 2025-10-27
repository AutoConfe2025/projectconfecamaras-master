# language: es

Característica: Compra de certificado de un Persona Nacional por Opcion Consulta Acciones como usuario publico

  @CoCertificadoCaPnUsPu @Certificados @general

  Escenario: Certificado PN (CA)-Usuario Publico (CoCertificadoCaPnUsPu)
    Dado Confecamaras que un usuario publico realice la comprar de un certificado por la opcion consulta accionesPN
    Cuando ingrese al sistema SII3 como usuario publico por la opcion consulta acciones y realizar la compra de un certificado PN
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
      | Matricula    | 45132 |
      | Certificados | 1     |
    Entonces el sistema debe generar un certificado de PN desde la opcion consulta acciones