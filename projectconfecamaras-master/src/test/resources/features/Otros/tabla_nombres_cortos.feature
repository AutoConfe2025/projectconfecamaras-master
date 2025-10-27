# language: es

Característica: Tabla Nombre Cortos

  @tablaNombreCortos @BloqueCuatro @general
  Escenario: Tabla Nombre Cortos
    Dado Confecamaras requiere realizar la validacion de Tabla Nombres Cortos
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Administracion, Tabla Nombres Cortos
    Entonces realizara la consulta de tabla nombres cortos