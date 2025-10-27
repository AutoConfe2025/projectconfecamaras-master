# language: es

Característica: Expedientes

@Expedinetes_Matricula
Escenario: consulta por Matricula
Dado Confecamaras requiere agregar un nuevo cupo
Cuando ingrese al sistema SII3 como usuario publico
| Camara         | 20         |
| Usuario        | CAJAQA     |
| Identificacion | 11314260   |
| Contraseña     | 2837279    |
Y  ingrese los datos correspondientes a la consulta de expediente por matricula