package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class VinculosMatriculasRuesUI extends PageObject {

    public static final Target SELECT_TIPO_DOCUMENTOS_VINCULOS_RUES = Target.the("Seleccionar tipo documento")
            .located(By.id("selectTipoDoc"));

    public static final Target TXT_NUMERO_IDENTIFICACION_VINCULOS_RUES = Target.the("Escribir numero identificacion")
            .located(By.id("numIdentificacion"));

    public static final Target BTN_CONTINUAR_VINCULOS_RUES = Target.the("Boton numero identificacion")
            .located(By.xpath("//*[contains(text(), ' Consultar')]"));

    public static final Target BTN_CAMARA_COMERCIO_MANIZALES_VINCULOS_RUES = Target.the("Boton camara de comercio de manizales")
            .located(By.xpath("//h6[@class='h6']"));

    public static final Target LBL_VINCULOS_MATRICULAS_RUES = Target.the("Mesaje vinculos matriculas rues")
            .located(By.xpath("//td[normalize-space()='9000100056']"));
}