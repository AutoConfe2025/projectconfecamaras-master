package com.co.confecamaras.tasks.ConsultasTransacciones;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.leerpdf.LeerContenidoDelPDF;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Attribute;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.BTN_PRIMERA_OPCION;
import static com.co.confecamaras.userinterfaces.Bandejas.BandejaRLeyPONALPage.TXT_BUSCAR_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_CONSULTAS_TRANSACCIONES;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.LINK_DESCARGA_RECIBO;
import static com.co.confecamaras.userinterfaces.consultasytransacciones.PrepagarServiciosPage.*;
import static com.co.confecamaras.utils.consultasytransacciones.PrepagarServiciosConstants.*;
import net.serenitybdd.screenplay.questions.Text;


public class Prepagar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_BUSCAR_MENU_LATERAL),
                Enter.theValue("Prepagar Servicios").into(TXT_BUSCAR_MENU_LATERAL),
                WaitSeconds.seconds(2),
                JavaScriptClick.on(BTN_PRIMERA_OPCION_UNO),
                ModalLoader.modalLoader()
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_CC),
                //Enter.theValue("93287279").into(INPUT_CC),
                Enter.theValue(CC).into(INPUT_CC),
                WaitInteractions.untilBeEnable(BTN_VERIFICAR),
                Click.on(BTN_VERIFICAR),
                ModalLoader.modalLoader()
        );
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(INPUT_VALOR_RECARGAR).then(Scroll.to(INPUT_VALOR_RECARGAR)),
                Enter.theValue(VALOR_RECARGA).into(INPUT_VALOR_RECARGAR),
                WaitInteractions.untilBeEnable(BTN_PAGAR),
                Click.on(BTN_PAGAR),
                ModalLoader.modalLoader()
        );

        if(actor.asksFor(ElementoElegible.para(BTN_ACEPTAR))){
            actor.attemptsTo(
                    Click.on(BTN_ACEPTAR),
                    WaitInteractions.untilBeEnable(MEN_DES_TIPO_ID),
                    SelectFromOptions.byVisibleText("CÉDULA DE CIUDADANIA").from(MEN_DES_TIPO_ID),
                    Enter.theValue("CIFUENTES").into(TXT_PRIMER_APELLIDO),
                    Enter.theValue("OLGA ").into(TXT_PRIMER_NOMBRE),
                    Enter.theValue("qa@confecamaras.org.co").into(TXT_EMAIL_UNO),
                    Enter.theValue("CARRERA 23  25-61 OFICINA 808").into(TXT_DIERCCION),
                    SelectFromOptions.byVisibleText("ABEJORRAL (ANT)").from(MEN_DES_MUNICIPIO),
                    Enter.theValue("3203657365").into(TXT_CELULAR),
                    Enter.theValue(VALOR_RECARGA).into(INPUT_VALOR_RECARGAR),
                    WaitInteractions.untilBeEnable(BTN_PAGAR),
                    Click.on(BTN_PAGAR),
                    ModalLoader.modalLoader()
            );
        }

        actor.attemptsTo(
                CambiarALaSiguientePestana.siguiente(),
                WaitInteractions.untilBeEnable(SELECT_TIPO_DOCUMENTO),
                SelectFromOptions.byValue("1").from(SELECT_TIPO_DOCUMENTO),
                WaitInteractions.untilBeEnable(BTN_VERIFICAR_IDENTIDAD),
                Click.on(BTN_VERIFICAR_IDENTIDAD),
                WaitInteractions.untilBeEnable(INPUT_TEL).then(Scroll.to(INPUT_TEL)),
                Enter.theValue(TEL).into(INPUT_TEL),
                WaitInteractions.untilBeEnable(INPUT_CELULAR),
                Enter.theValue(TEL).into(INPUT_CELULAR),
                WaitInteractions.untilBeEnable(INPUT_CORREO),
                Enter.theValue(EMAIL).into(INPUT_CORREO),
                WaitInteractions.untilBeEnable(BTN_GENERAR_RECIBO).then(Scroll.to(BTN_GENERAR_RECIBO)),
                Click.on(BTN_GENERAR_RECIBO),
                WaitInteractions.untilBeEnable(BTN_GENERAR_RECIBO_ACEPTAR),
                JavaScriptClick.on(BTN_GENERAR_RECIBO_ACEPTAR)
        );

        //Lectura de PDF
        String pdfURL = BTN_PDF.resolveFor(actor).getAttribute("href");
        actor.attemptsTo(LeerContenidoDelPDF.desde(pdfURL));
    }

    public static Prepagar servicios() {
        return Tasks.instrumented(Prepagar.class);
    }
}
