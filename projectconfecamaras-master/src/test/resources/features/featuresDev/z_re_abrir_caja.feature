# language: es

Característica: Re-Abrir Caja

  @reAbrirCaja @BloqueCuatro @general
  Escenario: Re Abrir Caja
    Dado Confecamaras requiere re abrir la caja
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales
    Y seleccione Modulo de Registro, Registros Publicos, Administracion
    Entonces re abrira la caja con el siguiente operador
    Y validara que se haya realizado una apertura de caja exitosa