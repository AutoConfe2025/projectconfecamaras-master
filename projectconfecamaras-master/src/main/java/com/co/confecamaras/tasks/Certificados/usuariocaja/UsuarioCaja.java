package com.co.confecamaras.tasks.Certificados.usuariocaja;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.cambiarpestana.CambiarALaSiguientePestana;
import com.co.confecamaras.interactions.cerrarpestana.CerrarPestana;
import com.co.confecamaras.interactions.leerpdf.LeerContenidoDelPDF;
import com.co.confecamaras.interactions.waitinteractions.WaitText;
import com.co.confecamaras.utils.RobotCambiarPestanaSinCerrar;
import com.co.confecamaras.utils.RobotCambiarPestanaTres;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotRecargarPestana;
import com.co.confecamaras.utils.usuarioCaja.UsuarioCajaConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;

import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;

import static com.co.confecamaras.userinterfaces.Certificados.usuariocaja.UsuarioCajaPage.*;

public class UsuarioCaja implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilBeEnable(CHECK_BOX_CONSULTA),
                Click.on(CHECK_BOX_CONSULTA),
                WaitInteractions.untilBeEnable(TXT_INFORMACION),
                Enter.theValue(UsuarioCajaConstants.MATRICULA).into(TXT_INFORMACION),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR),
                Click.on(BTN_CONTINUAR),
                WaitInteractions.untilBeEnable(BTN_ACCIONES),
                Click.on(BTN_ACCIONES),
                WaitInteractions.untilBeEnable(DIV_TRAMITE_MERCANTIL),
                Click.on(DIV_TRAMITE_MERCANTIL),
                WaitInteractions.untilBeEnable(BTN_SOLICITAR_CERTIFICADOS),
                Click.on(BTN_SOLICITAR_CERTIFICADOS),
                WaitInteractions.untilBeEnable(BTN_SOLICITUD_CERTIFICADO_AUTOMATICO),
                Click.on(BTN_SOLICITUD_CERTIFICADO_AUTOMATICO),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADOS_DE_MATRICULA),
                Scroll.to(TXT_CERTIFICADOS_DE_MATRICULA),
                Click.on(TXT_CERTIFICADOS_DE_MATRICULA).then(Clear.field(TXT_CERTIFICADOS_DE_MATRICULA)),
                Enter.theValue("1").into(TXT_CERTIFICADOS_DE_MATRICULA)
        );

        actor.attemptsTo(
                WaitInteractions.untilBeEnable(SELECT_TIPO_DE_SOLICITUD),
                Scroll.to(SELECT_TIPO_DE_SOLICITUD),
                Click.on(SELECT_TIPO_DE_SOLICITUD),
                WaitInteractions.untilBeEnable(BTN_GENERAR_LIQUIDACION),
                Click.on(BTN_GENERAR_LIQUIDACION),
                Switch.toNewWindow(),
                ModalLoader.modalLoader(),
                CerrarPestana.cerrar(),
                Switch.toNewWindow(),
                WaitText.textAppears(TEXTO_SISTEMA_INTEGRAL),
                WaitInteractions.untilBeEnable(BTN_FACTURAR_A_CLIENTE_FINAL),
                Scroll.to(BTN_FACTURAR_A_CLIENTE_FINAL).then(Click.on(BTN_FACTURAR_A_CLIENTE_FINAL)),
                WaitInteractions.untilBeEnable(BTN_CONTINUAR_FACTURACION),
                Click.on(BTN_CONTINUAR_FACTURACION),
                WaitInteractions.untilBeEnable(BTN_GENERAR_RECIBO),
                Scroll.to(BTN_GENERAR_RECIBO).then(Click.on(BTN_GENERAR_RECIBO))
        );

        actor.attemptsTo(
                WaitInteractions.untilAppears(VALOR_TOTAL),
                Ensure.that(VALOR_TOTAL).text().isEqualTo(UsuarioCajaConstants.VALOR_ESPERADO),
                Ensure.that(VALOR_PAGADO).text().isEqualTo(UsuarioCajaConstants.VALOR_ESPERADO),
                Ensure.that(VALOR_VUELTAS).text().isEqualTo(UsuarioCajaConstants.VALOR_ESPERADO),
                Click.on(BTN_CONFIRMAR_LIQUIDACION),
                WaitText.textAppears(TITULO_PAGINA_FACTURACION),
                Scroll.to(LINK_DESCARGA_RECIBO),
                Click.on(LINK_DESCARGA_RECIBO),
                WaitSeconds.seconds(2)
        );

        //Lectura de PDF
        String pdfURL = LINK_DESCARGA_RECIBO.resolveFor(actor).getAttribute("href");
        if (!pdfURL.endsWith(".pdf")) {
            System.out.println("La URL recibida no es un archivo PDF: " + pdfURL);
            throw new RuntimeException("La URL no apunta a un archivo PDF: " + pdfURL);
        }
        actor.attemptsTo(LeerContenidoDelPDF.desde(pdfURL));
    }
    public static UsuarioCaja comprarCertificado (){
        return Tasks.instrumented(UsuarioCaja.class);
    }
}
