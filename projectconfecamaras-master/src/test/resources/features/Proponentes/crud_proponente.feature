# language: es

Característica: Radicacion Inscripcion de Proponente Persona Natural / Renovacion de Proponente Persona Natural

  @inscripcionProponente @BloqueUno @general @proponetes
  Escenario: Radicacion Inscripcion de Proponente Persona Natural
    Dado Confecamaras requiere realizar la Radicacion Inscripcion de Proponente Persona Natural
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Consultas y Transacciones, Tramites Registros Publicos, Expedientes
    Entonces inscribira al proponente

  @renovacionProponente @BloqueUno @general @proponetes
  Escenario: Radicacion Renovacion de Proponente
    Dado Confecamaras requiere realizar la Radicacion Inscripcion de Proponente Persona Natural
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Consultas y Transacciones, Tramites Registros Publicos, Expedientes
    Entonces radicara renovacion