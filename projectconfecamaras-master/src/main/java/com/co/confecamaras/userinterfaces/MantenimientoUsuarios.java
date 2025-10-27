package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MantenimientoUsuarios extends PageObject {

    public static By CAJAQA_SRC = By.xpath("((//table)[8]//td[@title=\"CAJAQA\"])[1]");

    public static By EDITAR_BTN = By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[56]/td[7]/a");

    public static By GRABAR_CAMBIOS_BTN = By.xpath("//input[@value=\"Grabar cambios\"]");
    public static By REGRESAR_BTN = By.xpath("//a[@href=\"admMantenimientoUsuarios.php?accion=relacion\"]");
    public static By INACTIVAR_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=inactivar&idusuarioX=CAJAQA\"]");
    public static By ACTIVAR_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=reactivar&idusuarioX=CAJAQA\"]");
    public static By PERFIL_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=permisos&idusuarioX=CAJAQA\"]");
    public static By GRABAR_BTN = By.xpath("//a[text()='Grabar']");
    public static By ESPECIALES_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=permisosespeciales&idusuarioX=CAJAQA\"]");
    public static By REGRESAR_DOS_BTN = By.xpath("//div[@id=\"frameSecundarioCentral\"]//center//a//img");

    public static By CLAVE_MAIL_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=generarclave&idusuarioX=CAJAQA\"]");
    public static By CLAVE_SMS_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=generarclavesms&idusuarioX=CAJAQA\"]");
    public static By FIRMA_JPG_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=firma&idusuarioX=CAJAQA\"]");
    public static By FIRMA_GIF_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=firmagif&idusuarioX=CAJAQA\"]");
    public static By RUTAS_BTN = By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=rutas&idusuarioX=CAJAQA\"]");

    public static final Target VAL_MANT_USUARIOS = Target.the("")
            .located(By.xpath("//div[@id=\"gridbox\"]//tr[@class=\" odd_dhx_skyblue\"]//td//a[@href=\"admMantenimientoUsuarios.php?accion=firma&idusuarioX=CAJAQA\"]"));

}
