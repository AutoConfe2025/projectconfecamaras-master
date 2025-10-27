package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConexionSegaPage {



    public static final Target CONEXION_SEGA = Target.the("Boton para ingresar al apartado de mantenimiento SII3")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));
    //Cambiar pestaña

    public static final Target INPUT_RAIZ = Target.the("Boton para ingresar al apartado de mantenimiento SII3")
            .located(By.id("raiz"));

    public static final Target BTN_EDITAR = Target.the("Boton para ingresar al apartado de editar ")
            .located(By.xpath("//a[@class ='myButton' and text()='Editar']"));

    public static final Target TABLA_DATOS = Target.the("Tabla que muestra el contenido")
            .located(By.id("formMantenimientoConexionSega"));

    public static final Target NOMBRE_CAMARA = Target.the("Tabla que muestra el contenido")
            .located(By.xpath("//a[@target ='_self' and text()='CAMARA DE COMERCIO DE MANIZALES']"));
}
