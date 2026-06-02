# language: es

Característica: Estudio e Inscripcion de Documentos Mercantil

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @estudioDocumentosMercantil
  Escenario: alarma registro
    Y ingreso al sistema SII3 como usuario publico
    Y seleccione Modulo de Registro, Registros Publicos, Estudio Mercantil
    #Cuando Buscamos por el boton principal de busqueda la bandeja (R) Estudio RegMtil
    #Entonces ingresara el codigo de barras mercantil y los datos necesarios
