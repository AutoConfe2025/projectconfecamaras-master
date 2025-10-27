package com.co.confecamaras.userinterfaces.mercantil;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RenovacionESADLPage {
    public static final Target HREF_MUTACION_DE_DIRECCION = Target.the("Boton de infreso a mutacion de dirección")
            .located(By.xpath("//*[@id=\"G3\"]/div/div[1]/a"));

    public static final Target TEXTO_INFORMACION = Target.the("Titulo de informacion de entidad sin animo de lucro")
            .located(By.xpath("//button[normalize-space()='Aceptar']"));

    public static final Target BTN_ACEPTAR = Target.the("Boton para continuar con la renovacion para entidades sin animo de lucro")
            .located(By.cssSelector("button.btn.btn-primary[type='submit']"));

    public static final Target DIV_DESPLEGAR_ACCIONES = Target.the("Boton para continuar con la renovacion para entidades sin animo de lucro")
            .located(By.cssSelector("div.card-header.h6.cursorPointer[data-toggle='collapse'][data-target='#G3']"));

    public static final Target TD_ANIO_RENOVACION = Target.the("Se muestra a partir de que año se hace renovacion")
            .located(By.xpath("//*[@id=\"cardBody_1\"]/div/div/table/tbody/tr[1]/td[1]"));


    public static final Target BTN_ACEPTAR_INFO = Target.the("Boton para continuar luego del mensaje")
            .located(By.cssSelector("button.swal2-confirm.swal2-styled"));

    public static final Target INPUT_MUMEERO_EMPLEADOS = Target.the("Target para digitar el numero de empleados")
            .located(By.id("numeroempleados"));

    public static final Target BTN_LIQUIDAR = Target.the("Boton para continuar la renovacion")
            .located(By.cssSelector("button[type='submit']"));

    public static final Target BTN_DESMARCAR_TODAS_CHECKBOX = Target.the("Boton Marcar todos los Checkbox")
            .located(By.cssSelector("button[class='btn btn-outline-secondary ml-2 btn-sm mb-2 float-right']"));

    public static final Target CHECKBOX_ANIO_2013 = Target.the("Checkbox de año a renovar 2013")
            .located(By.cssSelector("input[id='nuevosactivos[S0016562][2013][renovaresteano]']"));

    public static final Target CHECKBOX_ANIO_2014 = Target.the("Checkbox de año a renovar 2014")
            .located(By.cssSelector("input[id='nuevosactivos[S0016562][2014][renovaresteano]']"));

    public static final Target CHECKBOX_ANIO_2015 = Target.the("Checkbox de año a renovar 2015")
            .located(By.cssSelector("input[id='nuevosactivos[S0016562][2015][renovaresteano]']"));

    public static final Target CHECKBOX_ANIO_2016 = Target.the("Checkbox de año a renovar 2016")
            .located(By.cssSelector("input[id='nuevosactivos[S0016562][2016][renovaresteano]']"));


    public static final Target TD_ANIO_A_PARTIR_RENOVADO = Target.the("Evidencia de año renovado")
            .located(By.cssSelector("input[name='nuevosactivos[S0016562][2013][activos]']"));
    public static final Target TD_ANIO_DOS_RENOVADO = Target.the("Evidencia de año renovado")
            .located(By.cssSelector("input[name='nuevosactivos[S0016562][2014][activos]']"));
    public static final Target TD_ANIO_TRES_RENOVADO = Target.the("Evidencia de año renovado")
            .located(By.cssSelector("input[name='nuevosactivos[S0016562][2015][activos]']"));
    public static final Target TD_ANIO_CUATRO_RENOVADO = Target.the("Evidencia de año renovado")
            .located(By.cssSelector("input[name='nuevosactivos[S0016562][2016][activos]']"));

    public static final Target TD_ANIO_A_PARTIR_RENOVADO_LIQUIDACION = Target.the("Evidencia de año renovado")
            .located(By.xpath("//td[text()='2013']"));
    public static final Target TD_ANIO_DOS_RENOVADO_LIQUIDACION = Target.the("Evidencia de año renovado")
            .located(By.xpath("//td[text()='2014']"));
    public static final Target TD_ANIO_TRES_RENOVADO_LIQUIDACION = Target.the("Evidencia de año renovado")
            .located(By.xpath("//td[text()='2015']"));
    public static final Target TD_ANIO_CUATRO_RENOVADO_LIQUIDACION = Target.the("Evidencia de año renovado")
            .located(By.xpath("//td[text()='2016']"));

}
