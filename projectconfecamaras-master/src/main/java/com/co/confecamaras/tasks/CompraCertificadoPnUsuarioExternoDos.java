package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.*;
import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.BTN_PAGAR;
import static com.co.confecamaras.userinterfaces.RenovacionPnEstablecimientoUsuarioExternoUI.*;

public class CompraCertificadoPnUsuarioExternoDos implements Task {

    private final String idCelular;
    private final String idPais;
    private final String idCiudad;
    private final String idNumeroTarjeta;
    private final String idCodigoSeguridad;

    public CompraCertificadoPnUsuarioExternoDos(String idCelular, String idPais, String idCiudad,
                                                String idNumeroTarjeta, String idCodigoSeguridad) {
        this.idCelular = idCelular;
        this.idPais = idPais;
        this.idCiudad = idCiudad;
        this.idNumeroTarjeta = idNumeroTarjeta;
        this.idCodigoSeguridad = idCodigoSeguridad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitSeconds.seconds(13),
                WaitInteractions.untilAppears(BTN_OK_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_OK_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_DESCARGAR_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_DESCARGAR_USUARIO_EXTERNO),
                RobotCambioPestanaDos.toTab(),
                WaitInteractions.untilAppears(BTN_CONTINUAR_CUATRO_USUARIO_EXTERNO),
                Click.on(BTN_CONTINUAR_CUATRO_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_SOPORTES_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_SOPORTES_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_VER_SOBRE_DIGITAL_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_VER_SOBRE_DIGITAL_USUARIO_EXTERNO)
        );
    }

    public static CompraCertificadoPnUsuarioExternoDos enConfecamarasSii(String idCelular, String idPais, String idCiudad,
                                                                         String idNumeroTarjeta, String idCodigoSeguridad){
        return Tasks.instrumented(CompraCertificadoPnUsuarioExternoDos.class, idCelular, idPais, idCiudad, idNumeroTarjeta,
                idCodigoSeguridad);
    }
}