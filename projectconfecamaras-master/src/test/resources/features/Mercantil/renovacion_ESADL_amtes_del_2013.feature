# language: es

Característica: Renovacion ESADL antes del año 2013


  @RenovaciónESADLantesdelaño2013 @BloqueCinco @general
  Escenario: Renovar ESADL antes del año 2013
    Dado Confecamaras requiere hacer una renovacion ESADL antes del dosmil trece
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |

    Y ingrese la cantidad a renovar por anio
    Entonces podra ver los anios renovados en la liquidacion