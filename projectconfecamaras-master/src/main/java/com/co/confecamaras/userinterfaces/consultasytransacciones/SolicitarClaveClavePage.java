package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SolicitarClaveClavePage {

    public static Target BTN_SOLICITAR_CLAVE_AFILIADO = Target.the("Boton para ingresar al apartado de solicitar clave")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/div/ul/li/div[1]/li/div/ul/li/li[14]/a"));

    public static Target INPUT_MATRICULA = Target.the("Input para ongresar numero matirucla")
            .located(By.id("matricula"));

    public static Target INPUT_EMAIL = Target.the("Input para ongresar EMAIL")
            .located(By.id("correoelectronico"));

    public static Target BTN_GENERAR_CLAVE = Target.the("Boton para generar clave")
            .located(By.xpath("//button[@type='submit']"));

    public static Target MODAL_MENSAJE_GENERACION = Target.the("Mensaje de generacion de clave")
            .located(By.id("ModalTitulo"));
}
