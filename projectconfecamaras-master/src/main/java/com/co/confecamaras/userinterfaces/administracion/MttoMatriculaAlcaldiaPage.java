package com.co.confecamaras.userinterfaces.administracion;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MttoMatriculaAlcaldiaPage {

    public static final Target BUSQUEDA_MTTO_MATRICULA_ALCALDIA = Target.the("Boton para ingresar a Mtto matricula alcaldia")
            .located(By.xpath("/html/body/div[1]/main/div[1]/span/ul/li[1]/a"));

    public static final Target INPUT_MATRICULA = Target.the("Input para ingresar matricula")
            .located(By.id("_mat"));

    public static final Target BTN_EDITAR_MATRICULA = Target.the("Boton para editar matricula")
            .located(By.xpath("//button[text()='Editar']"));

    public static final Target SELECT_ESTADO_ENVIO = Target.the("Menu para ingresar estado envio")
            .located(By.id("_estadoenvio")); //VALUE= 1

    public static final Target INPUT_NOMBRE_RAZON_SOCIAL = Target.the("Input para ingresar razon social o nombre")
            .located(By.id("_razonsocial"));


    public static final Target INPUT_FECHA = Target.the("Input para agregar fecha")
            .located(By.id("_fechaenvio"));

    public static final Target BTN_GUARDAR_INFO_MATRICULA = Target.the("Boton para guardar info de la matricula")
            .located(By.id("submit"));

    public static final Target BTN_BORRAR_MATRICULA = Target.the("Boton para borrar info")
            .located(By.xpath("//button[text()='Borrar']"));

    public static final Target BTN_ACEPTAR_BORRAR = Target.the("Boton para confirmar borrado")
            .located(By.xpath("//button[text()='Continuar']"));
}
