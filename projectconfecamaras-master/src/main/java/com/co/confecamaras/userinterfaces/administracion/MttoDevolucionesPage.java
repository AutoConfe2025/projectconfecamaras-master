package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MttoDevolucionesPage {

    public static final Target MMTO_DEVOLUCIONES = Target.the("Boton para Ingresar al apartado Mtto Devoluciones")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target BTN_CONTINUAR_CONSULTA_DEVOLUCIONES = Target.the("Boton para Consultar devoluciones por año")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target INPUT_DEVOLUCIONES = Target.the("Input para filtrar busqueda")
            .located(By.xpath("//input[@type='search']"));

    public static final Target BTN_EDITAR = Target.the("Boton para editar una devolucion")
            .located(By.xpath("(//a[@data-original-title='Editar'])[1]"));
    public static final Target SELECT_PROCEDE_REINGRESO = Target.the("Menu desplegable para elegir un estado")
            .located(By.id("_tipodevolucion")); //VALUE = D
    public static final Target BTN_GUARDAR = Target.the("Boton para guardar cambios")
            .located(By.id("submit"));
    public static final Target VALOR_ESTADO_PROCEDE_REINGRESO = Target.the("Valor de texto a validar de estado")
            .located(By.xpath("//*[@id=\"_tipodevolucion\"]/option[2]"));
    public static final Target VALOR_ESTADO_ORIGINAL = Target.the("Tabla devoluciones")
            .located(By.xpath("//*[@id=\"_tipodevolucion\"]/option[3]"));


}
