package com.co.confecamaras.userinterfaces.mercantil;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RenovacionMatriculaPage {
    public static final Target BTN_RENOVAR_MATRICULA = Target.the("Enlace para abrir la opcion de renovar matricula")
            .located(By.xpath("//*[@id=\"G3\"]/div/div[1]/a/span"));

    public static final Target BTN_CONTINUAR_RENOVACION_MATRICULA = Target.the("Boton para continuar con la renovación de la matricula")
            .located(By.xpath("//button[@class='btn btn-primary' and contains(text(), 'Continuar')]"));

    public static final Target CHECKBOX_RENOVACION_1 = Target.the("Checkbox renovacion activos del año 2023")
            .locatedBy("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]");

    public static final Target CHECKBOX_RENOVACION_2 = Target.the("Checkbox renovacion activos del año 2025")
            .locatedBy("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/div[1]/input[1]");

    public static final Target CHECKBOX_RENOVACION_3 = Target.the("Checkbox renovacion activos del año 2025")
            .locatedBy("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/div[1]/input[1]");


    public static final Target TNPUT_ACTIVOS_2023_PERSONA_NATURAL = Target.the("Input para  digitar los activos del año 2023")
            .locatedBy("//tbody/tr[2]/td[4]/div[1]/input[1]");

    public static final Target INPUT_ACTIVOS_2024_PERSONA_NATURAL = Target.the("Input para digitar los activos del 3034")
            .locatedBy("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/input[1]");


    public static final Target TNPUT_ACTIVOS_2023_ESTABLECIMIENTO = Target.the("Input para  digitar los activos del año 2023")
            .locatedBy("//input[@name='nuevosactivos[76912][2023][activos]']");
    public static final Target INPUT_ACTIVOS_2024_ESTABLECIMIENTO = Target.the("Input para digitar los activos del 2024")
            .locatedBy("//input[@name='nuevosactivos[76912][2024][activos]']");

    public static final Target INPUT_NUMERO_DE_EMPLEADOS = Target.the("input para digirar la cantidad de  empleados")
            .located(By.id("numeroempleados"));

    public static final Target BTN_LIQUIDAR = Target.the("Bton para liquidae")
            .locatedBy("//*[@id=\"renovarActivos\"]/div[2]/div/div[8]/div[4]/a[2]");


    public static final Target WARNING_MATRICULA_2022 = Target.the("Warning de matricula 2022")
            .locatedBy("#swal2-html-container");

    public static final Target CERRAR_WARNING = Target.the("botón Cerrar")
            .locatedBy("//button[normalize-space()='Aceptar']");


}
