package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AnulacionRecibosCajaUI extends PageObject {

    public static final Target TXT_NUMERO_RECIBO_ANULACION = Target.the("Escribir numero recibo")
            .located(By.id("_recibo"));

    public static final Target BTN_RECUPERAR_RECIBO_UNO_ANULACION = Target.the("Boton recuperar recibo")
            .located(By.xpath("//a[contains(text(), 'Recuperar recibo')]"));

    public static final Target BTN_RECUPERAR_RECIBO_DOS_ANULACION = Target.the("Boton recuperar recibo")
            .located(By.xpath("//a[@href=\"javascript:cargarReciboAnulacion()\"]"));

    public static final Target SELECT_MOTIVO_ANULACION = Target.the("Seleccionar motivo")
            .located(By.id("_idmotivo"));

    public static final Target TXT_OBSERVACIONES_ANULACION_ANULACION = Target.the("Escribir observaciones anulacion")
            .located(By.id("_motivo"));

    public static final Target BTN_REVERSION_NORMAL_ANULACION = Target.the("Boton reversion normal")
            .located(By.xpath("//a[contains(text(), 'Reversión Normal')]"));

    public static final Target LBL_MENSAJE_REVERSO_RECIBO = Target.the("Mesaje reverso de recibo")
            .located(By.xpath("//table[@class=\"tblBorde\"]"));
}
