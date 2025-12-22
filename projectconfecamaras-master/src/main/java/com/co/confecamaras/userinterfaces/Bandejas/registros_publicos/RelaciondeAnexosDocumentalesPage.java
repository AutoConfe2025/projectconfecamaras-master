package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RelaciondeAnexosDocumentalesPage {

    public static final Target CAMPO_MATRICULA_INICIAL = Target.the("Campo Matrícula Inicial")
            .located(By.id("_matriculainicial"));
    public static final Target CAMPO_MATRICULA_FINAL = Target.the("Campo Matrícula Final")
            .located(By.id("_matriculafinal"));
    public static final Target CAMPO_SIN_IMAGEN = Target.the("Campo de sin imagen")
            .located(By.id("_pathx"));
    public static final Target BOTON_GENERAR_TABLA = Target.the("Botón Generar en tabla de entrada")
            .located(By.xpath("//*[@id='formEntrada']/center/table/tbody/tr/td/a[normalize-space(text())='Generar']"));
    public static final Target ENLACE_DESCARGAR = Target.the("Enlace para descargar archivo")
            .located(By.xpath("//*[@id='frameSecundarioCentral']/center/table/tbody/tr/td/div/table/tbody/tr/td/div/h2/a[normalize-space(text())='Descargar']"));
}
