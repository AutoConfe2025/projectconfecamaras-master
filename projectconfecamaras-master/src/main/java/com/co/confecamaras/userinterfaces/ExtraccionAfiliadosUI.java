package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ExtraccionAfiliadosUI extends PageObject {

    public static final Target SELECT_TIPO_AFILIADO_INCLUIR_EXTRACCION_AFILIADOS = Target.the("Seleccionar el tipo de afiliado a incluir")
            .located(By.id("_tipo"));

    public static final Target TXT_EMAIL_EXTRACCION_AFILIADOS = Target.the("Escribir email")
            .located(By.id("_emailusuariosistema"));

    public static final Target BTN_GENERAR_DESDE_SII_EXTRACCION_AFILIADOS = Target.the("Boton generar desde Sii")
            .located(By.xpath("//a[@onmouseover=\"Tip('Generar desde SII')\"]"));

    public static final Target LBL_MENSAJE_EXTRACCION_AFILIADOS = Target.the("Mesaje extraccion afiliados")
            .located(By.xpath("//p[text()='Mensaje informativo']"));
}