# language: es

Característica: revision de empresas CFE

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @Empresas_CFE @SII4
  Escenario: valido el flujo de empresas CFE
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Empresas CFE"
    Y realizo el proceso de creacion de nueva entidad
    Entonces realizo proceso de modificacion y eliminacion