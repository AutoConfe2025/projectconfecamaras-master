package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitMilliseconds;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.MariculaPersonaNaturalEstablecimiento.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MatriculaSoloEstablecimientoComercio implements Task {

    private String idNombreCompleto;
    private String idTipoIdentificacion;
    private String idNumeroIdentificacion;
    private String idDomicilio;
    private String idTamanoEmpresa;
    private String idNombreEstablecimiento;
    private String idValorActivosDos;
    private String idDomicilioEstablecimiento;

    public MatriculaSoloEstablecimientoComercio(String idNombreCompleto, String idTipoIdentificacion, String idNumeroIdentificacion,
                                                String idDomicilio, String idTamanoEmpresa, String idNombreEstablecimiento,
                                                String idValorActivosDos, String idDomicilioEstablecimiento) {
        this.idNombreCompleto = idNombreCompleto;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.idNumeroIdentificacion = idNumeroIdentificacion;
        this.idDomicilio = idDomicilio;
        this.idTamanoEmpresa = idTamanoEmpresa;
        this.idNombreEstablecimiento = idNombreEstablecimiento;
        this.idValorActivosDos = idValorActivosDos;
        this.idDomicilioEstablecimiento = idDomicilioEstablecimiento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
              /* ModalLoader.modalLoader(),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                WaitInterrupted3Segundos.esperaConstante3(),
                Click.on(BTN_MENU_LATERAL),*/
                WaitInteractions.untilAppears(BTN_TRAMITES_REGISTROS_PUBLICOS),
                Scroll.to(BTN_TRAMITES_REGISTROS_PUBLICOS),
                JavaScriptClick.on(BTN_TRAMITES_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_MATRICULAS_PERSONA_NATURAL_ESTABLECIMIENTO),
                JavaScriptClick.on(BTN_MATRICULAS_PERSONA_NATURAL_ESTABLECIMIENTO),
                SwitchToNewWindow.switchToNewTab(),
                WaitMilliseconds.milliseconds(500),
                Click.on(BTN_CONTINUAR_MATRICULA),
                Click.on(BTN_MATRICULA_SOLO_ESTABLECIMIENTO_COMERCIO),
                FormularioSolicutudMatriculaEstablecimiento.enConfecamaraSII(TXT_NOMBRE_COMPLETO_RAZON_SOCIAL_MATRICULA, idNombreCompleto, SELECT_TIPO_IDENTIFICACION_MATRICULA, idTipoIdentificacion,
                        TXT_TIPO_IDENTIFICACION_MATRICULA, idNumeroIdentificacion, SELECT_DOMICILIO_MATRICULA, idDomicilio, SELECT_TAMANO_EMPRESA_MATRICULA, idTamanoEmpresa,
                        TXT_NOMBRE_ESTABLECIMIENTO_MATRICULA, idNombreEstablecimiento, TXT_VALORES_ACTIVOS_DOS_MATRICULA, idValorActivosDos, SELECT_DOMICILIO_ESTABLECIMIENTO_MATRICULA,
                        idDomicilioEstablecimiento),
                Click.on(BTN_LIQUIDAR_MATRICULA)
        );
    }

    public static MatriculaSoloEstablecimientoComercio enConfecamaraSII(String idNombreCompleto, String idTipoIdentificacion, String idNumeroIdentificacion,
                                                                        String idDomicilio, String idTamanoEmpresa, String idNombreEstablecimiento,
                                                                        String idValorActivosDos, String idDomicilioEstablecimiento){
        return instrumented(MatriculaSoloEstablecimientoComercio.class, idNombreCompleto, idTipoIdentificacion, idNumeroIdentificacion,
                idDomicilio, idTamanoEmpresa, idNombreEstablecimiento, idValorActivosDos, idDomicilioEstablecimiento);
    }
}
