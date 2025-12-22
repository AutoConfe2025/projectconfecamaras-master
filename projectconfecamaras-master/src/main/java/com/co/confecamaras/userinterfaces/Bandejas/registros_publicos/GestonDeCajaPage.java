package com.co.confecamaras.userinterfaces.Bandejas.registros_publicos;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GestonDeCajaPage {
    public static final Target BOTON_CONSULTAR = Target.the("Boton Consultar")
            .located(By.xpath("//*[@id='formGenerico']//button[contains(text(), 'Consultar')]"));
    public static final Target BOTON_SI_CONFIRMACION = Target.the("Boton SI de la Confirmacion")
            .located(By.xpath("//button[normalize-space(text())='Si']"));
    public static final Target BOTON_OK = Target.the("Boton OK del Modal/Dialogo")
            .located(By.xpath("//button[text()='OK']"));
    public static final Target CAMPO_FECHA_INICIAL = Target.the("Campo de entrada Fecha Inicial")
            .located(By.xpath("//*[@id='fechaInicial']"));
    public static final Target CAMPO_FECHA_FINAL = Target.the("Campo de entrada Fecha Final")
            .located(By.xpath("//*[@id='fechaFinal']"));
    public static final Target BOTON_DESCARGAR_MODAL = Target.the("Boton Descargar del Modal/Dialogo")
            .located(By.xpath("//button[text()='Descargar']"));
    public static final Target BOTON_CERRAR_CUSTOM_MODAL = Target.the("Boton Cerrar del Custom Modal")
            .located(By.xpath("//*[@id='customModal']//button[normalize-space(text())='Cerrar']"));

    public static final Target CAMPO_IDENTIFICACION = Target.the("Campo de entrada Identificacion")
            .located(By.xpath("//*[@id='identificacion']"));
    public static final Target CAMPO_CORREO_ELECTRONICO = Target.the("Campo de entrada Correo Electronico")
            .located(By.xpath("//*[@id='correoelectronico']"));
    public static final Target BOTON_GENERAR_CLAVE = Target.the("Boton Generar Clave")
            .located(By.xpath("//*[@id='formGenerico']//button[contains(text(), ' Generar Clave')]"));
    public static final Target BOTON_CERRAR_MODAL = Target.the("Boton Cerrar del Modal/Dialogo")
            .located(By.xpath("//button[normalize-space(text())='Cerrar']"));
}
