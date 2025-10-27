package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.pagos.PagoUsuarioPublicoNoPresencial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.CompraCertificadoPnUsuarioExternoUI.*;

public class CompraCertificadoPnUsuarioExterno implements Task {

    private final String idCertificados;
    private final String idCertificadosMatricula;
    private final String idIdentificacionCliente;
    private final String idConfirmacionCorreo;

    public CompraCertificadoPnUsuarioExterno(String idCertificados, String idCertificadosMatricula,
                                             String idIdentificacionCliente, String idConfirmacionCorreo) {
        this.idCertificados = idCertificados;
        this.idCertificadosMatricula = idCertificadosMatricula;
        this.idIdentificacionCliente = idIdentificacionCliente;
        this.idConfirmacionCorreo = idConfirmacionCorreo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_CERTIFICADOS_CCPNUS),
                Click.on(BTN_CERTIFICADOS_CCPNUS),
                ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(TXT_MATRICULA_CCPNUS),
                Enter.theValue(idCertificados).into(TXT_MATRICULA_CCPNUS),
                WaitInteractions.untilAppears(BTN_CONTINUAR_CCPNUS),
                Click.on(BTN_CONTINUAR_CCPNUS),
                WaitInteractions.untilBeEnable(BTN_CERTIFICADOS_AUTOMATICOS_CCPNUS),
                Click.on(BTN_CERTIFICADOS_AUTOMATICOS_CCPNUS),
                WaitInteractions.untilBeEnable(TXT_CERTIFICADOS_MATRICULA_CCPNUS),
                Enter.theValue(idCertificadosMatricula).into(TXT_CERTIFICADOS_MATRICULA_CCPNUS),
                WaitInteractions.untilAppears(BTN_CONTINUAR_DOS_CCPNUS),
                Click.on(BTN_CONTINUAR_DOS_CCPNUS),
                WaitConstant.esperaConstante(),
                PagoUsuarioPublicoNoPresencial.enConfecamaras()
        );
    }

    public static CompraCertificadoPnUsuarioExterno enConfecamarasSii(String idCertificados, String idCertificadosMatricula,
                                                                      String idIdentificacionCliente, String idConfirmacionCorreo){
        return Tasks.instrumented(CompraCertificadoPnUsuarioExterno.class, idCertificados, idCertificadosMatricula,
                idIdentificacionCliente, idConfirmacionCorreo);
    }
}