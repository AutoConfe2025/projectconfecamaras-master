package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class VinculosIdentificacion extends PageObject {

    public static final Target BTN_TIPO_DOCUMENTO_VINCULOS = Target.the("Boton seleccionar documento")
            .located(By.id("tipoIdentificacion"));

    public static final Target TXT_IDENTIFICACION_VINCULOS = Target.the("Escribir numero de identificacion")
            .located(By.id("numIdentificacion"));

    public static final Target BTN_BUSCAR_VINCULOS = Target.the("Boton buscar")
            .located(By.xpath("//button[@class=\"btn btn-primary\"]"));

    public static final Target BTN_SOLICITUD_CERTIFICADO_VINCULOS = Target.the("Boton solicitud certificado")
            .located(By.xpath("//a[@data-original-title=\"Solicitud de certificado\"]"));

    public static final Target LBL_MENSAJE_SOLICITUD_CERTIFICADOS = Target.the("Mesaje solicitud certificado")
            .located(By.xpath("//*[contains(text(), 'Solicitud de certificados')]"));
}