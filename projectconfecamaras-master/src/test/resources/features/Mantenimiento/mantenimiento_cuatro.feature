# language: es

Característica: Mantenimiento Municipios y Departamentos / Mantenimiento Sedes Biometria / Mantenimiento Barrios /
  Mantenimiento Terminos Condiciones / Mantenimiento CommonXX / Mantenimiento Claves Valor

  @municipiosDepartamentos @BloqueTres @general
  Escenario: Mantenimiento Municipios y Departamentos
    Dado Confecamaras requiere realizar el Mantenimiento Municipios y Departamentos
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales administrador
    Y seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Municipio y Departamentos
    Entonces validara que todas las opciones realizan su funcion correctamente

  @sedesBiometria @BloqueTres @general
  Escenario: Mantenimiento Sedes Biometria
    Dado Confecamaras requiere realizar el Mantenimiento Sedes Biometria
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales administrador
    Y seleccione Modulo de Registro, Registros publicos administracion, Sedes Biometria
    Entonces validara que las opciones funcionan adecuadamente

  @barrios @BloqueTres @general
  Escenario: Mantenimiento Barrios
    Dado Confecamaras requiere realizar el Mantenimiento Barrios
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales administrador
    Y seleccione Modulo de Registro, Registros publicos administracion, Barrios
    Entonces validara que las opciones cumplen con su funcion

  @terminosCondiciones @BloqueData @general
  Escenario: Mantenimiento Terminos Condiciones
    Dado Confecamaras requiere realizar el Mantenimiento Terminos Condiciones
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales administrador
    Y seleccione Modulo de Registro, Registros publicos administracion, T y C
    Entonces verificara que la opcion cumpla su funcion

  @commonXX @BloqueTres @general
  Escenario: Mantenimiento CommonXX
    Dado Confecamaras requiere realizar el Mantenimiento CommonXX
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales administrador
    Y seleccione Aseguramiento del SII, Mantenimiento del sii, Mantenimiento CommonXX
    Entonces verificara que se guarda la informacion correctamente

  @clavesValor @BloqueTres @general
  Escenario: Mantenimiento Claves Valor
    Dado Confecamaras requiere realizar el Mantenimiento Claves Valor
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales administrador
    Y seleccione Aseguramiento del SII, Mantenimiento del sii, Mantenimiento Claves Valor
    Entonces verificara que la informacion se guardo correctamente