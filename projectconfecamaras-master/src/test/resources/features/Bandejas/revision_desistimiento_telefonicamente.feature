# language: es
Característica: Validar que permita la revision
  de desistimiento telefonicamente

  @RevisionDesistimientoTelefonicamente @BloqueData3 @general
  Escenario: Validar entrega telefonicamente
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Revisión Desistimiento que abrira una nueva ventana
    Entonces con codigo de barras 13241857 realizara las acciones telefonicamente