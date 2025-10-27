package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UsuariosApiIntegracionRestFullUI extends PageObject {

    public static final Target BTN_EDITAR_USUARIOS_API = Target.the("Boton editar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[4]/a"));

    public static final Target CHK_CONSULTAR_LISTA_RESPONSABILIDADES_USUARIOS_API = Target.the("Boton consultar lista responsabilidades")
            .located(By.xpath("//input[@name=\"metodo_75\"]"));

    public static final Target BTN_GRABAR_REGISTRO_USUARIOS_API = Target.the("Boton grabar registro")
            .located(By.xpath("//input[@onmouseover=\"Tip('Grabar registro')\"]"));

    public static final Target BTN_BORRAR_USUARIOS_API = Target.the("Boton borrar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[5]/a"));

    public static final Target LBL_MENSAJE_USUARIOS_API = Target.the("Mesaje usuarios api")
            .located(By.xpath("//td[contains(text(), ' Mantenimiento Usuarios - WS-API (relación)')]"));
}