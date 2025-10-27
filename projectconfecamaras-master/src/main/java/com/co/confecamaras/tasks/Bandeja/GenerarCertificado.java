package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.BTN_BANDEJAS;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.BTN_REGISTROS_PUBLICOS;
import static com.co.confecamaras.userinterfaces.Bandejas.CertificadosEspecialesPage.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.BTN_CONTINUAR;

public class GenerarCertificado implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                SelectFromOptions.byValue("1").from(SELECT_TIPO_CONSULTA),
                WaitInterrupted2Segundos.esperaConstante2(),
                Enter.theValue("77647").into(INPUT_INFORMACION_USQUEDA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_ACCIONES_),
                Click.on(BTN_ACCIONES_),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TRAMITES_REGISTRO_MERCABTIL),
                Click.on(TRAMITES_REGISTRO_MERCABTIL),
                WaitInteractions.untilBeEnable(BTN_SOLICITAR_CERTIFICADOS),
                Click.on(BTN_SOLICITAR_CERTIFICADOS),
                WaitInteractions.untilBeEnable(BTN_C_ESPECIALES),
                Click.on(BTN_C_ESPECIALES),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(SELECT_TIPO_DE_CERTIFICADO),
                //SelectFromOptions.byValue("01.01").from(SELECT_TIPO_DE_CERTIFICADO),
                SelectFromOptions.byVisibleText("01.01 - NEGATIVOS DE PERSONA NATURAL").from(SELECT_TIPO_DE_CERTIFICADO),
                WaitInteractions.untilBeEnable(TXT_EXPLIQUE_CERTIFICACION_QUE_NECESITA),
                Enter.theValue("QA").into(TXT_EXPLIQUE_CERTIFICACION_QUE_NECESITA),
                WaitInteractions.untilBeEnable(INPUT_CANTIDAD_CERTIFICADOS),
                Enter.theValue("1").into(INPUT_CANTIDAD_CERTIFICADOS),
                WaitInteractions.untilBeEnable(SELECT_TIPO_DE_SOLICITUD),
                SelectFromOptions.byValue("2").from(SELECT_TIPO_DE_SOLICITUD),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_GENERAR_LIQUIDACION),
                Click.on(BTN_CONTINUAR_GENERAR_LIQUIDACION),
                ModalLoader.modalLoader()
        );

        //Facturar cliente final generico
        actor.attemptsTo(
                WaitSeconds.seconds(3),
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_FACTURAR_A_CLIENTE_GENERICO),
                Scroll.to(BTN_FACTURAR_A_CLIENTE_GENERICO).andAlignToBottom(),
                Click.on(BTN_FACTURAR_A_CLIENTE_GENERICO),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_FACTURAR_A_CLIENTE_GENERICO),
                Click.on(BTN_ACEPTAR_FACTURAR_A_CLIENTE_GENERICO),
                WaitInteractions.untilBeEnable(BTN_GENERAR_RECIBO),
                Scroll.to(BTN_GENERAR_RECIBO),
                Click.on(BTN_GENERAR_RECIBO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_GENERAR_RECIBO),
                Click.on(BTN_CONTINUAR_GENERAR_RECIBO),
                WaitInteractions.untilBeEnable(LBL_RECIBO_OPERACION_CAMARA),
                CerrarPestana.cerrar()
        );

        //Editar modelo
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_OK_CONTINUAR),
                Click.on(BTN_OK_CONTINUAR),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_BANDEJAS),
                Click.on(BTN_BANDEJAS),
                WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS),
                Click.on(BTN_REGISTROS_PUBLICOS),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS_ESPECIALES),
                Scroll.to(BTN_CERTIFICADOS_ESPECIALES),
                JavaScriptClick.on(BTN_CERTIFICADOS_ESPECIALES),
                WaitInteractions.untilBeEnable(BTN_EDITAR_MODELO),
                JavaScriptClick.on(BTN_EDITAR_MODELO),
                WaitInteractions.untilBeEnable(TXT_EXPLICACION),
                Scroll.to(TXT_EXPLICACION),
                Enter.theValue("Automatizacion QA 1").into(TXT_EXPLICACION),
                WaitInteractions.untilBeEnable(TXT_DETALLE_DEL_TRAMITE),
                Scroll.to(TXT_DETALLE_DEL_TRAMITE),
                Enter.theValue("QA").into(TXT_DETALLE_DEL_TRAMITE),
                WaitInteractions.untilBeEnable(TXT_EMAIL),
                Scroll.to(TXT_EMAIL),
                Enter.theValue("frojasqaconfe@gmail.com").into(TXT_EMAIL),
                //WaitInteractions.untilBeEnable(BTN_SUBIR_ANEXO),
                //Scroll.to(BTN_SUBIR_ANEXO),
                SendKeys.of(FileUpload.subirArchivo().archivoPj()).into(BTN_SUBIR_ANEXO),
                WaitInteractions.untilBeEnable(BTN_OK_CARGADO),
                Click.on(BTN_OK_CARGADO)
        );

        //Eliminar soporte
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_EDITAR_MODELO),
                JavaScriptClick.on(BTN_EDITAR_MODELO),
                WaitInteractions.untilBeEnable(TXT_EXPLICACION),
                Scroll.to(TXT_EXPLICACION),
                WaitInteractions.untilBeEnable(TXT_EMAIL),
                Scroll.to(TXT_EMAIL),
                //WaitInteractions.untilBeEnable(BTN_SUBIR_ANEXO_ELIMINACION),
                //Scroll.to(BTN_SUBIR_ANEXO_ELIMINACION),
                SendKeys.of(FileUpload.subirArchivo().archivoPj()).into(BTN_SUBIR_ANEXO),
                WaitInteractions.untilBeEnable(BTN_OK_CARGADO),
                Click.on(BTN_OK_CARGADO),
                WaitInteractions.untilBeEnable(BTN_EDITAR_MODELO),
                JavaScriptClick.on(BTN_EDITAR_MODELO),
                WaitInteractions.untilBeEnable(BTN_ELIMINAR),
                Scroll.to(BTN_ELIMINAR),
                Click.on(BTN_ELIMINAR),
                WaitInteractions.untilBeEnable(BTN_CONFIRMAR_ELIMINAR_ANEXO),
                Click.on(BTN_CONFIRMAR_ELIMINAR_ANEXO),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_ELIMINADO),
                Click.on(BTN_ACEPTAR_ELIMINADO),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_GRABAR_INFORMACION),
                Scroll.to(BTN_GRABAR_INFORMACION),
                JavaScriptClick.on(BTN_GRABAR_INFORMACION),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_INFO_GRABADA),
                Click.on(BTN_ACEPTAR_INFO_GRABADA),
                WaitInterrupted3Segundos.esperaConstante3()
        );

        //Consultar
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_CONSULTAR_CERTIFICADO),
                JavaScriptClick.on(BTN_CONSULTAR_CERTIFICADO),
                WaitInteractions.untilBeEnable(BTN_CERRAR_CONSULTA),
                Click.on(BTN_CERRAR_CONSULTA)
        );

        //Generar pdf repositorio
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_GENERAR_PDF_REPOSITORIO),
                JavaScriptClick.on(BTN_GENERAR_PDF_REPOSITORIO),
                WaitInteractions.untilBeEnable(BTN_GENERAR_PDF),
                Click.on(BTN_GENERAR_PDF),
                ModalLoader.modalLoader(),
                WaitSeconds.seconds(3),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_GENERAR_PDF),
                JavaScriptClick.on(BTN_ACEPTAR_GENERAR_PDF)
        );
        //Ver PDF
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_VER_PDF),
                //SelectFromOptions.byValue("pendientes").from(SELECT_FILTRO),
                JavaScriptClick.on(BTN_VER_PDF),
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_CERRAR_PDF),
                Click.on(BTN_CERRAR_PDF)
        );
        //EDITAR email
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_EDITAR_EMAIL),
                JavaScriptClick.on(BTN_EDITAR_EMAIL),
                WaitInteractions.untilBeEnable(TXT_EMAIL),
                Scroll.to(TXT_EMAIL),
                Enter.theValue("ANALISTA@CONFECAMARAS.ORG.CO").into(TXT_EMAIL),
                WaitInteractions.untilBeEnable(BTN_GRABAR_CAMBIO_EMAIL),
                Scroll.to(BTN_GRABAR_CAMBIO_EMAIL),
                JavaScriptClick.on(BTN_GRABAR_CAMBIO_EMAIL),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_INFO_GRABADA),
                Click.on(BTN_ACEPTAR_INFO_GRABADA)

        );

        //Enviar correo
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_ENVIAR_EMAILF),
                JavaScriptClick.on(BTN_ENVIAR_EMAILF),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_ENVIO_EMAIL),
                Click.on(BTN_ACEPTAR_ENVIO_EMAIL),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_ENViO_EMAIL),
                JavaScriptClick.on(BTN_ACEPTAR_ENViO_EMAIL),
                WaitInteractions.untilBeEnable(BTN_VER_SOLICITUD),
                JavaScriptClick.on(BTN_VER_SOLICITUD),
                WaitInteractions.untilBeEnable(CERRA_DOCUMENTO),
                Click.on(CERRA_DOCUMENTO)
        );

        //Buscar expediente
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS),
                WaitInteractions.untilBeEnable(BTN_BANDEJAS),
                JavaScriptClick.on(BTN_BANDEJAS),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_Y_TRANSACCIONES),
                JavaScriptClick.on(BTN_CONSULTAS_Y_TRANSACCIONES),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_REGISTROS_P),
                JavaScriptClick.on(BTN_CONSULTAS_REGISTROS_P),
                WaitInteractions.untilBeEnable(BTN_EXPEDIENTES),
                JavaScriptClick.on(BTN_EXPEDIENTES),

/////////////////////////////////////////////////////////////////////////////
             /*   ModalLoader.modalLoader(),
                Click.on(BTN_MENU_LATERAL),
                *//*WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_BANDEJAS),*//*
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_CONSULTAS_Y_TRANSACCIONES),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_CONSULTAS_REGISTROS_P),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_EXPEDIENTES),*/
/////////////////////////////////////////////////////////////////////////

                WaitInteractions.untilBeEnable(SELECT_TIPO_CONSULTA),
                SelectFromOptions.byValue("1").from(SELECT_TIPO_CONSULTA),
                WaitInteractions.untilBeEnable(INPUT_INFORMACION_USQUEDA),
                Enter.theValue("76741").into(INPUT_INFORMACION_USQUEDA),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR),
                JavaScriptClick.on(BTN_CONTINUAR),
                WaitInteractions.untilBeEnable(BTN_ACCIONES_),
                JavaScriptClick.on(BTN_ACCIONES_),
                WaitInteractions.untilBeEnable(TRAMITES_REGISTRO_MERCABTIL),
                JavaScriptClick.on(TRAMITES_REGISTRO_MERCABTIL),
                WaitInteractions.untilBeEnable(BTN_SOLICITAR_CERTIFICADOS),
                JavaScriptClick.on(BTN_SOLICITAR_CERTIFICADOS),
                WaitInteractions.untilBeEnable(BTN_C_ESPECIALES),
                JavaScriptClick.on(BTN_C_ESPECIALES),
                WaitInteractions.untilBeEnable(SELECT_TIPO_DE_CERTIFICADO),
                //SelectFromOptions.byValue("01.01").from(SELECT_TIPO_DE_CERTIFICADO),
                SelectFromOptions.byVisibleText("01.11 - HISTORICO DE DIRECCIONES").from(SELECT_TIPO_DE_CERTIFICADO),
                WaitInteractions.untilBeEnable(TXT_EXPLIQUE_CERTIFICACION_QUE_NECESITA),
                Enter.theValue("QA").into(TXT_EXPLIQUE_CERTIFICACION_QUE_NECESITA),
                WaitInteractions.untilBeEnable(INPUT_CANTIDAD_CERTIFICADOS),
                Enter.theValue("1").into(INPUT_CANTIDAD_CERTIFICADOS),
                WaitInteractions.untilBeEnable(SELECT_TIPO_DE_SOLICITUD),
                SelectFromOptions.byValue("2").from(SELECT_TIPO_DE_SOLICITUD),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_GENERAR_LIQUIDACION),
                JavaScriptClick.on(BTN_CONTINUAR_GENERAR_LIQUIDACION)
        );

        //Facturar nueva matricula
        actor.attemptsTo(
                WaitInterrupted3Segundos.esperaConstante3(),
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(BTN_FACTURAR_A_CLIENTE_GENERICO),
                Scroll.to(BTN_FACTURAR_A_CLIENTE_GENERICO).andAlignToBottom(),
                JavaScriptClick.on(BTN_FACTURAR_A_CLIENTE_GENERICO),
                WaitInteractions.untilBeEnable(BTN_ACEPTAR_FACTURAR_A_CLIENTE_GENERICO),
                JavaScriptClick.on(BTN_ACEPTAR_FACTURAR_A_CLIENTE_GENERICO),
                WaitInteractions.untilBeEnable(BTN_GENERAR_RECIBO),
                Scroll.to(BTN_GENERAR_RECIBO),
                JavaScriptClick.on(BTN_GENERAR_RECIBO),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_GENERAR_RECIBO),
                JavaScriptClick.on(BTN_CONTINUAR_GENERAR_RECIBO),
                CerrarPestana.cerrar()
        );


        //Certificados especiales segunda matricula
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_OK_CONTINUAR),
                JavaScriptClick.on(BTN_OK_CONTINUAR),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_REGISTROS_P),
                JavaScriptClick.on(BTN_CONSULTAS_REGISTROS_P),
                WaitInteractions.untilBeEnable(BTN_CONSULTAS_Y_TRANSACCIONES),
                JavaScriptClick.on(BTN_CONSULTAS_Y_TRANSACCIONES),
                WaitInteractions.untilBeEnable(BTN_BANDEJAS),
                JavaScriptClick.on(BTN_BANDEJAS),
                WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS),
                JavaScriptClick.on(BTN_REGISTROS_PUBLICOS),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS_ESPECIALES),
                Scroll.to(BTN_CERTIFICADOS_ESPECIALES),
                JavaScriptClick.on(BTN_CERTIFICADOS_ESPECIALES)

        );
        if(actor.asksFor(ElementoElegible.para(BTN_ENTREGA_PRESENCIAL))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_ENTREGA_PRESENCIAL),
                    JavaScriptClick.on(BTN_ENTREGA_PRESENCIAL),
                    WaitInteractions.untilBeEnable(BTN_ACEPTAR_ENTREGA_PRESENCIAL),
                    JavaScriptClick.on(BTN_ACEPTAR_ENTREGA_PRESENCIAL),
                    WaitInteractions.untilBeEnable(BTN_ACEPTAR_MENSAJE_ENTREGA)
                    //Click.on(BTN_ACEPTAR_MENSAJE_ENTREGA)
            );
        } else {
            //Editar modelo
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_OK_CONTINUAR),
                    Click.on(BTN_OK_CONTINUAR),
                    WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                    Click.on(BTN_MENU_LATERAL),
                    ModalLoader.modalLoader(),
                    WaitInteractions.untilBeEnable(BTN_BANDEJAS),
                    Click.on(BTN_BANDEJAS),
                    WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS),
                    Click.on(BTN_REGISTROS_PUBLICOS),
                    WaitInteractions.untilBeEnable(BTN_CERTIFICADOS_ESPECIALES),
                    Scroll.to(BTN_CERTIFICADOS_ESPECIALES),
                    JavaScriptClick.on(BTN_CERTIFICADOS_ESPECIALES),
                    WaitInteractions.untilBeEnable(BTN_EDITAR_MODELO),
                    JavaScriptClick.on(BTN_EDITAR_MODELO),
                    WaitInteractions.untilBeEnable(TXT_EXPLICACION),
                    Scroll.to(TXT_EXPLICACION),
                    Enter.theValue("Automatizacion QA 1").into(TXT_EXPLICACION),
                    WaitInteractions.untilBeEnable(TXT_DETALLE_DEL_TRAMITE),
                    Scroll.to(TXT_DETALLE_DEL_TRAMITE),
                    Enter.theValue("QA").into(TXT_DETALLE_DEL_TRAMITE),
                    WaitInteractions.untilBeEnable(TXT_EMAIL),
                    Scroll.to(TXT_EMAIL),
                    Enter.theValue("frojasqaconfe@gmail.com").into(TXT_EMAIL),
                    //WaitInteractions.untilBeEnable(BTN_SUBIR_ANEXO),
                    //Scroll.to(BTN_SUBIR_ANEXO),
                    SendKeys.of(FileUpload.subirArchivo().archivoPj()).into(BTN_SUBIR_ANEXO),
                    WaitInteractions.untilBeEnable(BTN_OK_CARGADO),
                    Click.on(BTN_OK_CARGADO)
            );
            //Generar pdf repositorio
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_GENERAR_PDF_REPOSITORIO),
                    JavaScriptClick.on(BTN_GENERAR_PDF_REPOSITORIO),
                    WaitInteractions.untilBeEnable(BTN_GENERAR_PDF),
                    Click.on(BTN_GENERAR_PDF),
                    ModalLoader.modalLoader(),
                    WaitSeconds.seconds(3),
                    WaitInteractions.untilBeEnable(BTN_ACEPTAR_GENERAR_PDF),
                    JavaScriptClick.on(BTN_ACEPTAR_GENERAR_PDF),
                    ModalLoader.modalLoader()
            );

            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_ENTREGA_PRESENCIAL),
                    JavaScriptClick.on(BTN_ENTREGA_PRESENCIAL),
                    WaitInteractions.untilBeEnable(BTN_ACEPTAR_ENTREGA_PRESENCIAL),
                    JavaScriptClick.on(BTN_ACEPTAR_ENTREGA_PRESENCIAL),
                    WaitInteractions.untilBeEnable(BTN_ACEPTAR_MENSAJE_ENTREGA)
                    //Click.on(BTN_ACEPTAR_MENSAJE_ENTREGA)
            );
        }
    }

    public static GenerarCertificado especial() {
        return Tasks.instrumented(GenerarCertificado.class);
    }
}
