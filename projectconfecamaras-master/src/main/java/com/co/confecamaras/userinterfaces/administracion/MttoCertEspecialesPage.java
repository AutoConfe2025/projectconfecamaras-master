package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MttoCertEspecialesPage {
    public static final Target BUSQUEDA_MTTO_CERT_ESPECIALES = Target.the("Boton para singresar a mtto cert especiales")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target INPUT_RECIVO = Target.the("Boton paraingresar recibo")
            .located(By.id("_numrec"));

    public static final Target BTN_EDITAR_CERT = Target.the("Boton para ingresar al formulario a editar")
            .located(By.xpath("//button[text()='Editar']"));


    public static final Target INPUT_NOMBRE_ = Target.the("Input para ingresar nombre del certificado")
            .located(By.id("nombre"));



    public static final Target BTN_GUARDAR = Target.the("Boton para guardar info")
            .located(By.id("submit"));


}
