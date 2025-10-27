package com.co.confecamaras.userinterfaces.Bandejas;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BandejaRLeyPONALPage {
    public static final Target BTN_BANDEJAS = Target.the("Opción del menu para entrar a las bandejas")
            .located(By.xpath("/html/body/div/main/div[1]/nav/div/div[1]/li/a/div[1]"));

    public static final Target TXT_BUSCAR_MENU_LATERAL = Target.the("Opción de busqueda menu lateral")
            .located(By.id("sidebar-search"));

    public static final Target BTN_REGISTROS_PUBLICOS = Target.the("Opcion en el menu para elegir el apartado de registros publicos")
            .located(By.xpath("/html/body/div/main/div[1]/nav/div/div[1]/li/div/ul/li/div[1]/li/a/div[1]"));

    public static final Target BTN_PRIMERA_OPCION = Target.the("Apartado para elegir bamdeja bajo la ley 1780")
            .located(By.xpath("//li[@class='list-group-item list-group-item-action'][1]"));

    public static final Target BTN_PRIMERA_OPCION_2 = Target.the("Apartado para elegir bamdeja bajo la ley 1780")
            .located(By.xpath("//span[@id='resultados-search-div']//a[1]"));

    public static final Target BTN_LEY_1780_PONAL_NO_AUTM = Target.the("Apartado para elegir bamdeja bajo la ley 1780")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[1]/li/div/ul/li/div/li/div/ul/li/li[1]"));

    //Cambiar de pestaña
    public static final Target MENU_DES_FILTRAR = Target.the("Barra de busqueda para filtrar resultados")
            .located(By.id("filtrocriterio"));

    public static final Target BUSCADOR = Target.the("Barra de busqueda para filtrar resultados")
            //.located(By.xpath("(//input[@type='search'])[1]"));
    .located(By.cssSelector("#tablecb_filter > label > input[type=search]"));

    public static final Target VER_RUTA = Target.the("Boton para ver la ruta")
            .located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(1) > svg > path"));

    //Cambiar de pestaña


    public static final Target VER_RECIBO_CAJA = Target.the("Link para ver el recibo")
            .located(By.xpath("(//a[contains(text(),'Ver')])[1]"));
    //.located(By.linkText("Ver"));

    public static final Target BTN_REGRESAR = Target.the("Boton Regresar")
            .located(By.xpath("//a[normalize-space()='Regresar']"));

    public static final Target SOLICITUD_CANCELACION = Target.the("Link para ver el recibo")
            .located(By.xpath("(//a[contains(text(),'Ver')])[2]"));

    public static final Target VER_SOBRE_DIGITAL = Target.the("Link para ver el recibo")
            .located(By.xpath("(//a[contains(text(),'Ver')])[3]"));

    public static final Target VER_SOPORTE_NOTIFCACION_EMAIL_UNO = Target.the("Link para ver el recibo")
            .located(By.xpath("(//a[contains(text(),'Ver')])[4]"));

    public static final Target VER_SOPORTE_NOTIFCACION_EMAIL_DOS = Target.the("Link para ver el recibo")
            .located(By.xpath("(//a[contains(text(),'Ver')])[5]"));

    public static final Target VER_SOPORTE_NOTIFCACION_SMS = Target.the("Link para ver el recibo")
            .located(By.xpath("(//a[contains(text(),'Ver')])[6]"));
    public static final Target VER_SOPORTE_MOTIFICACION_EMAIL = Target.the("Link para ver recibo notificacion")
            .located(By.cssSelector("#page-top > div.container-fluid.align-items-center > div > div > div:nth-child(20) > div > p:nth-child(4) > a"));

    public static final Target VER_SOPORTE_NOTIFICACION_SMS = Target.the("Link para ver el soporte notificacion via sms")
            .located(By.cssSelector("#page-top > div.container-fluid.align-items-center > div > div > div:nth-child(20) > div > p:nth-child(7) > a"));

    //Cerrar pestaña
    //Fin ver RUTA

    public static final Target AGREGAR_COMENTARIOS = Target.the("Boton para entrar al apartado de comentarios)")
           //.located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(2) > svg > path"));
           .located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(3) > svg > path"));

    public static final Target AGREGAR_COMENTARIOS1 = Target.the("Boton para entrar al apartado de comentarios)")
            .located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(2) > svg > path"));
            //.located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(3) > svg > path"));

    public static final Target AGREGAR_ = Target.the("Boton para entrar al apartado de comentarios)")
            //.located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(2) > svg > path"));
            .located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(3) > svg > path"));


    //Cambiar de pestaña

    public static final Target SELECT_TIPO_COMENTARIO = Target.the("Menu para seleccionar tipo de comentario")
            .located(By.id("_tipo"));
    public static final Target TXT_COMENTARIOS = Target.the("Apartado para ecribir el respectivo comentario")
            .located(By.id("_comentario"));

    public static final Target BTN_GRABAR_COMENTARIO = Target.the("Boton para guardar el comentario")
            .located(By.id("submit"));

    public static final Target TEXTO_COMENTARIO_ALMACENADO = Target.the("Mensaje informativo de confirmacion de comentario grabado correctamente")
            .located(By.cssSelector("#formMensajes > p"));

    //Cerrar ventana

    public static final Target REFRESCAR = Target.the("Apartado para ver los comentarios")
            .located(By.linkText("Refrescar"));

    public static final Target VER_ADICIONAR_ANEXO = Target.the("Apartado para subir anexo")
            .located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(4) > svg > path"));
    //Cambiar pestaña

    public static final Target SUBIR_PDF = Target.the("Subir pdf o archivo")
            .located(By.id("my-awesome-dropzone"));

    public static final Target SELECT_TIPO_DOCUMENTO = Target.the("Selector de tipo de documento")
            .located(By.id("_tipdoc"));

    public static final Target INPUT_NUMERO_DE_DOCUMENTO = Target.the("Input para ingresar tipo de docuemnto")
            .located(By.id("_nrodoc"));

    public static final Target INPUT_CELENDARIO = Target.the("input para ingresar fecha")
            .located(By.id("4"));

    public static final Target INPUT_ORIGEN_DOCUMENTO = Target.the("Input para escribir el origien del documento")
            .located(By.id("_oridoc"));

    public static final Target BTN_CARGAR_ANEXO = Target.the("Boton para cargar el anexoi")
            .located(By.id("submit"));

    public static final Target TEXTO_ANEXO_CARGADO = Target.the("Mensake de anexo cargado correctamente")
            .located(By.cssSelector("#formMensajes > p"));
    //Cerrar pestaña

    public static final Target DEVOLVER_REQUERIR = Target.the("Boton para entrar al apartado de devolver requerir")
            .located(By.cssSelector("#tablecb > tbody > tr:nth-child(1) > td:nth-child(10) > p > small > a:nth-child(5) > svg > path"));

    //Cambiar pestaña

    //Hacer Scroll

    public static final Target SELECT_TIPO_TRAMITE = Target.the("Desplegable para seleccionar tipo tramite")
            .located(By.id("_tipotramite"));

    public static final Target SELECT_PROCEDE_REINGRESO = Target.the("Selector de tipo porceso")
            .located(By.id("_tipodevolucion"));

    public static final Target SELECT_TIPO_DEVOLUCION = Target.the("Seleccionar tipo devolucion")
            .located(By.id("_devolucionparcial"));

    public static final Target SELECTOR_ACLARAR_AUMENTO_CAPITAL = Target.the("Selector de motivos y descriptor")
            .located(By.cssSelector("#_txtMotivos > div > div > a:nth-child(1)"));

    //Hacer Scroll
    public static final Target TXT_OBSRVACIONES_DEVOLVER = Target.the("Campo de texto para observaciones")
            .located(By.id("_observaciones"));

    //Hacer scroll
    public static final Target BTN_GRABAR = Target.the("Boton para grabar")
            .located(By.cssSelector("#page-top > div.container-fluid.align-items-center > div > div > div:nth-child(12) > div > div > div > a:nth-child(1) > button"));
    //Hacer scroll
    public static final Target BTN_VER_DEOLVER = Target.the("Boton ver")
            .located(By.cssSelector("#page-top > div.container-fluid.align-items-center > div > div > div:nth-child(14) > div > div > div > a:nth-child(1) > button"));

    public static final Target BTN_APLICAR = Target.the("Boton para aplicar")
            .located(By.cssSelector("#page-top > div.container-fluid.align-items-center > div > div > div:nth-child(14) > div > div > div > a:nth-child(3) > button"));

    public static final Target BTN_CONTUNUAR = Target.the("Boton para continuar")
            .located(By.cssSelector("#page-top > div.bootbox.modal.fade.bootbox-confirm.show > div > div > div.modal-footer > button.btn.btn-success"));

    public static final Target TEXTO_DEVOLUCION_REGISTRADA = Target.the("Mensaje informativo de que la devoluvion fue registrada exitosamente")
            .located(By.xpath("//p[text()='Mensaje informativo']"));
    //Boton asentamiento para el segundo escenario

    public static Target PAG_SIGUIENTE = Target.the("Enlace para pasar a la siguiete pagina")
            .located(By.linkText("Pantalla siguiente"));
    public static final Target ASENTAMIENTO_COMPLETO = Target.the("Hacer el asentamiento")
            .located(By.cssSelector("#tablecb > tbody > tr > td:nth-child(10) > p > small > a:nth-child(5) > svg"));

    public static final Target MENSAJE_INFORMATIVO_ASENTAMIENTO = Target.the("Titulo del informe general del asentamiento completo")
            .located(By.cssSelector("#formMensajes > div.row > div > h2 > p"));


}
