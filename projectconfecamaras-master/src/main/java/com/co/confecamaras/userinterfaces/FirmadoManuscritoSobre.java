package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FirmadoManuscritoSobre extends PageObject {

    public static final Target BTN_RETOMAR_TRAMITE_MANUSCRITO = Target.the("Boton retomar tramite")
            .located(By.id("home-numerorecuperacion"));

    public static final Target TXT_NUMERO_RECUPERACION_MANUSCRITO = Target.the("Escribir el numero de recuperacion")
            .located(By.id("numRec"));

    public static final Target BTN_CONTINUAR_MANUSCRITO = Target.the("Boton continuar")
            .located(By.xpath("(//*[contains(text(), ' Continuar')])[2]"));
    public static final Target MENU_DESP_SEDE_ADMIN =Target.the("").
            located(By.id("tiposedeadm"));

    public static final Target BTN_CONTINUAR_DOS_MANUSCRITO = Target.the("Boton continuar dos")
            .located(By.id("btnLiquidar"));

    public static final Target BTN_FIRMA_MANUSCRITA_MANUSCRITO = Target.the("Boton Firma Manuscrita")
            .located(By.id("btnFmanuscrita"));

    public static final Target TXT_CELULAR_MANUSCRITO = Target.the("Escribir el celular")
            .located(By.id("celular"));

    public static final Target BTN_ENVIAR_EMAIL_MANUSCRITO = Target.the("Boton enviar sms")
            .located(By.xpath("(//button[@type='button'])[6]"));

    public static final Target BTN_ENVIAR_SMS_MANUSCRITO = Target.the("Boton enviar email")
            .located(By.xpath("(//button[@type='button'])[5]"));

    public static final Target BTN_GENERAR_QR_MANUSCRITO = Target.the("Boton generar qr")
            .located(By.xpath("(//button[@type='submit'])[1]"));

    public static final Target IMG_QR_MANUSCRITO = Target.the("Boton generar qr")
            .located(By.xpath("//img[@alt=\"FirmaQR\"]"));

    public static final Target BTN_GUARDAR_FIRMA_MANUSCRITO = Target.the("Boton guardar firma")
            .located(By.xpath("//*[contains(text(), ' Guardar firma')]"));

    public static final Target BTN_CERRAR_MANUSCRITO = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_SI_MANUSCRITO = Target.the("Boton si")
            .located(By.xpath("//button[text()='Si']"));

    public static final Target BTN_SOBRE_DIGITAL_MANUSCRITO = Target.the("Boton sobre digital")
            .located(By.id("btnSobreDigital"));

    public static final Target LBL_VER_DOCUMENTO_MANUSCRITO = Target.the("Mensaje ver documento")
            .located(By.id("ModalTitulo"));

    public static final Target LBL_FIRMADO_MANUSCRITO_SOBRE = Target.the("Mensaje final firmado manuscrito sobre")
            .located(By.xpath("//small[@id=\"estado\"]"));


    public static By FORMULARIO_MUTACION_BTN = By.xpath("//a[text()='FORMULARIO MUTACION']");
    public static By CANVAS_INPUT = By.xpath("//form[@id=\"formularioFirmaManuscrita\"]//canvas");
    public static By CERRAR_BTN = By.xpath("//div[@class=\"modal-footer\"]//button");
    public static By DEACUERDO_BTN = By.xpath("//form[@id=\"formularioFirmaManuscrita\"]//button");
    public static By SI_BTN = By.xpath("//div[@class=\"modal-footer\"]//button[text()='Si']");
    public static By SOBRE_DIGITAL_BTN = By.id("btnSobreDigital");

    public static Target VALIDACION_SOBRE = Target.the("")
            .located(By.xpath("//div[@class=\"modal-content ui-resizable\"]"));

}
