package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RenovacionPNRenov extends PageObject {

        public static By OK_BTN = By.xpath("//button[normalize-space()='Aceptar']");

        public static final Target RENOVAR_SI_BTN = Target.the("Boton si")
                .located(By.xpath("//button[normalize-space()='Aceptar']"));

        public static final Target NUEVOS_ACTIVOS_UNO_TXT = Target.the("Escribir nuevos activos uno")
                .located(By.xpath("(//input[@placeholder=\"Nuevos activos\"])[1]"));

        public static final Target RENOVAR_SI_DOS_BTN = Target.the("Boton si dos")
                .located(By.xpath("(//input[@type=\"radio\" and @value=\"si\"])[2]"));

        public static final Target NUEVOS_ACTIVOS_DOS_TXT = Target.the("Escribir nuevos activos dos")
                .located(By.xpath("(//input[@placeholder=\"Nuevos activos\"])[2]"));

        public static final Target NUEVOS_EMPLEADOS_TXT = Target.the("Escribir numero de empleados")
                .located(By.id("numeroempleados"));

        public static final Target LIQUIDAR_BTN = Target.the("Boton liquidar")
                .located(By.xpath("//*[text()='Liquidar']"));

        public static final Target FORMULARIO_UNO_BTN = Target.the("Boton formulario uno")
                //.located(By.xpath("(//*[text()='Formulario'])[1]"));
                .located(By.xpath("//tbody/tr[1]/td[6]/a[1]/i[1]"));

        public static final Target FORMULARIO_DOS_BTN = Target.the("Boton formulario dos")
                //.located(By.xpath("(//*[text()='Formulario'])[2]"));
                .located(By.xpath("//tbody/tr[2]/td[6]/a[1]/i[1]"));


        public static final Target ACTIVOS_CORRIENTE_TXT = Target.the("Escribir activos corrientes")
                .located(By.id("actcte_2025"));

        public static final Target PATRIMONIO_NETO_TXT = Target.the("Escribir patrimonio neto")
                .located(By.id("pattot_2025"));

        public static final Target ACTIVIDAD_ORDINARIA_TXT = Target.the("Escribir actividad ordinaria")
                .located(By.id("ingope_2025"));

        public static final Target PERSONAL_OCUPADO_TXT = Target.the("Escribir Personal ocupado")
                .located(By.id("personal_2025"));

        public static final Target ALMACENAR_BTN = Target.the("Boton almacenar")
                .located(By.xpath("//*[contains(text(), 'Almacenar')]"));

        public static final Target OK_DOS_BTN = Target.the("Boton OK")
                .located(By.xpath("//button[text()='OK']"));

        public static final Target RECIBIR_PAGO_BTN = Target.the("Boton Recibir Pago")
                //.located(By.xpath("//a[@data-original-title=\"Si desea recibir el pago en caja de la cámara de comercio.\"]"));
                .located(By.cssSelector("a[role='button']"));

        public static final Target IDENTIFICACION_TXT = Target.the("Escribir identificacion")
                .located(By.id("_identificacioncliente"));

        public static final Target VERIFICAR_IDENTIFICACION_BTN = Target.the("Boton verificar identificacion")
                .located(By.xpath("//button[text()='Verificar identificación']"));

        public static final Target CORREO_TXT = Target.the("Escribir correo")
                .located(By.id("_emailconfirmacion"));

        public static final Target GENERAR_RECIBO_BTN = Target.the("Boton generar recibo")
                .located(By.xpath("//button[text()='Generar recibo']"));

        public static final Target CONTINUAR_BTN = Target.the("Boton continuar")
                .located(By.xpath("//button[text()='Continuar']"));

        public static final Target CERRAR_BTN = Target.the("Boton cerrar")
                .located(By.xpath("//button[text()='Cerrar']"));

        public static final Target SOPORTES_BTN = Target.the("Boton soportes")
                .located(By.id("soportesT"));

        public static final Target VER_FORMULARIO_BTN = Target.the("Boton ver formulario")
                .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[2]"));

        public static final Target VER_RADICADO_BTN = Target.the("Boton ver radicado")
                .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[8]"));

        public static final Target MENSAJE_FINAL_PN_LBL = Target.the("Mensaje final pn")
                .located(By.id("ModalTitulo"));
}