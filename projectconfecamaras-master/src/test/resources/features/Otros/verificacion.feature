# language: es

Característica: Verificacion Multas Vencidas Ponal / Verificacion ANI

  @multasVencidasPonal @BloqueTres @SinDataDevDosUno @general
  Escenario: Verificacion Multas Vencidas Ponal
    Dado Confecamaras requiere realizar la Verificacion Multas Ponal
    Cuando ingresa en la aplicacion Sii3 con sus credenciales
    Y seleccione Modulo de Registro, Registros publicos consultas internas, Verificacion Multas Vencidas
    Entonces validara que la consulta de las multas se realizo de manera correcta

  @ani @BloqueTres @general
  Escenario: Verificacion ANI
    Dado Confecamaras requiere realizar la Verificacion ANI
    Cuando ingresa en la aplicacion Sii3 con sus credenciales
    Y seleccione Modulo de Registro, Registros publicos consultas internas, Verificacion ANI
    Entonces validara que la consulta de ANI se realizo de manera correcta
