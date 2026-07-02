# language: es

Característica: Expedientes
 Antecedentes: Ingreso al aplicativo
   Dado Confecamaras ingresa al sistema de confecamaras


@Expedientes_Matricula @Expediente @SII4
Escenario: consulta por Matricula
  Y ingreso al sistema SII3 como usuario publico
  Cuando ingrese los datos correspondientes a la consulta de expediente por matricula

@Expedientes_Nombre @Expediente @SII4
Escenario: consulta por Nombre
  Y ingreso al sistema SII3 como usuario publico
  Cuando ingrese los datos correspondientes a la consulta de expediente por Nombre

@Expedientes_Proponente @Expediente @SII4
  Escenario: consulta por Proponente
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingrese los datos correspondientes a la consulta de expediente por Proponente

@Expedientes_Palabras @Expediente @SII4
  Escenario: consulta por Palabra
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingrese los datos correspondientes a la consulta de expediente por Palabras

@Expedientes_Identificacion @Expediente @SII4
  Escenario: consulta por Identificacion NIT
    Y ingreso al sistema SII3 como usuario publico
    Cuando ingrese los datos correspondientes a la consulta de expediente por Identificacion NIT
