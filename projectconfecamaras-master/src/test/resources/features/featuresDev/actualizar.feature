# language: es

Característica: Actualizar Matriculas RUES / Actualizar Proponentes RUES

  @actualizarMatriculaRues @BloqueUno @general
  Escenario: Actualizar Matriculas RUES
    Dado Confecamaras requiere actualizar las matriculas rues
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y consulte por expedientes con el numero de matricula
    Entonces enviara matriculados al rues
    Y validara el hash

  @actualizarProponenteRues @BloqueUno @general
  Escenario: Actualizar Proponentes RUES
    Dado Confecamaras requiere actualizar los proponentes al rues
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y consulte por expedientes con el numero de proponente
    Entonces actualizara proponente al rues
    Y validara el mensaje