# language: es

Característica: Realizar carga de soportes en contratos tramite de actualizacion de proponentes

  @ContratosRup

  Escenario: Carga de soportes en contratos actualizacion RUP
    Dado Confecamaras que un usuario cajero realice la carga de soportes en contratos
    Cuando ingrese al sistema SII3 como usuario cajero y realice una actualizacion RUP
      | Camara         | 20       |
      | Usuario        | Cajaqa   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
      | Proponente     | 3051     |
      | Recuperacion   | ML3XIJ   |
    Entonces el sistema debe permitir el cargue en todos los contratos