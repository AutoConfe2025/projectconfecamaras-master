package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CertificadosPendientesPage {
    public static final Target INP_RECIBO = Target.the("ingresar numero de recibo")
            .located(By.xpath("//*[@id='reciboinicial']"));
    public static Target TXT_INFORMACION = Target.the("informacion de recibo archivado").locatedBy("//form/p");
    public static Target LINK_REGRESAR = Target.the("regresar").locatedBy("//a[text()='Regresar']");

    public static final Target ENLACE_CONSULTAR_EXPEDIENTE = Target.the("Enlace Consultar expediente por Tooltip")
            .located(By.xpath("//*[@id='tablecb']/tbody/tr/td[11]//a[@data-original-title='Consultar expediente']"));
    public static final Target ENLACE_CONSULTAR_FORMATO_NUEVO = Target.the("Enlace Consultar formato nuevo por Tooltip")
            .located(By.xpath("//*[@id='tablecb']/tbody/tr/td[11]//a[@data-original-title='Consulta formato nuevo']"));
}
