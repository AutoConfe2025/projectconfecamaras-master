package com.co.confecamaras.userinterfaces.EstadisticasYExtracciones;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetalladoDePagosPorSIIPage {

       public static final Target CAMPO_FECHA_INICIO = Target.the("Campo de entrada Fecha Inicio")
            .located(By.id("_idfecini"));
    public static final Target CAMPO_FECHA_FIN = Target.the("Campo de entrada Fecha Inicio")
            .located(By.id("_idfecfin"));

    public static final Target BTN_CONSULTAR = Target.the("Boton Consultar")
            .located(org.openqa.selenium.By.xpath("//a[@onmouseover=\"Tip('Consultar')\"]"));
    public static final Target LINK_DESCARGAR_ARCHIVO = Target.the("Enlace Descargar archivo")
            .located(By.xpath("//form[@id='formMensajes']//a[contains(text(), 'Descargar archivo')]"));

    public static final Target CAMPO_FECHA_INICIAL = Target.the("Campo de entrada Fecha Inicial")
            .located(By.xpath("//*[@id='_fechainicial']"));

}
