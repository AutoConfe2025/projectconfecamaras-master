package com.co.confecamaras.userinterfaces.Bandejas.MantenimientoTablasBasicas;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MensajesErrorPage {

    public static final Target BOTON_NUEVO_MENSAJE_ERROR = Target.the("Botón Nuevo mensaje de error")
            .located(By.xpath("//*[@id='formGenerico']/div/div[2]/button[@data-pr-tooltip='Nuevo mensaje de error']"));
    public static final Target ERROR_TITULO = Target.the("Campo de Error titulo de error ")
            .located(By.xpath("//input[@id='error' and @placeholder='Error']"));
    public static final Target MENSAJE_ERROR = Target.the("Campo de mensaje de error ")
            .located(By.xpath("//*[@id='error' and @placeholder='Mensaje']"));

    public static final Target BOTON_GRABAR = Target.the("Botón Grabar")
            .located(By.xpath("//div[contains(@id, '_content')]//button[contains(., 'Grabar')]"));
    public static final Target CAMPO_FILTRAR_ = Target.the("Campo filtrar en formulario genérico")
            .located(By.xpath("//*[@id='formGenerico']//input[@placeholder='Filtrar']"));
    public static final Target BOTON_ACTUALIZAR_ERROR = Target.the("Botón Actualizar Error")
            .located(By.xpath("//button[contains(@data-pr-tooltip, 'Actualizar Error')]"));

    public static final Target BOTON_ELIMINAR_ERROR= Target.the("Botón Eliminar error en la tabla")
            .located(By.xpath("//*[@id='formGenerico']//td[3]//button[@data-pr-tooltip='Eliminar error']"));
}
