package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RenovacionPnEstablecimientoUsuarioExternoUI extends PageObject {

    public static final Target BTN_RENOVAR_MATRICULA_MERCANTIL_USUARIO_EXTERNO = Target.the("Boton Renovar matricula mercantil")
            .located(By.xpath("//h4[text()='Renovar matrícula mercantil']"));

    public static final Target TXT_NUMERO_MATRICULA_MERCANTIL_USUARIO_EXTERNO = Target.the("Escribir numero matricula mercantil")
            .located(By.id("matricula"));

    public static final Target BTN_CONTINUAR_USUARIO_EXTERNO = Target.the("Boton Continuar")
            .located(By.xpath("(//*[contains(text(), ' Continuar')])[1]"));

    public static final Target BTN_CONTINUAR_TRES_USUARIO_EXTERNO = Target.the("Boton Continuar Tres")
            .located(By.xpath("//button[text()='Continuar']"));

    public static final Target TXT_NUEVOS_ACTIVOS_USUARIO_EXTERNO = Target.the("Escribir nuevos activos")
            .located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]"));

    public static final Target TXT_NUEVOS_ACTIVOS_DOS_USUARIO_EXTERNO = Target.the("Escribir nuevos activos dos")
            .located(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]"));

    public static final Target TXT_NUMERO_EMPLEADOS_USUARIO_EXTERNO = Target.the("Escribir numero de empleados")
            .located(By.id("numeroempleados"));

    public static final Target BTN_LIQUIDAR_USUARIO_EXTERNO = Target.the("Boton Liquidar")
            .located(By.xpath("//*[text()='Liquidar']"));

    public static final Target BTN_FORMULARIO_USUARIO_EXTERNO = Target.the("Boton formulario")
            .located(By.xpath("//i[@class='fa-sharp fa-solid fa-pen-to-square']"));

    public static final Target BTN_FORMULARIO_DOS_USUARIO_EXTERNO = Target.the("Boton formulario dos")
            .located(By.xpath("(//i[@class='fa-sharp fa-solid fa-pen-to-square'])[2]"));

    public static final Target SELECT_ES_EMPRENDIMIENTO_SOCIAL_USUARIO_EXTERNO = Target.the("Seleccionar es emprendimiento social")
            .located(By.id("emprendimientosocial"));

    public static final Target SELECT_AUTORIZA_MENSAJES_CORREO_USUARIO_EXTERNO = Target.the("Seleccionar autoriza envio de mensajes al correo electronico")
            .located(By.id("ctrmennot"));

    public static final Target TXT_ACTIVO_CORRIENTE_USUARIO_EXTERNO = Target.the("Escribir activo corriente")
            .located(By.id("actcte_2025"));

    public static final Target TXT_PATRIMONIO_NETO_USUARIO_EXTERNO = Target.the("Escribir patrimonio neto")
            .located(By.id("pattot_2025"));

    public static final Target TXT_INGRESOS_ACTIVIDAD_ORDINARIA_USUARIO_EXTERNO = Target.the("Escribir ingresos actividad ordinaria")
            .located(By.id("ingope_2025"));

    public static final Target BTN_ALMACENAR_USUARIO_EXTERNO = Target.the("Boton almacenar")
            .located(By.xpath("//*[contains(text(), 'Almacenar')]"));

    public static final Target BTN_OK_USUARIO_EXTERNO = Target.the("Boton ok")
            .located(By.xpath("(//button[text()='OK'])[1]"));

    public static final Target BTN_DESCARGAR_USUARIO_EXTERNO = Target.the("Boton descargar")
            .located(By.xpath("(//i[@class=\"fas fa-download\"])[2]"));

    public static final Target BTN_FIRMA_ELECTRONICA_USUARIO_EXTERNO = Target.the("Boton firma electronica")
            .located(By.xpath("//*[text()='Firma Electrónica']"));

    public static final Target BTN_VER_USUARIO_EXTERNO = Target.the("Boton ver")
            .located(By.xpath("(//i[@class=\"fas fa-eye fa-stack-1x fa-inverse bg-info rounded\"])[1]"));

    public static final Target BTN_VER_DOS_USUARIO_EXTERNO = Target.the("Boton ver dos")
            .located(By.xpath("(//i[@class=\"fas fa-eye fa-stack-1x fa-inverse bg-info rounded\"])[2]"));

    public static final Target BTN_CERRAR_USUARIO_EXTERNO = Target.the("Boton cerrar")
            .located(By.xpath("(//button[text()='Cerrar'])[2]"));

    public static final Target BTN_CERRAR_DOS_USUARIO_EXTERNO = Target.the("Boton cerrar")
            .located(By.xpath("//button[text()='Cerrar']"));

    public static final Target BTN_ACEPTAR_TRAMITE_NO_FINALIZADO = Target.the("Boton aceptar tramite no finalizado")
            .located(By.cssSelector("button[class='swal2-confirm swal2-styled']"));

    public static final Target BTN_FIRMAR_USUARIO_EXTERNO = Target.the("Boton firmar")
            .located(By.id("firmar"));

    public static final Target BTN_SI_USUARIO_EXTERNO = Target.the("Boton si")
            .located(By.xpath("//button[text()='Si']"));

    public static final Target BTN_OBTENER_SOBRE_DIGITAL_USUARIO_EXTERNO = Target.the("Boton obtener sobre digital")
            .located(By.xpath("//*[text()='Obtener Sobre Digital']"));

    public static final Target BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO = Target.the("Boton Pago electronico")
            .located(By.xpath("(//*[text()='Pago Electrónico'])"));

    public static final Target BTN_CONTINUAR_DOS_USUARIO_EXTERNO = Target.the("Boton Continuar")
            .located(By.id("submit"));
    public static final Target BTN_CERRAR_APRECIADO_CLIENTE = Target.the("Boton Continuar")
            .located(By.xpath("/html/body/div[4]/div/div/div[3]/button"));

    public static final Target TXT_IDENTIFICACION_USUARIO_EXTERNO = Target.the("Escribir identificacion")
            .located(By.id("_identificacioncliente"));

    public static final Target TXT_CONFIRMACION_CORREO_USUARIO_EXTERNO = Target.the("Escribir confirmacion del correo")
            .located(By.id("_email"));

    public static final Target BTN_PAGAR_TUCOMPRA_USUARIO_EXTERNO = Target.the("Boton pagar con TuCompra")
            .located(By.xpath("//button[text()='Pagar con PSE o Tarjeta de Crédito']"));

    public static final Target SELECT_CODIGO_REGIMEN_USUARIO_EXTERNO = Target.the("Seleccionar codigo regimen")
            .located(By.id("_codigoregimen"));

    public static final Target SELECT_RESPONSABILIDAD_FISCAL_USUARIO_EXTERNO = Target.the("Seleccionar responsabilidad fiscal")
            .located(By.id("_responsabilidadfiscal"));

    public static final Target BTN_TIPO_DOCUMENTO_USUARIO_EXTERNO = Target.the("Boton tipo documento")
            .located(By.xpath("//span[text()='Seleccione Tipo de Documento']"));

    public static final Target BTN_CEDULA_USUARIO_EXTERNO = Target.the("Boton cedula")
            .located(By.xpath("//li[@aria-label=\"Cédula Ciudadania\"]"));

    public static final Target BTN_CELULAR_USUARIO_EXTERNO = Target.the("Boton celular")
            .located(By.id("celularComprador"));

    public static final Target BTN_PAIS_EXTERNO = Target.the("Boton pais")
            .located(By.xpath("//span[text()='Seleccione Pais']"));
            //.located(By.id("paisComprador"));

    public static final Target TXT_PAIS_EXTERNO = Target.the("Escribir pais")
            .located(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component ng-tns-c53-5']"));

    public static final Target BTN_COLOMBIA_EXTERNO = Target.the("Boton colombia")
            .located(By.xpath("//li[@aria-label=\"COLOMBIA\"]"));

    public static final Target BTN_CIUDAD_EXTERNO = Target.the("Boton ciudad")
            .located(By.xpath("//span[text()='Seleccione Ciudad']"));

    public static final Target TXT_CIUDAD_EXTERNO = Target.the("Escribir ciudad")
            .located(By.xpath("(//input[@class='p-dropdown-filter p-inputtext p-component ng-tns-c53-7'])[1]"));

    public static final Target BTN_BOGOTA_EXTERNO = Target.the("Boton bogota")
            .located(By.xpath("//li[@aria-label=\"Bogotá\"]"));

    public static final Target CHK_BOX_ACEPTO_POLITICA_USUARIO_EXTERNO = Target.the("Check box acepto politica")
            .located(By.xpath("//div[@role=\"checkbox\"]"));

    public static final Target BTN_PAGO_VISA_USUARIO_EXTERNO = Target.the("Boton pago con visa")
            .located(By.xpath("(//div[@class=\"p-col-2 p-shadow-2 p-m-1 purple cardmedios p-ripple ng-star-inserted\"])[2]"));

    public static final Target TXT_NUMERO_TARJETA_EXTERNO = Target.the("Escribir numero de tarjeta")
            .located(By.id("nroTarjeta"));

    public static final Target TXT_CODIGO_SEGURIDAD_EXTERNO = Target.the("Escribir codigo de seguridad")
            .located(By.id("cvvCode"));

    public static final Target BTN_MES_USUARIO_EXTERNO = Target.the("Boton mes")
            .located(By.xpath("//span[text()='Mes']"));

    public static final Target BTN_DOCE_USUARIO_EXTERNO = Target.the("Boton doce")
            .located(By.xpath("//li[@aria-label=\"12\"]"));

    public static final Target BTN_ANO_USUARIO_EXTERNO = Target.the("Boton ano")
            .located(By.xpath("//span[text()='Año']"));

    public static final Target BTN_2024_USUARIO_EXTERNO = Target.the("Boton 2024")
            .located(By.xpath("//li[@aria-label=\"2024\"]"));

    public static final Target BTN_CUOTAS_USUARIO_EXTERNO = Target.the("Boton cuotas")
            .located(By.xpath("//span[text()='Cuotas']"));

    public static final Target BTN_UNA_USUARIO_EXTERNO = Target.the("Boton cuotas una")
            .located(By.xpath("//li[@aria-label=\"1\"]"));

    public static final Target BTN_PAGAR_USUARIO_EXTERNO = Target.the("Boton pagar")
            .located(By.xpath("//button[@styleclass=\"botones pagar\"]"));

    public static final Target LBL_FINALLIZAR_COMPRA_USUARIO_EXTERNO = Target.the("Mensaje finalizar compra")
            .located(By.xpath("//h3[text()='Transacción Aprobada']"));

    public static final Target BTN_FINALIZAR_USUARIO_EXTERNO = Target.the("Boton finalizar")
            .located(By.xpath("//span[text()='Finalizar']"));

    public static final Target BTN_RETORNAR_TRAMITE_USUARIO_EXTERNO = Target.the("Boton retornar tramite")
            .located(By.xpath("//button[text()='Retomar trámite']"));

    public static final Target LBL_RESUMEN_USUARIO_EXTERNO = Target.the("Mensaje resumen final transaccion")
            .located(By.xpath("//strong[text()='Resumen final de la transacción']"));

    public static final Target BTN_SOPORTES_USUARIO_EXTERNO = Target.the("Boton soportes")
            .located(By.id("soportesT"));

    public static final Target BTN_VER_SOBRE_DIGITAL_USUARIO_EXTERNO = Target.the("Boton ver sobre digital")
            .located(By.xpath("(//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"])[1]"));

    public static final Target BTN_VER_RECIBO_CAJA_USUARIO_EXTERNO = Target.the("Boton ver recibo de caja")
            .located(By.xpath("(//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"])[2]"));

    public static final Target BTN_VER_RADICADO_USUARIO_EXTERNO = Target.the("Boton ver radicado")
            .located(By.xpath("(//a[@href=\"javascript:void(0);\" and @class=\"btn btn-outline-primary btn-sm\"])[7]"));

    public static final Target BTN_CONTINUAR_CUATRO_USUARIO_EXTERNO = Target.the("Boton continuar cuatro")
            .located(By.xpath("//*[contains(text(), \" Continuar\")]"));
}