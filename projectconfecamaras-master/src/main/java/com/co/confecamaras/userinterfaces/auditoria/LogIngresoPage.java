package com.co.confecamaras.userinterfaces.auditoria;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogIngresoPage {
    public static final Target BTN_LOG_INGRESO = Target.the("Boton para ingresar al apartado de log de ingresp")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[17]/li/div/ul/li/div/li/div/ul/li/li[2]/a"));

    public static final Target CALENDARIO_LOG_INGRESO = Target.the("Calendario para ingresar año y mes")
            .located(By.id("mes_busq"));

    public static final Target SELECT_TIPO_USUARIO = Target.the("Menu desplegable para seleccionar tipo de usuario")
            .located(By.id("tipousr"));

    public static final Target BTN_CONSULT = Target.the("BCalendario para ingresar año y mes")
            .located(By.xpath("//*[@id=\"formulario_busqueda\"]/div/form/div/div[8]/button"));

    //Seleccionar exteernos y usar modal loader

    public static final Target TABLA_LOG_INGRESOS = Target.the("Tabla que muestra el registro de logs de usuarios que han ingresado al sistema")
            .located(By.id("modalAuxiliarLabel"));

    public static final Target BTN_DESCARGAR_LOG = Target.the("Icono/boton para descargar el log")
            .located(By.xpath("(//a[@data-original-title='Descargar Log'])[1]"));

    public static final Target BTN_EXPORTAR_LOG = Target.the("Icono/boton para descargar el log")
            .located(By.id("mostrarseleccion"));
}
