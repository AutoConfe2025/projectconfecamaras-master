# language: es
Característica: Validar que permita la revision
  de Registros Públicos - Estadísticas y Extracciones - Auditoria RUES

  Antecedentes: Ingreso al aplicativo
    Dado Confecamaras ingresa al sistema de confecamaras

  @AuditoriaRues @SII4
  Esquema del escenario: Registros Públicos - Estadísticas y Extracciones - Auditoria RUES con la Letra <letra>
    Y ingreso al sistema SII3 como usuario publico
    Cuando Buscamos por el boton principal de busqueda la bandeja Auditoria RUES (1)
    Entonces realizara acciones de Auditoria RUES con la letra "<letra>"

    Ejemplos:
      | letra |
      | R     |
      | P     |