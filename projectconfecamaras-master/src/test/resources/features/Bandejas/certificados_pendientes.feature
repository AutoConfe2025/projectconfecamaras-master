# language: es
Característica: Validar certicados pendientes
  como usuario quiero realizar las acciones disponibles

  @CertificadosPendientes @BloqueOcho @general
  Escenario: Validar certificados pendientes
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Certificados pendientes que abrira una nueva ventana
    Entonces validara las acciones de certificados pendientes relacionados al recibo S000487806