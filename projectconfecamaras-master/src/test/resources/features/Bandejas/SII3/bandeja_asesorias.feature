# language: es
Característica: Validar caracteristicas de Bandeja de asesorias
  como usuario quiero validar la bandeja de asesorias

  @BandejaAsesorias @BloqueOcho @general
  Escenario: Validar bandeja de asesorias
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Bandeja de asesorias que abrira una nueva ventana
    Entonces validara las acciones de asesorias relacionados al id 337458