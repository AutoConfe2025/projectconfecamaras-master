package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cambiarpestana.SwitchToWindow;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted5Segundos;
import com.co.confecamaras.interactions.waitinteractions.WaitInterrupted7Segundos;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import com.co.confecamaras.utils.UrlPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import java.awt.*;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.*;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.*;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.RepartoDocumentosUI.*;
import static com.co.confecamaras.models.VariableRepartoDocumentos.*;
import static com.co.confecamaras.userinterfaces.RepartoDocumentosUI.BTN_GRABAR;
import static net.serenitybdd.screenplay.Tasks.*;

public class RepartoDocumentos implements Task {

    private final String selectTipo;
    private final String idComentario;
    private final String selectUsuario;

    public RepartoDocumentos(String selectTipo, String idComentario, String selectUsuario) {
        this.selectTipo = selectTipo;
        this.idComentario = idComentario;
        this.selectUsuario = selectUsuario;
    }

    String barcode = getBarcode();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                JavaScriptClick.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSCAR_MENU_LATERAL),
                Enter.theValue("(R) Reparto y Escaneo").into(TXT_BUSCAR_MENU_LATERAL).thenHit(Keys.ENTER),
                WaitInteractions.untilBeEnable(BTN_PRIMERA_OPCION_2),
                JavaScriptClick.on(BTN_PRIMERA_OPCION_2),
                SwitchToWindow.at(1),
//                CerrarPestana.cerrar(),
                WaitInteractions.untilAppears(TXT_BUSCAR_CODIGO_REPARTO_DOCUMENTOS),
                Enter.theValue(barcode).into(TXT_BUSCAR_CODIGO_REPARTO_DOCUMENTOS),
                Click.on(TXT_BUSCAR_CLICK),
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_VER_RUTA_REPARTO_DOCUMENTOS),
                JavaScriptClick.on(BTN_VER_RUTA_REPARTO_DOCUMENTOS),
                //Click.on(BTN_VER_RUTA_REPARTO_DOCUMENTOS),
                //CambiarALaSiguientePestana.siguiente(),
                WaitSeconds.seconds(2),
                CambiarALaSiguientePestana.siguiente(),
                CerrarPestana.cerrar(),
                WaitSeconds.seconds(2),
                WaitInteractions.untilBeEnable(BTN_ADICIONAR_COMENTARIOS_REPARTO_DOCUMENTOS),
                Click.on(BTN_ADICIONAR_COMENTARIOS_REPARTO_DOCUMENTOS),
                WaitSeconds.seconds(2),
                SwitchToWindow.at(2),
//                CambiarALaSiguientePestana.siguiente(),
                /*Open.url(UrlPages.urlAdicionarComentarios),
                WaitInteractions.untilAppears(SELECT_TIPO_REPARTO_DOCUMENTOS),*/
                SelectFromOptions.byVisibleText(selectTipo).from(SELECT_TIPO_REPARTO_DOCUMENTOS),
                Enter.theValue(idComentario).into(TXT_COMENTARIO_REPARTO_DOCUMENTOS),
                JavaScriptClick.on(BTN_GRABAR),
                WaitSeconds.seconds(2),
                CerrarPestana.cerrar(),
                //Click.on(BTN_GRABAR_REPARTO_DOCUMENTOS),
                WaitInterrupted5Segundos.esperaConstante5(),
               /* CambiarALaSiguientePestana.siguiente(),
                //WaitInteractions.untilAppears(BTN_REPARTO_ESCANEO),
                JavaScriptClick.on(BTN_REPARTO_ESCANEO),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_FINALIZAR_ESCANEO_ENRUTAR_REPARTO_DOCUMENTOS),*/
                Click.on(BTN_FINALIZAR_ESCANEO_ENRUTAR_REPARTO_DOCUMENTOS),
                Click.on(BTN_ACEPTAR),
               // Switch.toFrame(0),
                WaitInteractions.untilAppears(SELECT_USUARIO_REPARTO_DOCUMENTOS),
                SelectFromOptions.byVisibleText(selectUsuario).from(SELECT_USUARIO_REPARTO_DOCUMENTOS),
                Click.on(BTN_ASIGNAR_REPARTO_DOCUMENTOS),
                WaitSeconds.seconds(3)
        );
    }

    public static RepartoDocumentos enConfecamaraSII(String selectTipo, String idComentario, String selectUsuario){
        return instrumented(RepartoDocumentos.class, selectTipo, idComentario, selectUsuario);
    }
}