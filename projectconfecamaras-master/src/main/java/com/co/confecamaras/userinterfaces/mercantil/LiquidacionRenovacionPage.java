package com.co.confecamaras.userinterfaces.mercantil;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LiquidacionRenovacionPage {

    public static final Target NUEVOS_ACTIVOS_INPUT_PERSONA_NATURAL = Target.the("campo de texto nuevos activos")
            .locatedBy("//input[contains(@class, 'form-control') and contains(@class, 'numeros') and contains(@class, 'pruebacomas') and contains(@class, 'form-control-sm')]");

    public static final Target NUEVOS_ACTIVOS_INPUT_ESTABLECIMIENTO = Target.the("campo de nuevos activos")
            .locatedBy("//*[@id=\"cardBody_2\"]/div/div/table/tbody/tr/td[3]/div/input");

    public static final Target NUMERO_DE_EMPLEADOS_INPUT = Target.the("Campo para digitar numero de empleados")
            .located(By.id("numeroempleados"));

    public static final Target CUMPLE_REQUISITOS_SELECT = Target.the("campo select cumple requisitos")
            .located(By.xpath("//label[normalize-space()='Cumplo los requisitos']"));

    public static final Target CHECKBOX_CUMPLE_REQUISITOS_SELECT = Target.the("campo select cumple requisitos")
            .located(By.xpath("//body//div[@id='container']//div[@class='card-body']//div//div//div[@class='text-center']//label[2]//span[1]"));

    public static final Target MANTENGO_REQUISITOS_SELECT = Target.the("campo select mantengo requisitos")
            .located(By.xpath("//label[normalize-space()='Mantengo los requisitos']"));

    public static final Target CHECKBOX_MANTENGO_REQUISITOS_SELECT = Target.the("campo select mantengo requisitos")
            .located(By.xpath("//body//div[@id='container']//div[@class='card-body']//div//div//div[@class='text-center']//label[4]//span[1]"));

    public static final Target RENUNCIO_VOLUNTARIAMENTE_SELECT = Target.the("Select para seleccionar si renuncia o no voluntariamente al beneficio")
            .located(By.xpath("//label[normalize-space()='Renuncio voluntariamente al beneficio']"));

    public static final Target BTN_LIQUIDAR = Target.the("Btono para liquidar renovacion")
            .located(By.xpath("//*[@id=\"renovarActivos\"]/div[2]/div/div[8]/div[4]/a[2]"));

    public static final Target HEADER_01090111 = Target.the("encabezado con valor 01090111")
            .locatedBy("//th[contains(text(), '01090111')]");

    public static final Target DSCTO_RENOV_LEY_1780_CELL = Target.the("celda con valor DSCTO 100% RENOV LEY 1780")
            .locatedBy("//td[contains(text(), 'DSCTO 100% RENOV LEY 1780')]");

    public static final Target CARGAR_SOPORTES_DOCUMENTALES = Target.the("")
            .located(By.xpath("(//i[@title='Cargar soporte'])[1]"));

    public static final Target CARGAR_ANEXO = Target.the("A partador para subir achivos")
            .located(By.id("anexo"));

    public static final Target TXT_OBSERVACIONES = Target.the("Text area para escribir las observaciones")
            .located(By.id("descripcion"));

    public static final Target CALENDAR_SELECT = Target.the("Boton que abre el calemdarop")
            .located(By.xpath("//*[@id=\"formSubirAnexo\"]/div/div[2]/div[3]/div[1]/span/button[1]/i"));
    public static final Target MES_ANTERIOR = Target.the("Ver dias de mes anterior")
            .locatedBy("//li[@data-view='month prev' and text()='‹']");

    public static final Target SELECT_FECHA = Target.the("Div para seleccionar un fecha")
            .located(By.xpath("//li[@data-view='day' and text()='1']"));

    public static final Target SELECT_FECHA_DECLARACION = Target.the("Div para seleccionar un fecha")
            .locatedBy("//li[@class='highlighted picked' and @data-view='day picked']");

    public static final Target ENTIDAD_PERSONA_QUE_EXPIDE = Target.the("Area para digitar quien expide los documentos")
            .located(By.id("origendoc"));
    public static final Target BTN_CARGAR = Target.the("Bton para terminar el proceso de carga de archivos")
            .located(By.id("btnCargar"));

    public static final Target BTN_CERRAR_FORMULARIO = Target.the("Boton para cerrar ventana")
            .locatedBy("//button[text()='Cerrar']");

    public static final Target CARGAR_DECLARACION_PERSONA_NATURAL = Target.the("Subir documentos de declaracion ")
            .located(By.xpath("//*[@id=\"accordion3\"]/div/div[2]/div[2]/div[3]/div/div[3]/i"));


    public static final Target CARGAR_ESTADOS_FINANCIEROS = Target.the("Subir estados financieros")
            .located(By.xpath("//*[@id=\"accordion3\"]/div/div[2]/div[2]/div[4]/div/div[3]/i"));

    public static final Target FORMULARIO_PERSONA = Target.the("Formulario 2024")
            .located(By.xpath("//*[@id=\"accordion2\"]/div/div[2]/div[2]/div/table/tbody/tr[1]/td[6]/a/i"));

    public static final Target FORMULARIO_ESTABLECIMIENTO = Target.the("Formulario establecimiento")
            .located(By.xpath("//*[@id=\"accordion2\"]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[6]/a/i"));

    public static final Target SELECT_ADM_DIAN = Target.the("Seleccionar localidad de DIAN")
            .located(By.id("admondian"));

    public static final  Target AUTORIZACION_EVIO_EMAIL = Target.the("Seleccionar si desea recibir correos")
            .located(By.id("ctrmennot"));

    public static final Target INPUT_ACTIVOS = Target.the("Digitar cantidad de activos")
            .located(By.id("actcte_2025"));

    public static final Target INPUT_ACTIVOS_NETO = Target.the("Digitar acitvos neto")
            .located(By.id("pattot_2025"));

    public static final Target INPUT_CANTIDAD_PERSONAL = Target.the("Figitar cantidad de personal")
            .located(By.id("personal_2025"));
    public static final Target INPUT_CAMTIDAD_MUJERES = Target.the("Inout para digitar la cantidad de mujeres")
            .located(By.id("cantidadmujeres"));
    public static final Target BTN_ALMACENAR = Target.the("Boton para almacemar info")
            .located(By.xpath("//*[@id=\"formMatrLiq\"]/div[3]/button"));

    public static final Target BTN_CERRAR_CARGA = Target.the("Cerrar ventana una vez esta sea exitosa")
            .locatedBy("//button[normalize-space(text())='OK']");

    public static final Target BTN_RECIBIR_PAGO = Target.the("Boton para recibir pago")
            .located(By.xpath("//*[@id=\"accordion8\"]/div/div[2]/a"));


    public static final Target DESCUENTO_TEXTO = Target.the("Boton para recibir pago")
            .located(By.xpath("//td[@style='width: 50%;' and @align='left' and text()='$ -569,000']"));


    public static final Target BTN_FACTURA = Target.the("Gneerar factura")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/div/div[28]/div/div[4]/div/a[2]/button"));

    public static final Target BTN_CONTINUAR_LIQUIDACION = Target.the("Boton para continuar con el proceso")
            .located(By.xpath("//*[@id=\"page-top\"]/div[8]/div/div/div[2]/button[2]"));

    public static final Target BTN_GENERAR_RECIBO = Target.the("Boton para generar recibo")
            .located(By.xpath("//*[@id=\"_divBotones2\"]/div/div/div/div/a[1]/button"));

    public static final Target BTN_CONTINUAR_GENERAR_RECIBO = Target.the("Boton para continuar el proceso")
            .located(By.xpath("//*[@id=\"page-top\"]/div[8]/div/div/div[2]/button[2]"));
    public static final Target SERVICIO_TEXTO = Target.the("Total a pagar")
            .located(By.xpath("//td[@style='width: 50%;' and text()='$ -251,000']"));


    public static final Target CERRAR_VENTANA = Target.the("Cerrar  ventana")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[3]/button"));

    public static final Target TEXTO_DATOS_GENERALES_RECIBO = Target.the("Titulo de el recibo")
            .located(By.xpath("//*[@id=\"v-pills-messages\"]/h4"));


    //CALENDARIO 3 SELECTORES
    public static Target BTN_FECHA_DOCUMENTO = Target.the("Cuadro de texto fecha documento").
            located(By.cssSelector(".btn.btn-info.fechadoc"));
    public static Target BTN_ANO_3 = Target.the("Seleccion del año en el calendario").
            located(By.cssSelector("div[class='datepicker-container datepicker-dropdown datepicker-top-left'] li[data-view='month current']"));
    public static Target BTN_ANO_2_1 = Target.the("Seleccion del año en el calendario").
            located(By.cssSelector("div[class='datepicker-container datepicker-dropdown datepicker-top-left'] li[data-view='year current']"));
    public static Target BTN_ANO_2_2 = Target.the("Seleccion del año en el calendario").
            located(By.xpath("//div[@class='datepicker-panel']//li[@data-view='year'][normalize-space()='2023']"));
    public static Target BTN_MES_2 = Target.the("Seleccion del MES en el calendario").
            located(By.cssSelector("div[class='datepicker-container datepicker-dropdown datepicker-top-left'] div[class='datepicker-panel'] li:nth-child(12)"));
    public static Target BTN_FECHA_DOCUMENTO_UNO = Target.the("Cuadro de texto fecha documento").
            located(By.cssSelector(".btn.btn-info.fechadoc"));
    public static Target TXT_ENTIDAD_PERSONA_EXPID = Target.the("Cuadro de texto Entidad o persona que lo expide").
            located(By.id("origendoc"));


}
