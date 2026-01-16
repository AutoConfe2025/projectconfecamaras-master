# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Relación de Consultas Biométricas

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RelacionDeConsultasBiometricas
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Relación de Consultas Biométricas
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Relación de Consultas Biométricas
    Entonces realizara acciones de Relacion de Consultas Biometricas
