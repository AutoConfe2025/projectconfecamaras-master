package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReportesEEPage {

    public static final Target BTN_VER_EXPEDIENTE = Target.the("Descarga un archivo").
            located(By.xpath("(//*[name()='svg'][@role='img'])[1]"));

    public static final Target BTN_REGISTRAR = Target.the("Boton registrar ").
            located(By.cssSelector("a:nth-child(1) button:nth-child(1)"));

    public static Target BTN_PUBLICAR_NOTICIA_RUES = Target.the("Boton Publicar noticia en RUES").
            located(By.cssSelector("a:nth-child(2) button:nth-child(1)"));

    public static Target BTN_CARGAR_REPOSITORIO_RUES = Target.the("Boton Cargar al repositorio RUES").
            located(By.cssSelector("a:nth-child(3) button"));

    public static Target BTN_REGRESAR_AUDITORIA = Target.the("Boton Cargar al repositorio RUES").
            located(By.cssSelector("a:nth-child(3) button"));
}
