# language: es
Característica: Validar que me permita realizar
  un pago electronicamente

    @PagarElectronicamente @BloqueOcho @general
  Escenario: Realizar pago electronicamente
    Dado el Usuario requiere ver la informacion en Confecamaras
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20                             |
      | Usuario        | analistaqa@confecamaras.org.co |
      | Identificacion | 1026265083                     |
      | Contraseña     | mqVC9(d54Qy@                   |
    Entonces entrara a solicitar la cantidad de 1 certificados para la matricula 42304 para realizar el pago