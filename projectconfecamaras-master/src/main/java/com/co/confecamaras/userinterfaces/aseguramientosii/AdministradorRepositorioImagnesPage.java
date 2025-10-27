package com.co.confecamaras.userinterfaces.aseguramientosii;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdministradorRepositorioImagnesPage {

    public static final Target ADMINSTRADOR_IMAGENES = Target.the("Administración del Repositorio de Imágenes")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target DIRECTORIO_FORMATOS = Target.the("btn para ingresar al repositorio de imagenes")
            .located(By.xpath("//a[text()='formatos']"));

    public static final Target DESCARGA_FORMATO = Target.the("Boton para descargar formato")
            .located(By.xpath("(//a[@title='Mostrar !archivo' and @target='_blank'])[1]"));

    public static final Target TABLA_FORMATOS_IMAGENES = Target.the("Tabla que muestra los formatos existentes")
            .located(By.xpath("(//a[@title='Mostrar !archivo' and @target='_blank'])[1]"));
}
