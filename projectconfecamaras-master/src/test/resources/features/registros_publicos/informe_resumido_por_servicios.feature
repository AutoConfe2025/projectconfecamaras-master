# language: es

Característica: revision de informe resumido por servicios

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoModuloInformeDiarioDeCaja @SII4
  Escenario: valido el flujo de informe resumido por servicios
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Informe resumido por servicios"
    Entonces realiza la validacion del informe resumido