# language: es

Característica: revision de flujo de estadisticas y extracciones extraccion de libros Actos

  Antecedentes: ingreso plataforma confecamaras
    Dado Confecamaras ingresa al sistema de confecamaras

  @ValidoFlujoExtraccionLibrosActos @SII4
  Escenario: valido el flujo de estadisticas y extracciones extraccion de libros Actos
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingreso solo bandeja "Extracción de Libros - Actos"
    Entonces lleno el formulario de extraccion
    Y valido que se muestre el mensaje de exito
