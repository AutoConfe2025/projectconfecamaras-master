package com.co.confecamaras.tasks.Bandeja;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted3Segundos;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.utils.bandejaponal.BandejaPonalConstans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.setBarcode;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.LBL_CODIGO_BARRAS_ID;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.LBL_CODIGO_BARRAS_ID_DOS;


public class BandejaLeyPonal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Bloque ingreso a la bandeja

        String barcode = LBL_CODIGO_BARRAS_ID_DOS.resolveFor(actor).getText();
        System.out.println("¡ESTE ES EL CODIGO DE BARRAS!" + barcode);
        setBarcode(barcode);

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(TXT_BUSCAR_MENU_LATERAL),
                Enter.theValue("(R) Ley1780 + PONA L + NO-AUT").into(TXT_BUSCAR_MENU_LATERAL),
//                WaitInteractions.untilBeEnable(BTN_BANDEJAS),
//                Click.on(BTN_BANDEJAS),
//                WaitInteractions.untilBeEnable(BTN_REGISTROS_PUBLICOS),
//                Click.on(BTN_REGISTROS_PUBLICOS),
//                WaitInteractions.untilBeEnable(BTN_LEY_1780_PONAL_NO_AUTM),
//                Click.on(BTN_LEY_1780_PONAL_NO_AUTM),
                WaitInteractions.untilBeEnable(BTN_PRIMERA_OPCION),
                Click.on(BTN_PRIMERA_OPCION),
                CerrarPestana.cerrar()
        );

        //Bloque ver ruta
        if(actor.asksFor(ElementoElegible.para(PAG_SIGUIENTE))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(PAG_SIGUIENTE),
                    Click.on(PAG_SIGUIENTE)
            );
        }
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(MENU_DES_FILTRAR),
                SelectFromOptions.byVisibleText("Mutaciones").from(MENU_DES_FILTRAR),
                WaitInteractions.untilBeEnable(BUSCADOR),
                Enter.theValue(barcode).into(BUSCADOR),
                Click.on(VER_RUTA),
                //Switch.toNewWindow(),
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(VER_RECIBO_CAJA),
                Scroll.to(VER_RECIBO_CAJA),
                Click.on(VER_RECIBO_CAJA)
                //RobotCerrarVentanaEmergente.cerrar(),
        );
        if(actor.asksFor(ElementoElegible.para(SOLICITUD_CANCELACION))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(SOLICITUD_CANCELACION),
                    Click.on(SOLICITUD_CANCELACION)
            );
        } else {
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(BTN_REGRESAR),
                    Scroll.to(BTN_REGRESAR).andAlignToBottom(),
                    Click.on(BTN_REGRESAR)
            );
        }
        actor.attemptsTo(
                //RobotCerrarVentanaEmergente.cerrar(),
                WaitInteractions.untilBeEnable(VER_SOBRE_DIGITAL),
                Click.on(VER_SOBRE_DIGITAL),
                //RobotCerrarVentanaEmergente.cerrar(),
//                Click.on(VER_SOPORTE_NOTIFCACION_EMAIL_UNO),
//                //RobotCerrarVentanaEmergente.cerrar(),
//                Click.on(VER_SOPORTE_NOTIFCACION_EMAIL_DOS),
//                //RobotCerrarVentanaEmergente.cerrar(),
//                Click.on(VER_SOPORTE_NOTIFCACION_SMS),
                //RobotCerrarVentanaEmergente.cerrar(),
                //WaitInterrupted3Segundos.esperaConstante3(),
                CerrarPestana.cerrar()
        );
        if(actor.asksFor(ElementoElegible.para(SOLICITUD_CANCELACION))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(SOLICITUD_CANCELACION),
                    Click.on(SOLICITUD_CANCELACION)
            );
        }

        //BLOQUE ADICIONAR COMENTARIOS
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(AGREGAR_COMENTARIOS),
                //Enter.theValue("CANCELACION").into(BUSCADOR),
                Click.on(AGREGAR_COMENTARIOS),
                WaitSeconds.seconds(2),
                CambiarALaSiguientePestana.siguiente()
        );
        if(actor.asksFor(ElementoElegible.para(SELECT_TIPO_COMENTARIO))){
            actor.attemptsTo(
                    WaitInteractions.untilBeEnable(SELECT_TIPO_COMENTARIO),
                    SelectFromOptions.byValue("01").from(SELECT_TIPO_COMENTARIO),
                    WaitInteractions.untilBeEnable(TXT_COMENTARIOS),
                    Enter.theValue(BandejaPonalConstans.COMENTARIO).into(TXT_COMENTARIOS),
                    WaitInteractions.untilBeEnable(BTN_GRABAR_COMENTARIO),
                    Click.on(BTN_GRABAR_COMENTARIO),
                    Ensure.that(TEXTO_COMENTARIO_ALMACENADO).text().isEqualTo(BandejaPonalConstans.MENSAJE_INFORMATIVO_BLOQUE_ADD_COMENTARIO),
                    WaitInterrupted3Segundos.esperaConstante3(),
                    CerrarPestana.cerrar()
            );
        } else {
            actor.attemptsTo(
                    CerrarPestana.cerrar(),
                    WaitInteractions.untilBeEnable(REFRESCAR),
                    Click.on(REFRESCAR),
                    WaitInteractions.untilBeEnable(BUSCADOR),
                    Enter.theValue(barcode).into(BUSCADOR),
                    Click.on(AGREGAR_COMENTARIOS1),
                    WaitSeconds.seconds(3),
                    CambiarALaSiguientePestana.siguiente(),
                    WaitInteractions.untilBeEnable(SELECT_TIPO_COMENTARIO),
                    SelectFromOptions.byValue("01").from(SELECT_TIPO_COMENTARIO),
                    WaitInteractions.untilBeEnable(TXT_COMENTARIOS),
                    Enter.theValue(BandejaPonalConstans.COMENTARIO).into(TXT_COMENTARIOS),
                    WaitInteractions.untilBeEnable(BTN_GRABAR_COMENTARIO),
                    Click.on(BTN_GRABAR_COMENTARIO),
                    Ensure.that(TEXTO_COMENTARIO_ALMACENADO).text().isEqualTo(BandejaPonalConstans.MENSAJE_INFORMATIVO_BLOQUE_ADD_COMENTARIO),
                    WaitSeconds.seconds(3),
                    CerrarPestana.cerrar()
            );
        }

        //REFRESCAR
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(REFRESCAR),
                Click.on(REFRESCAR),
                //Click.on(PAG_SIGUIENTE),
                WaitInteractions.untilBeEnable(BUSCADOR),
                Enter.theValue(barcode).into(BUSCADOR)
        );

        //BLOQUE ADICIONAR ANEXO
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(VER_ADICIONAR_ANEXO),
                //Enter.theValue("cancelacion").into(BUSCADOR),
                Click.on(VER_ADICIONAR_ANEXO),
                WaitInterrupted2Segundos.esperaConstante2(),
                CambiarALaSiguientePestana.siguiente(),
                SubirLeySinAsentamiento.subirAnexo(),
                WaitInteractions.untilBeEnable(SELECT_TIPO_DOCUMENTO),
                SelectFromOptions.byValue("90.01.015").from(SELECT_TIPO_DOCUMENTO),
                Enter.theValue(BandejaPonalConstans.NUM_DOCUMENTO).into(INPUT_NUMERO_DE_DOCUMENTO),
                WaitInteractions.untilBeEnable(INPUT_CELENDARIO),
                Enter.theValue(BandejaPonalConstans.FECHA).into(INPUT_CELENDARIO),
                WaitInteractions.untilBeEnable(INPUT_ORIGEN_DOCUMENTO),
                Enter.theValue(BandejaPonalConstans.ORIGEN_TEXTO).into(INPUT_ORIGEN_DOCUMENTO),
                WaitInteractions.untilBeEnable(BTN_CARGAR_ANEXO),
                Click.on(BTN_CARGAR_ANEXO),
                Ensure.that(TEXTO_ANEXO_CARGADO).text().isEqualTo(BandejaPonalConstans.MENSAJE_INFORMATIVO_ANEXO_CARGADO),
                WaitInterrupted2Segundos.esperaConstante2(),
                CerrarPestana.cerrar()
        );

        //BLOQUE  DEVOLVER/REQUERIR

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(DEVOLVER_REQUERIR),
                //Enter.theValue("cancelacion").into(BUSCADOR),
                Click.on(DEVOLVER_REQUERIR),
                WaitInterrupted2Segundos.esperaConstante2(),
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(SELECT_TIPO_TRAMITE),
                Scroll.to(SELECT_TIPO_TRAMITE).then(SelectFromOptions.byValue("oficiosregmer").from(SELECT_TIPO_TRAMITE)),
                SelectFromOptions.byValue("D").from(SELECT_PROCEDE_REINGRESO),
                SelectFromOptions.byValue("V").from(SELECT_TIPO_DEVOLUCION),
                Scroll.to(SELECTOR_ACLARAR_AUMENTO_CAPITAL).andAlignToBottom().then(Click.on(SELECTOR_ACLARAR_AUMENTO_CAPITAL)),
                Scroll.to(TXT_OBSRVACIONES_DEVOLVER).andAlignToBottom().then(Enter.theValue(BandejaPonalConstans.ORIGEN_TEXTO).into(TXT_OBSRVACIONES_DEVOLVER)),
                Scroll.to(BTN_GRABAR).andAlignToBottom().then(Click.on(BTN_GRABAR)),
                WaitInterrupted3Segundos.esperaConstante3()
        );

        actor.attemptsTo(
                CerrarPestana.cerrar(),
                WaitInteractions.untilBeEnable(DEVOLVER_REQUERIR),
                Click.on(DEVOLVER_REQUERIR),
                WaitInterrupted2Segundos.esperaConstante2(),
                CambiarALaSiguientePestana.siguiente(),
                Scroll.to(SELECT_TIPO_TRAMITE).andAlignToBottom(),
                Scroll.to(SELECTOR_ACLARAR_AUMENTO_CAPITAL).andAlignToBottom(),
                Scroll.to(TXT_OBSRVACIONES_DEVOLVER).andAlignToBottom(),
                Scroll.to(BTN_VER_DEOLVER).andAlignToBottom().then(Click.on(BTN_VER_DEOLVER))

        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_APLICAR),
                Click.on(BTN_APLICAR),
                WaitInteractions.untilBeEnable(BTN_CONTUNUAR),
                Click.on(BTN_CONTUNUAR),
                WaitInterrupted5Segundos.esperaConstante5()
        );
    }

    public static final BandejaLeyPonal sinAsentamiento() {
        return Tasks.instrumented(BandejaLeyPonal.class);
    }
}
