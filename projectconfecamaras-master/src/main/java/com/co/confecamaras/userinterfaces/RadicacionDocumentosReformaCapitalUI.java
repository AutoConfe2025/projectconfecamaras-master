package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RadicacionDocumentosReformaCapitalUI extends PageObject {

    public static final Target BTN_ACCIONES_DISPONIBLES_REFORMA_CAPITAL = Target.the("Boton acciones disponibles")
            .located(By.xpath("(//i[@data-original-title=\"Acciones Disponibles\"])[1]"));

    public static final Target BTN_INSCRIPCION_DOCUMENTOS_REFORMA_CAPITAL = Target.the("Boton inscripcion de documentos")
            .located(By.xpath("//a[@data-original-title=\"Inscripciones de documentos\"]"));

    public static final Target BTN_CONTINUAR_REFORMA_CAPITAL = Target.the("Boton continuar")
            .located(By.id("submit"));

    public static final Target BTN_SELECCIONE_TRANSACCION_INCLUIR_REFORMA_CAPITAL = Target.the("Boton seleccione transaccion incluir")
            //.located(By.xpath("//*[text()='Seleccione una transacción a incluir']"));
            .located(By.cssSelector("div[class='btn-group'] button[type='button']"));

    public static final Target BTN_SELECT_FILTRAR_REFORMA_CAPITAL = Target.the("Select filtrar reforma capital")
            .located(By.id("_filtrotransacciones"));

    public static final Target BTN_REFORMAS_COMERCIALES_CAPITAL_SUSCRITO_REFORMA_CAPITAL = Target.the("Boton reformas comerciales capital suscrito")
            //.located(By.xpath("//*[text()='REFORMAS COMERCIALES - CAPITAL SUSCRITO']"));
            .located(By.xpath("//a[normalize-space()='REFORMAS COMERCIALES - CAPITAL SUSCRITO (05.005)']"));

    public static final Target SELECT_TIPO_DOCUMENTO_REFORMA_CAPITAL = Target.the("Seleccionar tipo de documento")
            .located(By.id("_tipodoc"));

    public static final Target TXT_NUMERO_REFORMA_CAPITAL = Target.the("Escribir numero")
            .located(By.id("_numdoc"));

    public static final Target TXT_ORIGEN_DOCUMENTO_REFORMA_CAPITAL = Target.the("Escribir origen del documento")
            .located(By.id("_origendoc"));

    public static final Target TXT_CAPITAL_SUSCRITO_REFORMA_CAPITAL = Target.the("Escribir capital suscrito")
            .located(By.id("_capitalsuscrito"));

    public static final Target BTN_RECIBIR_PAGO_REFORMA_CAPITAL = Target.the("Boton recibir pago")
            .located(By.xpath("//button[contains(text(), 'Recibir pago')]"));

    public static final Target LBL_RECIBO_CAJA = Target.the("Mensaje final radicacion de documentos reforma capital")
            .located(By.xpath("//*[text()='Soportes del pago']"));
}