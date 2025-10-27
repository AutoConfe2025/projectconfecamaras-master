package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RadicarActosDocumentosSinCostoUI extends PageObject {

    public static final Target BTN_PQR_REGISTRO_MERCANTIL_RADICAR_ACTOS = Target.the("Boton PQR registro mercantil")
            .located(By.xpath("//h3[text()='PQR del Registro Mercantil']"));

    public static final Target BTN_SIGUIENTE_RADICAR_ACTOS = Target.the("Boton siguiente")
            .located(By.id("btn-siguiente0"));

    public static final Target BTN_SIGUIENTE_UNO_RADICAR_ACTOS = Target.the("Boton siguiente uno")
            .located(By.id("btn-siguiente1"));

    public static final Target SELECT_TIPO_DOCUMENTO_RADICAR_ACTOS = Target.the("Seleccionar tipo de documento")
            .located(By.id("tipodoc"));

    public static final Target TXT_NUMERO_DOCUMENTO_RADICAR_ACTOS = Target.the("Escribir numero de documento")
            .located(By.id("numdoc"));

    public static final Target TXT_FECHA_DOCUMENTO_RADICAR_ACTOS = Target.the("Escribir fecha de documento")
            .located(By.id("fechadoc"));

    public static final Target TXT_ORIGEN_DOCUMENTO_RADICAR_ACTOS = Target.the("Escribir origen de documento")
            .located(By.id("origendoc"));

    public static final Target SELECT_MUNICIPIO_RADICAR_ACTOS = Target.the("Seleccionar municipio")
            .located(By.id("mundoc"));

    public static final Target BTN_SIGUIENTE_DOS_RADICAR_ACTOS = Target.the("Boton siguiente dos")
            .located(By.id("btn-siguiente2"));

    public static final Target TXT_MOTIVO_CORRECCION_RADICAR_ACTOS = Target.the("Escribir motivo de correccion")
            .located(By.id("descripcionpqr"));

    public static final Target SELECT_TIPO_IDENTIFICACION_RADICAR_ACTOS = Target.the("Seleccionar tipo de identificacion")
            .located(By.id("tipoidentificacionpqr"));

    public static final Target TXT_NRO_IDENTIFICACION_RADICAR_ACTOS = Target.the("Escribir el numero de identificacion")
            .located(By.id("identificacionpqr"));

    public static final Target TXT_PRIMER_NOMBRE_RADICAR_ACTOS = Target.the("Escribir el primer nombre")
            .located(By.id("nombre1pqr"));

    public static final Target TXT_SEGUNDO_NOMBRE_RADICAR_ACTOS = Target.the("Escribir el segundo nombre")
            .located(By.id("nombre2pqr"));

    public static final Target TXT_PRIMER_APELLIDO_RADICAR_ACTOS = Target.the("Escribir el primer apellido")
            .located(By.id("apellido1pqr"));

    public static final Target TXT_SEGUNDO_APELLIDO_RADICAR_ACTOS = Target.the("Escribir el segundo apellido")
            .located(By.id("apellido2pqr"));

    public static final Target TXT_DIRECCION_RADICAR_ACTOS = Target.the("Escribir la direccion")
            .located(By.id("direccionpqr"));

    public static final Target SELECT_MUNICIPIO_DOS_RADICAR_ACTOS = Target.the("Seleccionar municipio dos")
            .located(By.id("municipiopqr"));

    public static final Target TXT_EMAIL_RADICAR_ACTOS = Target.the("Escribir el email")
            .located(By.id("emailpqr"));

    public static final Target TXT_TELEFONO_FIJO_RADICAR_ACTOS = Target.the("Escribir el telefono fijo")
            .located(By.id("telefonopqr"));

    public static final Target TXT_NRO_CELULAR_RADICAR_ACTOS = Target.the("Escribir el numero celular")
            .located(By.id("celularpqr"));

    public static final Target BTN_SIGUIENTE_TRES_RADICAR_ACTOS = Target.the("Boton siguiente tres")
            .located(By.id("btn-siguiente3"));

    public static final Target BTN_CARGAR_SOPORTES_RADICAR_ACTOS = Target.the("Boton cargar soportes")
            .located(By.id("documentos"));

    public static final Target BTN_OK_RADICAR_ACTOS = Target.the("Boton ok")
            .located(By.xpath("//button[text()='OK']"));

    public static final Target BTN_VER_SOPORTE_RADICAR_ACTOS = Target.the("Boton ver soporte")
            .located(By.xpath("//a[@data-original-title=\"Ver Soporte\"]"));

    public static final Target BTN_EXPANDIR= Target.the("Boton ver soporte")
            .located(By.xpath("//div[@id='ModalInfo']//div[@class='modal-header']//button[1]"));

    public static final Target BTN_CERRAR_RADICAR_ACTOS = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_BORRAR_SOPORTE_RADICAR_ACTOS = Target.the("Boton borrar soporte")
            .located(By.xpath("//a[@data-original-title=\"Borrar soporte\"]"));

    public static final Target BTN_SI_RADICAR_ACTOS = Target.the("Boton si")
            .located(By.xpath("//button[text()='Si']"));

    public static final Target BTN_RADICAR_TRAMITE_RADICAR_ACTOS = Target.the("Boton radicar tramite")
            .located(By.id("btnRadicar"));

    public static final Target BTN_SERVICIOS_RADICAR_ACTOS = Target.the("Boton servicios")
            .located(By.cssSelector("#v-pills-home-tab"));

    public static final Target BTN_SOPORTES_RADICAR_ACTOS = Target.the("Boton soportes")
            .located(By.id("soportesT"));

    public static final Target BTN_VER_RADICAR_ACTOS = Target.the("Boton ver")
            .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[1]"));

    public static final Target BTN_VER_DOS_RADICAR_ACTOS = Target.the("Boton ver dos")
            .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[2]"));

    public static final Target BTN_VER_TRES_RADICAR_ACTOS = Target.the("Boton ver tres")
            .located(By.xpath("(//a[@class='btn btn-outline-primary btn-sm'])[3]"));

    public static final Target BTN_RECIBO_IM7_RADICAR_ACTOS = Target.the("Boton recibo Im7")
            .located(By.xpath("//*[@id=\"v-pills-profile\"]/div[2]/a"));

    public static final Target LBL_SOPORTES_RADICAR_ACTOS = Target.the("Ver soportes de radicar actos documentos sin costo")
            .located(By.xpath("//h4[text()='Soportes de la transacción']"));
}