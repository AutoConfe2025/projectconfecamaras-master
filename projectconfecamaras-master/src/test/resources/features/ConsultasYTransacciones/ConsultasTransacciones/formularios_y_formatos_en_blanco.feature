# language: es

Característica: Formularios Y Formatos En Blanco

  @formulariosYFormatosEnBlanco @BloqueSeis @general
  Escenario: Formularios Y Formatos En Blanco
    Dado Confecamaras requiere consultar formularios y formatos en blanco
    Cuando ingrese al sistema SII3 como usuario publico
      | Camara         | 20       |
      | Usuario        | CAJAQA   |
      | Identificacion | 11314260 |
      | Contraseña     | 2837279  |
    Y seleccione los formatos y los descargue
    Entonces podra ver los archivos
