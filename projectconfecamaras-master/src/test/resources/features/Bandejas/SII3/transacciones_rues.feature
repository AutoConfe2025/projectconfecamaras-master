# language: es
Característica: Validar que permita realizar
  las transacciones RUES

  @TransaccionesRues @BloqueSiete @general
  Escenario: Validar las transacciones RUES
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y consultara Transacciones RUES que abrira una nueva ventana
    Entonces realizara cada accion encontrada realiandon su debida validacion
