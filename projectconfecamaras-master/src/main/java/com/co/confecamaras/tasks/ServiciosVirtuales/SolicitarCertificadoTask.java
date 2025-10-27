package com.co.confecamaras.tasks.ServiciosVirtuales;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.AccionesPage.AccionesPage;
import com.co.confecamaras.userinterfaces.ServiciosVirtuales.ServiciosVirtualesPage;
import com.co.confecamaras.userinterfaces.ServiciosVirtuales.SolicitudCertificadosPage;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SolicitarCertificadoTask implements Task {
    private final String numero_matricula;
    private final String cantidad;
    private static String codigo_recuperacion;

    public SolicitarCertificadoTask(String cantidad, String numero_matricula) {
        this.cantidad = cantidad;
        this.numero_matricula = numero_matricula;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String main_window = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.remember("main_window", main_window);
        actor.attemptsTo(
                WaitSeconds.seconds(2),
                Click.on(ServiciosVirtualesPage.OPT_SOLICITAR),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(SolicitudCertificadosPage.INP_MATRICULA),
                Enter.theValue(numero_matricula).into(SolicitudCertificadosPage.INP_MATRICULA),
                Click.on(SolicitudCertificadosPage.BTN_CONTINUAR),
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(SolicitudCertificadosPage.INP_BUSCAR),
                Enter.theValue(numero_matricula).into(SolicitudCertificadosPage.INP_BUSCAR),
                LogEvent.recordevent(Reportes.INFO, "Se ha consultado el número de matricula: " + numero_matricula),
                //SearchForInformation.buscar(SolicitudCertificadosPage.TABLE_INFORMACION.resolveAllFor(actor), numero_matricula),
                Click.on(AccionesPage.LINK_ACCION.of("Certificados automáticos (Inmediatos)")),
                ModalLoader.modalLoader(),
                Enter.theValue(cantidad).into(SolicitudCertificadosPage.INP_CANTIDAD_CERTIFICADOS),
                Click.on(SolicitudCertificadosPage.BTN_CONTINUAR_POPUP),
                ModalLoader.modalLoader(),
                ChangeToLastWindow.changeToLastWindow(),
                CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome(),
                WaitInteractions.untilAppears(SolicitudCertificadosPage.TEXT_CODIGO_RECUPERACION)
        );
        codigo_recuperacion = SolicitudCertificadosPage.TEXT_CODIGO_RECUPERACION.resolveFor(actor).getText();
        actor.attemptsTo(
                Click.on(SolicitudCertificadosPage.BTN_OK),
                Click.on(ServiciosVirtualesPage.BTN_HOME),
                ModalLoader.modalLoader(),
                PagarElectronicamenteTask.pagar(codigo_recuperacion)
        );
    }

    public static SolicitarCertificadoTask solicitar(String cantidad, String numero_matricula) {
        return new SolicitarCertificadoTask(cantidad, numero_matricula);
    }
}
