# language: es

Característica: revision de reingreso de tramites rues

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoModuloInformeDiarioDeCaja
  Escenario: valido el flujo de reingreso de tramites rues
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Reingreso de trámites RUES"
    Entonces ingreso al tramite devuelto y realizo las validaciones