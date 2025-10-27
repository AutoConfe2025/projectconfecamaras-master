package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MttoLiquidacionPage {

    public static final Target BUSQUEDA_MMTO_LIQUIDACIONES = Target.the("Boton para ingresar a mtto liquidaciones")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target INPUT_NUMERO_LIQUIDACION = Target.the("Input para ingresar numero liquidacion")
            .located(By.id("_numliq"));
    public static final Target BTN_EDITAR_LIQUIDACION = Target.the("Boton para ingresar al formulario a editar")
            .located(By.xpath("//button[text()='Editar']"));
    public static final Target SELECT_ESTADO_LIQUIDACION = Target.the("Menu para seleccionar estado de la liquidacion")
            .located(By.id("idestado")); //VALUE 02 Y DESPUES 01
    public static final Target VALOR_ESTADO = Target.the("Valor del estado original")
            .located(By.xpath("//*[@id=\"idestado\"]/option[3]"));
    public static final Target GRABAR_DATOS_BASICOS = Target.the("Boton para guardar datos")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/div/div/div[1]/div/div/a[25]"));

    public static final Target BTN_ACEPTAR_ = Target.the("Boton para aceptar el grabado de datos")
            .located(By.xpath("//button[text()='OK']"));
    public static final Target MENSAJE_INFORMATIVOS = Target.the("Mensaje que informa el correcto guardado de datos")
            .located(By.xpath("//div[text()='Liquidación grabada']"));

}
