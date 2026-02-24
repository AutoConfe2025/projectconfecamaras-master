# language: es
Característica: Validar la sincronizacion de alarma de registro
  como usuario quiero validar que me muestre informacion pendiente

  @AlarmasRegistro @BandejaRegistrosPublicos @BloqueSiete @general
  Escenario: Validar la alarma registro
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Alarmas Registro que abrira una nueva ventana
    Entonces validara la sincronizacion e informacion encontrada