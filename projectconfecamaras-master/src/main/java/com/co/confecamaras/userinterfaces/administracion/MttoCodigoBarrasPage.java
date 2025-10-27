package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MttoCodigoBarrasPage {

    public static final Target MMTO_CODIGO_BARRAS = Target.the("Bton para seleccionar el aparatado Mtto Codigos Barras")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target INPUT_COD_BARRAS = Target.the("Input para ingresar codigo de barras")
            .located(By.id("_cb"));

    public static final Target BTN_EDITAR_COD = Target.the("Bton para editar codigo de barras")
            .located(By.xpath("//button[text()='Editar']"));

    public static final Target SELECT_ESTADO = Target.the("Menu desplegable para elegir un estado")
            .located(By.id("_estadofinal"));  // Select primer 15 y luego al value 16

    public static final Target ESTADO_ENVIADO = Target.the("Menu desplegable para elegir un estado")
            .located(By.xpath("//*[@id=\"_estadofinal\"]/option[13]"));

    public static final Target ESTADO_ARCHIVADO = Target.the("Menu desplegable para elegir un estado")
            .located(By.xpath("//*[@id=\"_estadofinal\"]/option[14]"));

    public static final Target BTN_GIUARDAR_COD = Target.the("Bton para guardar info del codigo de barras")
            .located(By.id("submit"));

}
