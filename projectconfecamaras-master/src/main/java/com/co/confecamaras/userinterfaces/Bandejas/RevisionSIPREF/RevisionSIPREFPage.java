package com.co.confecamaras.userinterfaces.Bandejas.RevisionSIPREF;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RevisionSIPREFPage {

    public static final Target CAMPO_FECHA_INICIAL = Target.the("Campo de Fecha Inicial")
            .located(By.id("fechainicial"));
    public static final Target ICONO_ENVIAR_SMS = Target.the("Icono de enviar SMS")
            .located(By.xpath("(//a[@data-original-title='Enviar SMS'])[1]"));
    public static final Target ICONO_MARCAR_COMO_REVISADO = Target.the("Icono de Marcar como revisado")
            .located(By.xpath("//*[@id='tablecb']/tbody/tr[1]/td[11]/p/small/a[2]"));

    public static final Target IMPUT_OBSERVACIONES = Target.the("imput de observaicones")
            .located(By.xpath("//*[@id='_observaciones']"));
    public static final Target BOTON_MARCAR_COMO_REVISADO = Target.the("Boton marcar como revisado")
            .located(By.xpath("//*[@id='frameSecundarioCentral']/center/table/tbody/tr/td[1]/a"));

    public static final Target IFRAME_SECUNDARIO = Target.the("Frame Secundario Central")
            .located(By.id("frameSecundarioCentral"));

    public static final Target BOTON_NOTIFICAR_EMAILS = Target.the("Boton Notificar emails")
            .located(By.xpath("//*[@id='frameSecundarioCentral']/center/table/tbody/tr/td[1]/a"));

    public static final Target MENSAJE_SIN_NOTIFICACION_GENERICO = Target.the("Mensaje No se ha notificado a ningun email")
            .located(By.xpath("//*[text()='No se ha notificado a ningún email']"));
    public static final Target MENSAJE_CON_NOTIFICACION_GENERICO = Target.the("Mensaje No se ha notificado a ningun email")
            .located(By.xpath("//*[text()='(*) relloficina@hotmail.com - Tipo : 01 - Enviado satisfactoriamente']"));
    public static final Target BOTON_NOTIFICAR_CELULAR = Target.the("Boton Notificar Celular")
            .located(By.xpath("//*[@id='frameSecundarioCentral']/center/table/tbody/tr/td[2]/a"));

    public static final Target BOTON_REGRESAR = Target.the("Boton Regresar")
            .located(By.xpath("//*[@id='frameSecundarioCentral']/center/table/tbody/tr/td[1]/a"));

}
