package com.co.confecamaras.userinterfaces.Bandejas.oficios_reclamaciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Page {

    public static final Target BOTON_RESPONDER_OFICIO = Target.the("boton de responder oficio").
            located(By.xpath("//a[@data-original-title='Responder oficio']"));
    public static final Target CAMPO_CARGUE_ARCHIVOS = Target.the("campo para cargar archivos").
            located(By.xpath("//input[@class='dz-hidden-input']"));
    public static final Target CAMPO_COMENTARIO = Target.the("campo para comentarios").
            located(By.xpath("//textarea[@class='form-control border-danger']"));
    public static final Target CAMPO_DOCUMENTO_RESPUESTA = Target.the("campo para documento respuesta").
            located(By.xpath("(//input[@class='form-control border-danger'])[1]"));
    public static final Target CAMPO_FECHA_RESPUESTA = Target.the("campo para fecha respuesta").
            located(By.xpath("(//input[@class='form-control border-danger'])[2]"));

    public static final Target BOTON_ACTUALIZAR_ARCHIVAR = Target.the("boton actualizar").
            located(By.xpath("(//button[@class='btn btn-primary btn-md'])[1]"));


}
