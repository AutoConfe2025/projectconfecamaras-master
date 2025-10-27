package com.co.confecamaras.tasks.ServiciosVirtuales;

import com.co.confecamaras.interactions.News.*;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.ServiciosVirtuales.PagarElectronicamentePage;
import com.co.confecamaras.userinterfaces.ServiciosVirtuales.ServiciosVirtualesPage;
import com.co.confecamaras.utils.News.Acciones.TypeKey;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import com.co.confecamaras.utils.constantes.serviciosvirtuales.ServiciosVirtualesConstantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.ServiciosVirtuales.PagarElectronicamentePage.BTN_FINALIZAR_TX;

public class PagarElectronicamenteTask implements Task {
    private final String codigo_recuperacion;

    public PagarElectronicamenteTask(String codigo_recuperacion) {
        this.codigo_recuperacion = codigo_recuperacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitSeconds.seconds(2),
                Scroll.to(ServiciosVirtualesPage.OPT_PAGAR),
                Click.on(ServiciosVirtualesPage.OPT_PAGAR),
                ChangeToLastWindow.changeToLastWindow(),

                Enter.theValue(codigo_recuperacion).into(PagarElectronicamentePage.INP_NUMERO_RECUPERACION),
                Click.on(PagarElectronicamentePage.BTN_CONTINUAR),
                WaitInteractions.untilAppears(PagarElectronicamentePage.TXT_CODIGO_RECUPERACION),
                GetTextOfElement.de(PagarElectronicamentePage.TXT_CODIGO_RECUPERACION),
                GetTextOfElement.de(PagarElectronicamentePage.TXT_VALOR),
                Enter.theValue(ServiciosVirtualesConstantes.NUMERO_DOCUMENTO).into(PagarElectronicamentePage.INP_NUMERO_IDENTIFICACION),
                LogEvent.recordevent(Reportes.INFO,"Número de documento de quien factura: " + ServiciosVirtualesConstantes.NUMERO_DOCUMENTO),
                PressKey.press(TypeKey.TAB),
                Scroll.to(PagarElectronicamentePage.BTN_PAGAR),
                Click.on(PagarElectronicamentePage.BTN_PAGAR),

                WaitInteractions.untilAppears(PagarElectronicamentePage.DPW_TIPO_DOCUMENTO),
                Scroll.to(PagarElectronicamentePage.DPW_TIPO_DOCUMENTO),
                Click.on(PagarElectronicamentePage.DPW_TIPO_DOCUMENTO),
                Click.on(PagarElectronicamentePage.OPT_TIPO_DOCUMENTO),
                Scroll.to(PagarElectronicamentePage.INP_NUMERO_CELULAR),
                Enter.theValue(ServiciosVirtualesConstantes.NUMERO_CELULAR).into(PagarElectronicamentePage.INP_NUMERO_CELULAR),

                Scroll.to(PagarElectronicamentePage.DPW_PAIS),
                Click.on(PagarElectronicamentePage.DPW_PAIS),
                Enter.theValue(ServiciosVirtualesConstantes.PAIS).into(PagarElectronicamentePage.INP_BUSQUEDA_DPW),
                Click.on(PagarElectronicamentePage.OPT_DPW.of(ServiciosVirtualesConstantes.PAIS.toUpperCase())),

                WaitInteractions.untilAppears(PagarElectronicamentePage.DPW_CIUDAD),
                Scroll.to(PagarElectronicamentePage.DPW_CIUDAD),
                Click.on(PagarElectronicamentePage.DPW_CIUDAD),
                Enter.theValue(ServiciosVirtualesConstantes.CIUDAD).into(PagarElectronicamentePage.INP_BUSQUEDA_DPW),
                Click.on(PagarElectronicamentePage.OPT_DPW.of(ServiciosVirtualesConstantes.CIUDAD)),

                Scroll.to(PagarElectronicamentePage.CHK_TRATAMIENTO_DATOS),
                JavaScriptClick.on(PagarElectronicamentePage.CHK_TRATAMIENTO_DATOS),
                LogEvent.recordevent(Reportes.PASSED,"Se han ingresado los datos de pago.")
        );

        switch (ServiciosVirtualesConstantes.MEDIO_PAGO.toLowerCase()) {
            case "pse":
                actor.attemptsTo(Click.on(PagarElectronicamentePage.BTN_PSE));
                break;
            case "visa":
                actor.attemptsTo(Click.on(PagarElectronicamentePage.BTN_VISA));
                break;
            case "mastercard":
                actor.attemptsTo(Click.on(PagarElectronicamentePage.BTN_MASTERCARD));
                break;
            case "american express":
                actor.attemptsTo(Click.on(PagarElectronicamentePage.BTN_AMERICAN_EXPRESS));
                break;
        }

        actor.attemptsTo(
                LogEvent.recordevent(Reportes.INFO, "Información de pago: [" + ServiciosVirtualesConstantes.NUMERO_TARJETA + "] - [" + ServiciosVirtualesConstantes.CODIGO_SEGURIDAD + "] - [" + ServiciosVirtualesConstantes.FECHA_EXPIRACION + "]"),
                WaitInteractions.untilAppears(PagarElectronicamentePage.CARD_MEDIO_PAGO),
                Switch.toFrame(0),
                Enter.theValue(ServiciosVirtualesConstantes.NUMERO_TARJETA).into(PagarElectronicamentePage.INP_NUMERO_TARJETA),
                Switch.toDefaultContext(),
                Switch.toFrame(1),
                Enter.theValue(ServiciosVirtualesConstantes.CODIGO_SEGURIDAD).into(PagarElectronicamentePage.INP_CODIGO_SEGURIDAD),
                Switch.toDefaultContext(),
                Switch.toFrame(2),
                Enter.theValue(ServiciosVirtualesConstantes.FECHA_EXPIRACION).into(PagarElectronicamentePage.INP_FECHA_EXPIRACION),
                Switch.toDefaultContext(),
                Click.on(PagarElectronicamentePage.DPW_CUOTAS),
                Click.on(PagarElectronicamentePage.OPT_DPW.of(ServiciosVirtualesConstantes.CUOTAS)),
                Click.on(PagarElectronicamentePage.BTN_PAGAR_TX),
                WaitInteractions.untilAppears(PagarElectronicamentePage.POPUP),
                GetTextOfElement.de(PagarElectronicamentePage.POPUP)
        );

        String msg_popup = GetTextOfElement.getText();
        if (msg_popup.equals("Transacción Aprobada")) {
            Reportes.reportEvent(Reportes.PASSED, msg_popup.toUpperCase());
        } else {
            Reportes.reportEvent(Reportes.FAILED, msg_popup.toUpperCase());
        }
        actor.attemptsTo(
                WaitSeconds.seconds(3),
                WaitInteractions.untilBeEnable(BTN_FINALIZAR_TX),
                Scroll.to(BTN_FINALIZAR_TX),
                Click.on(BTN_FINALIZAR_TX),
                CloseCurrentWindowAndSwitchBackHome.closeAndSwitchBackHome()
        );
    }

    public static PagarElectronicamenteTask pagar(String codigo_recuperacion) {
        return new PagarElectronicamenteTask(codigo_recuperacion);
    }


}
