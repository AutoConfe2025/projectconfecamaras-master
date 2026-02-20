# language: es
Característica: Validar Proceso de Sellar Inscripcion



  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @Validar_pdf_sellos @SII4
  Escenario: Validacion de descarga de PDF
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Sellar Inscripciones
    Entonces validara las acciones de sellar inscripcion