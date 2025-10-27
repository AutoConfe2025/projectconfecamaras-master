package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class EstudioInscripcionDocumentosEsadlUI extends PageObject {

    public static final Target TXT_CODIGO_BARRAS_EASDL = Target.the("Escribir el codigo de barras")
            .located(By.cssSelector("input[type='search']"));

    public static final Target BTN_ESTUDIAR_EASDL = Target.the("Boton ingresar estudiar")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[22]/a"));

    public static final Target BTN_DEVOLVER_EASDL = Target.the("Boton ingresar devolver")
            .located(By.xpath("//a[4]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]"));

    public static final Target TXT_EMAIL_EASDL = Target.the("Escribir el email")
            .located(By.id("_email1"));

    public static final Target TXT_CELULAR_EASDL = Target.the("Escribir el numero de celular")
            .located(By.id("_cel1"));

    public static final Target BTN_ASOCIAR_CODIGO_BARRAS_EASDL = Target.the("Boton asociar al código de barras")
            .located(By.xpath("//a[text()='Asociar al código de barras']"));

    public static final Target BTN_INSCRIBIR_ACTOS_EASDL = Target.the("Boton inscribir actos")
            .located(By.xpath("//a[text()='Inscribir Actos']"));

    public static final Target BTN_TERMINAR_INSCRIPCION_EASDL = Target.the("Boton terminar inscripcion")
            .located(By.xpath("//a[text()='Terminar inscripción']"));

    public static final Target BTN_REGRESAR_BANDEJA_EASDL = Target.the("Boton regresar bandeja")
            .located(By.xpath("//a[text()='Regresar a la bandeja']"));

    public static final Target BTN_FINALIZAR_ESTUDIO_EASDL = Target.the("Boton finalizar estudio")
            .located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[24]/a"));

    public static final Target LBL_ID_EASDL = Target.the("Numero de id")
            .located(By.xpath("//table[@class=\"obj\"]//tr//td[3]"));

    public static final Target CHK_MOTIVOS_DEVOLUCION_EASDL = Target.the("Checkbox motivos devolucion")
            .located(By.xpath("//td[@excell=\"ch\"]"));

    public static final Target SELECT_TIPO_TRAMITE_EASDL = Target.the("Seleccionar tipo de tramite")
            .located(By.id("_tipotramite"));

    public static final Target SELECT_PROCEDE_REINGRESO_EASDL = Target.the("Seleccionar procede de reingreso")
            .located(By.id("_tipodevolucion"));

    public static final Target SELECT_TIPO_DEVOLUCION_EASDL = Target.the("Seleccionar tipo devolucion")
            .located(By.id("_devolucionparcial"));

    public static final Target SELECT_MODIFICAR_FORMULARIO_EASDL = Target.the("Seleccionar modificar formulario")
            .located(By.id("_modificarformulario"));

    public static final Target TXT_OBSERVACIONES_EASDL = Target.the("Escribir observaciones")
            .located(By.id("_observaciones"));
    public static final Target TXT_EMAIL = Target.the("Escribir Email (Notificación) ")
            .located(By.id("_email"));

    public static final Target TXT_MOTIVO = Target.the("Cuadro de texto seleccionar motivo")
            .located(By.cssSelector("a[href=\"javascript:seleccionarMotivo('120')\"]"));
    public static final Target BTN_GRABAR_EASDL = Target.the("Boton grabar")
            .located(By.xpath("//a[text()='Grabar']"));
    public static final Target BTN_GRABAR_DEVOLUCION = Target.the("Boton grabar")
            .located(By.xpath("//button[normalize-space()='Grabar']"));

    public static final Target BTN_VER_EASDL = Target.the("Boton ver")
            .located(By.xpath("//a[text()='Ver']"));
    public static final Target BTN_VER_DEVOLUCION = Target.the("Boton ver")
            .located(By.xpath("//button[normalize-space()='Ver']"));

    public static final Target BTN_APLICAR_EASDL = Target.the("Boton aplicar")
            .located(By.xpath("//a[text()='Aplicar']"));
    public static final Target BTN_APLICAR_DEVOLUCION = Target.the("Boton aplicar")
            .located(By.xpath("//button[normalize-space()='Aplicar']"));
    public static final Target BTN_CONTINUAR_DEVOLUCION_TOTAL = Target.the("Boton aplicar")
            .located(By.xpath("//button[normalize-space()='Continuar']"));

    public static final Target LBL_FINALIZACION_ESTUDIO = Target.the("Mesaje nuevo estado")
            .located(By.xpath("(//table[@width=\"400px\"])[2]"));

    public static final Target LBL_MENSAJE_DEVOLUTIVO = Target.the("Mesaje devolutivo")
            .located(By.xpath("//*[text()='El devolutivo ha quedado registrado en el sistema de información']"));
}