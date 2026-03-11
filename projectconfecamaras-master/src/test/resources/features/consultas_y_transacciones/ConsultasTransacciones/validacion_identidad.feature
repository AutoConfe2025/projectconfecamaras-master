# language: es
Característica: Validar permita verificar
  la identidad

  @VerificacionIdentidad @BloqueOcho @general
  Escenario: Verificacion de identidad
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | admin    |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Verificación de Identidad que abrira una nueva ventana
    Entonces el usuario verificara su identidad