package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InscripcionDocumentos extends PageObject {

    public static final Target BTN_CODIGO_BARRAS_ID = Target.the("Boton codigo de barras")
            //.located(By.id("_codbarrasinicial"));
            .located(By.cssSelector("input[type='search']"));

    public static final Target BTN_SIGUIENTE_ID = Target.the("Boton siguiente")
            .located(By.xpath("//a[@onmouseover=\"Tip('Pantalla siguiente')\"]"));

    public static final Target BTN_ADICIONAR_ACTOS_ID = Target.the("Boton adicionar actos")
            .located(By.xpath("//a[@onmouseover=\"Tip('Adicionar actos')\"]"));

    public static final Target LBL_CODIGO_BARRAS_ID = Target.the("Ver codigo de barras")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[2]"));

    public static final Target LBL_CODIGO_BARRAS_ID_DOS = Target.the("Ver codigo de barras")
            .located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[3]/td[1]"));

    public static final Target BTN_CERRAR_ID = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target TXT_CODIGO_BARRAS_ID = Target.the("Escribir codigo de barras")
            .located(By.id("codigobarrasinicial"));

    public static final Target TXT_BUSCAR = Target.the("Seleccionar el cuadro de texto para que realice la busqueda el codigo de barras")
            .located(By.cssSelector("input[type='search']"));

    public static final Target TXT_FECHA_INICIAL = Target.the("Escribir codigo de barras")
            .located(By.id("fechainicial"));

    public static final Target BTN_PUBLICAR = Target.the("Boton publicar")
            .located(By.xpath("(//*[name()='svg'][@role='img'])[6]"));

    public static final Target BTN_FINALIZAR_ESCANEO_ID = Target.the("Boton finalizar escaneo")
            //.located(By.xpath("//*[@id=\"gridbox\"]/div[2]/table/tbody/tr[2]/td[25]/a/img"));
            .located(By.xpath("//tbody/tr[1]/td[10]/p[1]/small[1]/a[4]//*[name()='svg']"));

    public static final Target BTN_CONTINUAR_FINALIZAR_ESCANEO = Target.the("Boton inactivar")
            .located(By.cssSelector(".btn.btn-success"));

    public static final Target SELECT_USUARIO_ID = Target.the("Seleccionar usuario")
            .located(By.id("_usuarioX"));

    public static final Target BTN_ASIGNAR_ID = Target.the("Boton asignar")
            //.located(By.xpath("//input[@onmouseover=\"Tip('Asignar usuario')\"]"));
            .located(By.xpath("//button[@id='submit']"));

    public static final Target LBL_PROCESO_FINALIZADO_ID = Target.the("Ver proceso finalizado")
            .located(By.xpath("//*[text()='Proceso Finalizado: Escaneo']"));

    public static final Target BTN_CAMARA_COMERCIO_ID = Target.the("Boton camara de comercio")
            //.located(By.id("logo_camara"));
            .located(By.cssSelector("#accionHome > div > ul > li:nth-child(1) > a > span > i"));


    public static By COD_BARRAS_INPUT = By.cssSelector("input[type='search']");
    //public static By COD_BARRAS_INPUT = By.id("_codbarrasinicial");

    public static By INICIAR_ESTUDIO_IMG = By.xpath("(//*[name()='svg'][@class='svg-inline--fa fa-edit fa-w-18'])[1]");
    public static By REVISADO_BTN = By.xpath("//*[@id=\"_check_datosbasicos\"]");
    public static By REVISADO_DIR_COMERCIAL_BTN = By.xpath("//*[@id=\"_check_dircom\"]");
    public static By REVISADO_DIR_NOTIFICACION_BTN = By.xpath("//*[@id=\"_check_dirnot\"]");
    public static By REVISADO_UNSPSC_BTN = By.xpath("//*[@id=\"_check_clasi1510\"]");
    public static By REVISADO_CAPACIDAD_FINAN_BTN = By.xpath("//*[@id=\"_check_inffin1510\"]");
    public static By REVISADO_EXPERIENCIA_BTN = By.xpath("//*[@id=\"_check_exp1510\"]");

    public static By RUT_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-rut\"]");
    public static By DOCUMENTO_IDENT_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-docidepr\"]");
    public static By CERT_EMPRESA_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-certpe\"]");
    public static By DOC_APODERADO_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-docideap\"][2]");
    public static By PODER_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-poder\"][2]");
    public static By REVISOR_FISCAL_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-docidecn\"][2]");
    public static By TARJETA_PROF_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-tprof\"][2]");
    public static By JUNTA_CENTRAL_BTN = By.xpath("//*[@id=\"_check_sop-01-datosbasicos-certjcc\"][2]");

    public static By SOPORTES_UNO_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin-inffinpnat\"][2]");
    public static By SOPORTES_DOS_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin-inffincertindi\"][2]");
    public static By SOPORTES_TRES_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin-inffincertindioc\"][2]");
    public static By SOPORTES_CUATRO_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin399a-inffinpnat\"][2]");
    public static By SOPORTES_CINCO_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin399a-inffincertindi\"][2]");
    public static By SOPORTES_SEIS_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin399a-inffincertindioc\"][2]");
    public static By SOPORTES_SIETE_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin399b-inffinpnat\"][2]");
    public static By SOPORTES_OCHO_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin399b-inffincertindi\"][2]");
    public static By SOPORTES_NUEVE_BTN = By.xpath("//*[@id=\"_check_sop-04-inffin399b-inffincertindioc\"][2]");

    public static By SOPORT_EXP_BTN = By.xpath("//*[@id=\"_check_sop-05-exp1510-certcon-001\"]");
    public static By INSCRIBIR_BTN = By.xpath("//*[@id=\"btnInscribir\"]/a");
    public static By HORA_PUBLI_TXT = By.id("_horpubruex");

    public static final Target VALIDACION_PRO= Target.the("Validacion de la hora publicación")
            .located(By.id("_horpubruex"));

    // -------------- Mercantil ------------------ //

    public static By EMAIL_INPUT = By.id("_email1");
    public static By TELEFONO_INPUT = By.id("_cel1");
    public static By ASOCIAR_BTN = By.xpath("//div[@id=\"frameSecundarioCentral\"]//a[text()='Asociar al código de barras']");

    public static final Target INSCRIBIR_ACTOS_BTN_DOS = Target.the("")
            .located(By.xpath("//a[text()='Inscribir Actos']"));
    public static By INSCRIBIR_ACTOS_BTN = By.xpath("//a[text()='Inscribir Actos']");
    public static By TERMINAR_INSCRIPCION_BTN = By.xpath("//a[text()='Terminar inscripción']");
    public static By REGRESAR_BANDEJA_BTN = By.xpath("//a[text()='Regresar a la bandeja']");
    public static By FINALIZAR_ESTUDIO_IMG = By.xpath("//a[5]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
    public static By FINALIZAR_ESTUDIO_IMG_ESADL = By.xpath("//a[6]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
    public static final Target BTN_REFRESCAR = Target.the("")
            .located(By.xpath("//a[normalize-space()='Refrescar']"));
    public static final Target BTN_CONTINUAR_FIN_ESTUDIO = Target.the("Boton continuar   Seguro de finalizar el proceso de Estudio/Registro ?")
            .located(By.xpath("//button[normalize-space()='Continuar']"));
    public static final Target VALIDACION_MERCANTIL = Target.the("")
            .located(By.xpath("//div[@role='dialog']//div[@class='modal-dialog']//div[@class='modal-body']"));

    public static final Target BTN_CONTINUAR_FINALIZAR_ESTUDIO = Target.the("Boton El código de barras no ha sido inscrito ni devuelto, seguro de finalizar su estudio?")
            .located(By.xpath("//div[@role='dialog']//div[@class='modal-dialog']//div[@class='modal-body']"));


}
