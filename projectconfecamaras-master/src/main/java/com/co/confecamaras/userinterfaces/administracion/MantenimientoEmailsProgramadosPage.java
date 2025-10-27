package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MantenimientoEmailsProgramadosPage {

    public static final Target MANTENIMEINTO_EMAILS_PROGRAMADOS = Target.the("Bton para seleccionar el aparatado Maestro Transacciones - orden\n")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target BTN_AGREGAR_NUEVO = Target.the("Bton para Agregar")
            .located(By.xpath("//img[@onmouseover=\"Tip('Adicionar un registro')\"]"));

    public static final Target BTN_EDITAR = Target.the("Bton para Editar")
            .located(By.xpath("(//a[text()='Editar'])[1]"));

    public static final Target INPUT_IDE = Target.the("Input para escribir")
            .located(By.id("_id"));

    public static final Target BTN_TIPO = Target.the("Bton para Editar")
            .located(By.id("_tipo"));

    public static final Target BTN_ENAIL= Target.the("Bton para Editar")
            .located(By.id("_email"));


    public static final Target BTN_GUARDAR = Target.the("Bton para guardar info")
            .located(By.xpath("//input[@onmouseover=\"Tip('Grabar registro')\"]"));

    public static final Target BTN_ELIMINAR_EMAIL= Target.the("Bton para guardar info")
            .located(By.xpath("(//a[@target='_self' and text()='Borrar'])[9]"));


    public static final Target TEXTO_NOMBRE_ADM = Target.the("Bton para guardar info")
            .located(By.xpath("//td[@align='left' and text()='PRUEBA']"));


    public static final Target TEXTO_ADMINISTRADOR = Target.the("Bton para Editar")
            .located(By.xpath("//td[@title='ADMINISTRADOR DE SISTEMAS C.C. ']"));

    public static final Target TABLA_EMAILS = Target.the("Bton para Editar")
            .located(By.id("gridbox"));


}
