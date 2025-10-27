# language: es

Característica: Radicacion Cancelacion de Proponente

  @cancelacionProponente @BloqueUno @general @proponetes
  Escenario: Radicacion Cancelacion de Proponente (@cancelacionProponente)
    Dado Confecamaras requiere realizar la cancelacion de proponente
    Cuando Confecamaras ingrese en la aplicacion con sus credenciales cajero
      | Camara         | 20         |
      | Usuario        | CAJAQA     |
      | Identificacion | 11314260   |
      | Contraseña     | 2837279    |
    Y seleccione Consultas y Transacciones, Consultas Registros Publicos, Expedientes
    Entonces consultara con el numero de proponente y comenzara a realizar las acciones requeridas
      | Consulta       | Proponente |
      | Proponente     | 3844       |
      | Identificacion | 1026265083 |
      | Correo         | analistaqa@confecamaras.org.co |
    Y validara que se haya realizado la cancelacion del proponente exitosamente