package com.co.confecamaras.userinterfaces.Bandejas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CertificadosEspecialesPage {
    public static Target SELECT_TIPO_CONSULTA = Target.the("Menu desplegable para seleccionar el tipo de consulta")
            .located(By.id("selectS"));
    public static Target INPUT_INFORMACION_USQUEDA = Target.the("Input para ingresar informacion a buscar sea una matricula, expediente, etc")
            .located(By.id("criterio"));

    //CLICKCONTINUAR

    public static Target BTN_CONTINUAR_ = Target.the("Boton para continuar con la consulta")
            .located(By.xpath("//*[@id=\"consultaExpediente\"]/div/div[3]/button[1]"));

    public static Target BTN_ACCIONES_ = Target.the("Boton para desplegar acciones")
            .located(By.cssSelector("#tablaConsultaExpedientes > tbody > tr:nth-child(1) > td:nth-child(1) > a > i"));

    public static Target TRAMITES_REGISTRO_MERCABTIL = Target.the("Apartado para ingresar al espacio de tramites y registros mercantiles")
            .located(By.xpath("//*[@id=\"modalAuxiliar\"]/div/div/div[2]/div[1]/div[3]/div/div[1]"));

    public static Target BTN_SOLICITAR_CERTIFICADOS = Target.the("Apartado para solicitar certificados")
            .located(By.xpath("//a[@data-fn='escogerTipoSolicitud']"));

    //Click.on(BTN_SOLICITAR_CERTIFICADOS),

    public static Target BTN_C_ESPECIALES = Target.the("Boton para generar certificados especiales")
            .located(By.xpath("//button[@type='button' and text()='C. Especiales']"));

    public static Target SELECT_TIPO_DE_CERTIFICADO = Target.the("Menu desplegable tipo certificado")
            .located(By.xpath("(//select[@id='tipocertificado'])[1]"));

    public static Target TXT_EXPLIQUE_CERTIFICACION_QUE_NECESITA = Target.the("TXT para agregar  argumento de la certificacipon necesaria")
            .located(By.id("explicacion"));

    public static Target INPUT_CANTIDAD_CERTIFICADOS = Target.the("Input para agregar cantidad de certificacos necesarios")
            .located(By.id("certiesp"));

    public static Target SELECT_TIPO_DE_SOLICITUD = Target.the("Menu desplegable para seleccionar tipo solicitus")
            .located(By.id("tipoSolicitudCer"));

    public static Target BTN_CONTINUAR_GENERAR_LIQUIDACION = Target.the("Boton para generar loquidacopm")
            .located(By.id("generarLiquidacion"));

    public static Target BTN_FACTURAR_A_CLIENTE_GENERICO = Target.the("boton para faxtuirar cliente")
            .located(By.xpath("//button[@type='button' and text()='Facturar a cliente final genérico']"));

    public static Target BTN_ACEPTAR_FACTURAR_A_CLIENTE_GENERICO = Target.the("Boton para generar un recibo")
            .located(By.xpath("//button[@type='button' and text()='Continuar']"));

    public static Target BTN_GENERAR_RECIBO = Target.the("Boton para generar un recibo")
            .located(By.xpath("//button[@type='button' and text()='Generar recibo']"));

    public static Target BTN_CONTINUAR_GENERAR_RECIBO = Target.the("Boton para continuar con la generaciondel recivo ")
            .located(By.xpath("//button[@type='button' and @class='btn btn-success']"));

    public static Target LBL_RECIBO_OPERACION_CAMARA = Target.the("Label donde se muestra recibo")
            .located(By.xpath("//*[@id=\"page-top\"]/div[2]/div/center/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[2]"));
    public static Target BTN_OK_CONTINUAR = Target.the("Boton para continar copn el tramite")
            .located(By.xpath("//button[@type='button' and text()='OK']"));

    public static Target BTN_CERTIFICADOS_ESPECIALES = Target.the("Boton para ingresar a los certificados especiales")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[1]/li/div/ul/li/div/li/div/ul/li/li[29]/a"));

    public static Target BTN_EDITAR_MODELO = Target.the("Boton para ingresar al apartado de editar modelo")
            //.located(By.xpath("//a [@data-original-title='Editar modelo']"));
            .located(By.xpath("//body[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]"));

    public static Target TXT_EXPLICACION = Target.the("TXT para ahrehar una descfipcion/explicacion")
            .located(By.xpath("//*[@id=\"explicacion\"]"));
    public static Target TXT_DETALLE_DEL_TRAMITE = Target.the("Txt para agregar detalles del tramite")
            .located(By.xpath("//div[@aria-label='Área de edición del editor: main']"));

    public static Target TXT_EMAIL = Target.the("Txt para agregar email de envio")
            .located(By.xpath("(//input [@placeholder='Email de envío:'])[1]"));

    public static Target BTN_SUBIR_ANEXO = Target.the("Boton para agregar anexos necesarios")
            .located(By.id("documentos"));

    public static Target BTN_SUBIR_ANEXO_ELIMINACION = Target.the("Boton para agregar anexos necesarios")
            .located(By.cssSelector("#documentos"));

    public static Target BTN_OK_CARGADO = Target.the("Boton para aceptar el aviso de que el anexo fue cargado exitosamente")
            .located(By.xpath("//button[@type='button' and text()='OK']"));

    //Repetir accion para eliminar

    public static Target BTN_ELIMINAR = Target.the("Boton para eliminar anexo")
            .located(By.xpath("//a [@data-original-title = 'Borrar soporte']"));

    public static Target BTN_CONFIRMAR_ELIMINAR_ANEXO = Target.the("Confrimar eliminar anexo")
            .located(By.xpath("//button[@type='button' and text()='SI']"));

    public static Target BTN_ACEPTAR_ELIMINADO = Target.the("Boton para aceptar elanexo fue eliminado")
            .located(By.xpath("//button[@type='button' and text()='OK']"));

    public static Target BTN_GRABAR_INFORMACION = Target.the("Boton para grabar toda la infrmacion proporcionada")
            .located(By.id("grabarCertidicado"));

    public static Target BTN_GRABAR_CAMBIO_EMAIL = Target.the("Boton para grabar toda la infrmacion proporcionada")
            .located(By.id("grabarCambiosEmail"));

    public static Target BTN_ACEPTAR_INFO_GRABADA = Target.the("Boton para aceptar informacion guardada exitosamente")
            .located(By.xpath("//button[@type='button' and text()='OK']"));

    public static Target BTN_CONSULTAR_CERTIFICADO = Target.the("Boton para ingresar al apartado deconsultar")
            .located(By.xpath("//*[@id=\"tableCertificadosEspeciales\"]/tbody/tr[1]/td[2]/div/a[2]"));

    public static Target BTN_CERRAR_CONSULTA = Target.the("Boton para cerrar consulta de certificado")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[3]/button"));

    public static Target BTN_GENERAR_PDF_REPOSITORIO = Target.the("Boton para generar un repositorio")
            //.located(By.xpath("//a [@data-original-title='Generar Pdf Repositorio']"));
            .located(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[3]"));

    public static Target BTN_GENERAR_PDF = Target.the("Boton para generar pdf")
            .located(By.xpath("//button[@type='button' and text()='Aceptar']"));

    public static Target BTN_ACEPTAR_GENERAR_PDF = Target.the("Boton para aceptar La generacion pdf")
            .located(By.cssSelector("body > div.bootbox.modal.fade.bootbox-alert.show > div > div > div.modal-footer > button"));

    public static Target BTN_VER_PDF = Target.the("Boton para ver  pdf")
            .located(By.xpath("(//a[@data-toggle='tooltip' and @data-placement='auto' and @data-original-title='Ver'])[1]"));

    public static Target BTN_CERRAR_PDF = Target.the("Boton para ver  pdf")
            .located(By.xpath("//button[@type='button' and text()='Cerrar']"));

    public static Target SELECT_FILTRO = Target.the("Boton para editar email")
            .located(By.id("filtroce"));

    public static Target BTN_EDITAR_EMAIL = Target.the("Boton para editar email")
            .located(By.xpath("(//a [@data-original-title='Editar Email'])[1]"));

    public static Target BTN_ENVIAR_EMAILF = Target.the("Boton para enviar email")
            .located(By.xpath("(//a [@data-original-title='Enviar Email'])[1]"));

    public static Target BTN_ACEPTAR_ENVIO_EMAIL = Target.the("Boton para aceptar enviar email")
            .located(By.xpath("//button[@type='button' and text()='Aceptar']"));

    public static Target LBL_EMAIL_ENVIADO = Target.the("Mensaje informativo de correo enviado")
                .located(By.xpath("//div[contains(@class, 'alert alert-info') and contains(text(), 'El email se ha enviado correctamente para la solicitud No. ')]"));


    public static Target BTN_ACEPTAR_ENViO_EMAIL = Target.the("Boton para aceptar envio del email")
            .located(By.xpath("//button[@type='button' and text()='OK']"));

    public static Target BTN_VER_SOLICITUD = Target.the("Boton para ver solicitud")
            .located(By.xpath("(//a [@data-original-title='Ver'])[1]"));

    public static Target CERRA_DOCUMENTO = Target.the("Boton para cerrar consulta de certificado")
            .located(By.xpath("//*[@id=\"ModalInfo\"]/div/div/div[3]/button"));

    public static Target BTN_CONSULTAS_Y_TRANSACCIONES = Target.the("Boton para ver las transacciones")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/a/div[1]"));

    public static Target BTN_CONSULTAS_REGISTROS_P= Target.the("Boton para ver las transacciones")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/div/ul/li/div[1]/li/a/div[1]"));

    public static Target BTN_EXPEDIENTES = Target.the("Boton para ver las transacciones")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/div/ul/li/div[1]/li/div/ul/li/li[1]/a"));

    public static Target BTN_ENTREGA_PRESENCIAL = Target.the("Boton para entrega presencial")
            .located(By.xpath("(//a [@data-original-title='Entrega presencial'])[1]"));

    public static Target BTN_ACEPTAR_ENTREGA_PRESENCIAL = Target.the("Boton para aceptar entrega presencial")
            .located(By.xpath("//button[@type='button' and text()='Aceptar']"));

    public static Target LBL_EMTREGA_PRESENCIAL_ACEPTADA = Target.the("BMensaje informativo entrega presencial")
            .located(By.cssSelector("body > div.bootbox.modal.fade.bootbox-alert.show > div > div > div.modal-body > div > div > div.card-body"));

    public static Target BTN_ACEPTAR_MENSAJE_ENTREGA = Target.the("Boton para aceptar envio del email")
            .located(By.xpath("//button[@type='button' and text()='OK']"));



}
