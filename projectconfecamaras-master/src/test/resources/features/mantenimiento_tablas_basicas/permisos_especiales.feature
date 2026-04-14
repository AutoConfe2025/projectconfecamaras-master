# language: es

Característica: revision de flujo de permisos especiales

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoPermisosEspeciales @SII4
  Escenario: valido el flujo de permisos especiales
    Y ingreso al sistema SII3 como usuario publico16 admin
    Cuando ingreso solo bandeja "Permisos especiales"
    Entonces realizo el proceso de permisos especiales