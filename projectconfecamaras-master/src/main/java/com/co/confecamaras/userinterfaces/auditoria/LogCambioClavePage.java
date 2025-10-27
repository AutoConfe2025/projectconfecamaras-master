package com.co.confecamaras.userinterfaces.auditoria;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogCambioClavePage {


    public static final Target BTN_AUDITORIAS = Target.the("Boton para desplegar las diferentes auditorias disponibles")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[17]/li/a/div[1]"));

    public static final Target BTN_AUDITORIAS_GENERALES = Target.the("Boton para desplegar las diferentes auditorias generales  disponibles")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[17]/li/div/ul/li/div/li/a"));

    public static final Target BTN_LOG_CAMBIO_CLAVE = Target.the("Boton para desplegar las diferentes auditorias generales  disponibles")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[17]/li/div/ul/li/div/li/div/ul/li/li[1]/a"));

    public static final Target CALENDARIO = Target.the("Calendario para ingresar un rango de fechas")
            .located(By.id("dateLogCambioClave"));

    public static final Target CALENDARIO_ = Target.the("Calendario para ingresar un rango de fechas")
            .located(By.id("fechIni"));

    public static final Target BTN_FECHA_ATRAS = Target.the("Calendario para cambio de mes")
            .located(By.xpath("/html/body/div[3]/div[2]/div[1]/table/thead/tr[1]/th[1]"));

    public static final Target PRIMER_FECHA = Target.the("Calendario para ingresar un rango de fechas")
            .located(By.xpath("/html/body/div[3]/div[2]/div[1]/table/tbody/tr[2]/td[1]"));

    public static final Target SEGUNDA_FECHA = Target.the("Calendario para ingresar un rango de fechas")
            .located(By.xpath("/html/body/div[3]/div[2]/div[1]/table/tbody/tr[4]/td[7]"));

    public static final Target BTN_APLICAR = Target.the("Boton para aplicar el rango de fechas a buscar")
            .located(By.xpath("//button[@type='button' and text()='Aplicar']"));

    public static final Target BTN_CONSULTAR_LOG = Target.the("Boton consultar los logs en el rango de fecha")
            .located(By.xpath("//button[@type='submit' and text()='Consultar']"));

    public static final Target TABLA_LOG = Target.the("Boton consultar los logs en el rango de fecha")
            .located(By.id("modalAuxiliarLabel"));

    public static final Target BTN_EXPORTAR = Target.the("Boton consultar los logs en el rango de fecha")
            .located(By.id("mostrarseleccion"));

}
