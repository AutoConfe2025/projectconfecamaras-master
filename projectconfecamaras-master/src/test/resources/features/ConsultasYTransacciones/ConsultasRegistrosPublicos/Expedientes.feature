# language: es

Característica: Expedientes
 Antecedentes: Ingreso al aplicativo
   Dado Confecamaras ingresa al sistema de confecamaras


@Expedientes_Matricula
Escenario: consulta por Matricula
  Y ingreso al sistema SII3 como usuario publico
  Cuando ingrese los datos correspondientes a la consulta de expediente por matricula

@Expedientes_Nombre
Escenario: consulta por Nombre
  Y ingreso al sistema SII3 como usuario publico
  Cuando ingrese los datos correspondientes a la consulta de expediente por Nombre

@Expedientes_Proponente
  Escenario: consulta por Proponente
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingrese los datos correspondientes a la consulta de expediente por Proponente

@Expedientes_Palabras
  Escenario: consulta por Palabra
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingrese los datos correspondientes a la consulta de expediente por Palabras

@Expedientes_Identificacion
  Escenario: consulta por Identificacion NIT
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingrese los datos correspondientes a la consulta de expediente por Identificacion NIT
