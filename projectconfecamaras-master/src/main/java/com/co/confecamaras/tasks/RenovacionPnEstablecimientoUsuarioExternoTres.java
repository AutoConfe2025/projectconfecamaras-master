package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.ModalLoader;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.*;
import static com.co.confecamaras.userinterfaces.Certificados.Demas.PagoUsuarioPublicoNoPresencial.BTN_FINALIZAR;
import static com.co.confecamaras.userinterfaces.RenovacionPnEstablecimientoUsuarioExternoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RenovacionPnEstablecimientoUsuarioExternoTres implements Task {

    private final String selectCodigoRegimen;
    private final String selectResponsabilidadFiscal;
    private final String idCelular;
    private final String idPais;
    private final String idCiudad;
    private final String idNumeroTarjeta;
    private final String idCodigoSeguridad;

    public RenovacionPnEstablecimientoUsuarioExternoTres(String selectCodigoRegimen, String selectResponsabilidadFiscal,
                                                         String idCelular, String idPais, String idCiudad,
                                                         String idNumeroTarjeta, String idCodigoSeguridad) {
        this.selectCodigoRegimen = selectCodigoRegimen;
        this.selectResponsabilidadFiscal = selectResponsabilidadFiscal;
        this.idCelular = idCelular;
        this.idPais = idPais;
        this.idCiudad = idCiudad;
        this.idNumeroTarjeta = idNumeroTarjeta;
        this.idCodigoSeguridad = idCodigoSeguridad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_CERRAR_DOS_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_CERRAR_DOS_USUARIO_EXTERNO)
        );
        for (int i = 0; i <= 50; i++){
            if(actor.asksFor(ElementoElegible.para(BTN_ACEPTAR_TRAMITE_NO_FINALIZADO))){
                actor.attemptsTo(
                        WaitInteractions.untilBeEnable(BTN_ACEPTAR_TRAMITE_NO_FINALIZADO),
                        Click.on(BTN_ACEPTAR_TRAMITE_NO_FINALIZADO),
                        WaitInteractions.untilAppears(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO),
                        Scroll.to(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO).andAlignToBottom(),
                        Click.on(BTN_PAGO_ELECTRONICO_USUARIO_EXTERNO),
                        WaitSeconds.seconds(2),
                        WaitInteractions.untilAppears(BTN_CERRAR_DOS_USUARIO_EXTERNO),
                        JavaScriptClick.on(BTN_CERRAR_DOS_USUARIO_EXTERNO)
                );
                int indexFila = i++;
                actor.attemptsTo(WaitSeconds.seconds(5));
                System.out.println("Espera implicita de 5 segundos " + indexFila + " repeticiones");
            } else {
                int indexFila = i = 50;
            }
        }

        actor.attemptsTo(
//                WaitSeconds.seconds(5),
//                Switch.toTheOtherWindow(),
                WaitInteractions.untilAppears(BTN_SOPORTES_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_SOPORTES_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_VER_SOBRE_DIGITAL_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_VER_SOBRE_DIGITAL_USUARIO_EXTERNO),
                WaitSeconds.seconds(5),
                WaitInteractions.untilAppears(BTN_CERRAR_DOS_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_CERRAR_DOS_USUARIO_EXTERNO),
                WaitInteractions.untilAppears(BTN_VER_RECIBO_CAJA_USUARIO_EXTERNO),
                JavaScriptClick.on(BTN_VER_RECIBO_CAJA_USUARIO_EXTERNO),
                WaitSeconds.seconds(3)
                //WaitInteractions.untilAppears(BTN_CERRAR_DOS_USUARIO_EXTERNO),
                //JavaScriptClick.on(BTN_CERRAR_DOS_USUARIO_EXTERNO)
                /***Se quita ya que dependiendo de la matricula cambia la ubicacion del radicado***/
                //WaitInteractions.untilAppears(BTN_VER_RADICADO_USUARIO_EXTERNO),
                //JavaScriptClick.on(BTN_VER_RADICADO_USUARIO_EXTERNO),
                //WaitInteractions.untilAppears(BTN_CERRAR_DOS_USUARIO_EXTERNO)
        );
    }

    public static RenovacionPnEstablecimientoUsuarioExternoTres enConfecamaraSII(String selectCodigoRegimen, String selectResponsabilidadFiscal,
                                                                                 String idCelular, String idPais, String idCiudad,
                                                                                 String idNumeroTarjeta, String idCodigoSeguridad){
        return instrumented(RenovacionPnEstablecimientoUsuarioExternoTres.class, selectCodigoRegimen, selectResponsabilidadFiscal,
                idCelular, idPais, idCiudad, idNumeroTarjeta, idCodigoSeguridad);
    }
}