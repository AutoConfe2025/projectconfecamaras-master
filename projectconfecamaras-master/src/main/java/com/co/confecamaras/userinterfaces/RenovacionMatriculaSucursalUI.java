package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RenovacionMatriculaSucursalUI extends PageObject {

    public static final Target BTN_OK_SUCURSAL = Target.the("Boton OK")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target TXT_NUEVOS_ACTIVOS_SUCURSAL = Target.the("Escribir nuevos activos")
            .located(By.xpath("//input[@placeholder='Nuevos activos']"));

    public static final Target TXT_NUMERO_EMPLEADOS_SUCURSAL = Target.the("Escribir numero de empleados")
            .located(By.id("numeroempleados"));

    public static final Target BTN_LIQUIDAR_SUCURSAL = Target.the("Boton liquidar")
            .located(By.xpath("//*[text()='Liquidar']"));

    public static final Target BTN_FORMULARIO_SUCURSAL = Target.the("Boton formulario")
            .located(By.xpath("//i[@class='fa-sharp fa-solid fa-pen-to-square']"));

    public static final Target SELECT_AUTORIZA_MENSAJES_SUCURSAL = Target.the("Seleccionar si autoriza envio de mensajes")
            .located(By.id("ctrmennot"));

    public static final Target BTN_ALMACENAR_SUCURSAL = Target.the("Boton almacenar")
            .located(By.xpath("//*[contains(text(), ' Almacenar')]"));

    public static final Target BTN_VER_SUCURSAL = Target.the("Boton Ver")
            .located(By.xpath("//span[@data-original-title='Ver PDF']"));

    public static final Target BTN_EXPANDIR = Target.the("Boton Ver")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[1]/div/button[1]"));
    public static final Target BTN_CERRAR_SUCURSAL = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_RECIBIR_PAGO_SUCURSAL = Target.the("Boton recibir pago")
            //.located(By.xpath("//*[@data-original-title=\"Si desea recibir el pago en caja de la cámara de comercio.\"]"));
            .located(By.xpath("//*[@data-original-title=\"Recaudo en caja.\"]"));

    public static final Target LBL_MENSAJE_FINAL_RENOVACION_MATRICULA_SUCURSAL = Target.the("Mensaje final renovacion matricula sucursal")
            .located(By.id("ModalTitulo"));
    //.located(By.xpath("//*[@id=\"accordion1\"]/div/div[2]/div[3]/table/tbody/tr[2]/th"));
}