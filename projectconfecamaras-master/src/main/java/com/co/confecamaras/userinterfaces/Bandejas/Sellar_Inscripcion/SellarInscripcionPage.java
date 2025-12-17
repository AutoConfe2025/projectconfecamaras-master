package com.co.confecamaras.userinterfaces.Bandejas.Sellar_Inscripcion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SellarInscripcionPage {




    public static final Target BODY_PRINCIPAL = Target.the("Cuerpo Principal de la Página").located(By.tagName("body"));

    // Mantener el Target funcional
    public static final Target ENLACE_ACCION_FILA_UNO = Target.the("Primer Enlace de Sellar Inscripcion")
            .located(By.xpath("(//a[@data-original-title='Sellar']/*[local-name()='svg'])[1]"));



    public static final Target ENLACE_CAJAQA = Target.the("Enlace del funcionario CAJAQA")
            .located(By.xpath("//a[text()='CAJAQA']"));

    public static final Target ENLACE_DESCARGAR_SELLO = Target.the("Enlace para Descargar sello")
            .located(By.xpath("//*[@id='formMensajes']/p/a[text()='Descargar sello']"));
}
