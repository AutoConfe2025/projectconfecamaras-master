package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DepuracionRegistrosDosMilQuinceUI extends PageObject {

    public static final Target BTN_NO_INCLUIR_DEPURACION = Target.the("Boton no incluir")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[12]/a/img"));

    public static final Target BTN_SIGUIENTE_DEPURACION = Target.the("Boton siguiente")
            .located(By.xpath("//a[@onmouseover=\"Tip('Ir a página siguiente')\"]"));

    public static final Target BTN_EXCEL_DEPURACION = Target.the("Boton excel depurados")
            .located(By.xpath("//a[@onmouseover=\"Tip('Excel depurados')\"]"));

    public static final Target BTN_EXCEL_EXCLUIDOS_DEPURACION = Target.the("Boton excel excluidos")
            .located(By.xpath("//a[@onmouseover=\"Tip('Excel Excluidos')\"]"));

    public static final Target BTN_INICIO_DEPURACION = Target.the("Boton inicio")
            .located(By.xpath("//a[@onmouseover=\"Tip('Ir al inicio')\"]"));

    public static final Target LBL_MENSAJE_DEPURACION_REGISTROS = Target.the("Mensaje final depuracion registros")
            .located(By.id("campo"));
}