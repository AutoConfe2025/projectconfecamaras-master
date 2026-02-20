# language: es
Característica: Validar que permita la revision
  de  Registros Públicos - Estadísticas y Extracciones -  Relación de Usuarios Verificados

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras


  @RelacióndeUsuariosVerificados @SII4
  Escenario:  Registros Públicos - Estadísticas y Extracciones -  Relación de Usuarios Verificados
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Relación de Usuarios Verificados
    Entonces realizara acciones de Relacion de Usuarios Verificados
