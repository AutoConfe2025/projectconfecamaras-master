package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TipoDocuemtoRuesPage {

    public static final Target TIPOS_DOC_RUES = Target.the("Boton para ingresar  a la opcion Mtto Bas TipoDoc Hom Rues")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target RECIBOS_CAJA_PRIVADOS = Target.the("Input para ingresar valor recibo caka")
            .located(By.id("bbb01.01.002"));

    public static final Target GRABAR_TIPO_DOC = Target.the("Boton para guardar la informacion")
            .located(By.id("submit"));

    public static final Target TABLA_TIPO_DOCUMENTALES = Target.the("Tabla que muestra los tipo documentos que existen")
            .located(By.id("tableTables"));
}
