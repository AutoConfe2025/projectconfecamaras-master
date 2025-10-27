package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.userinterfaces.FirmadoManuscritoSobre;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.DataFirmadoManuscritoSobreUI.*;
import static com.co.confecamaras.userinterfaces.ExpedientesUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DataFirmadoManuscritoSobre implements Task {

    private final String idConsultaPor;
    private final String idMatricula;
    private final String idCheckbox;
    private final String idDireccion;
    private final String idTelefono;


    public DataFirmadoManuscritoSobre(String idConsultaPor, String idMatricula, String idCheckbox, String idDireccion,
                                      String idTelefono) {
        this.idConsultaPor = idConsultaPor;
        this.idMatricula = idMatricula;
        this.idCheckbox = idCheckbox;
        this.idDireccion = idDireccion;
        this.idTelefono = idTelefono;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_TRANSACCIONES),
                Click.on(BTN_CONSULTAS_TRANSACCIONES),
                WaitInteractions.untilAppears(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                Click.on(BTN_CONSULTAS_REGISTROS_PUBLICOS),
                WaitInteractions.untilAppears(BTN_EXPEDIENTES),
                Click.on(BTN_EXPEDIENTES),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_EXPEDIENTES),
                SelectFromOptions.byVisibleText(idConsultaPor).from(SELECT_CONSULTA_POR_EXPEDIENTES),
                WaitInteractions.untilAppears(SELECT_CONSULTA_POR_EXPEDIENTES),
                Enter.theValue(idMatricula).into(TXT_INGRESAR_INFORMACION_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_CONTINUAR_EXPEDIENTES),
                Click.on(BTN_CONTINUAR_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                Click.on(BTN_ACCIONES_DISPONIBLES_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                Click.on(BTN_OPERACIONES_MERCANTIL_EXPEDIENTES),
                WaitInteractions.untilAppears(BTN_ACTUALIZACION_DATOS_MUTACION_EXPEDIENTES),
                JavaScriptClick.on(BTN_ACTUALIZACION_DATOS_MUTACION_EXPEDIENTES),
                CheckboxDatosModificar.enConfecamaraSII(CHK_DATOS_MODIFICAR_EXPEDIENTES, idCheckbox),
                WaitInteractions.untilAppears(BTN_ACEPTAR_ALERTA_IMPORTANTE),
                Click.on(BTN_ACEPTAR_ALERTA_IMPORTANTE),
                FormularioRadicarActualizacionDatosMutacion.enConfecamaraSII(TXT_DIRECCION_EXPEDIENTES, idDireccion,
                        TXT_TELEFONO_EXPEDIENTES, idTelefono),
                WaitInteractions.untilAppears(BTN_CONTINUAR_TRES_EXPEDIENTES),
                Scroll.to(BTN_CONTINUAR_TRES_EXPEDIENTES).andAlignToBottom(),
                JavaScriptClick.on(BTN_CONTINUAR_TRES_EXPEDIENTES),
                WaitInteractions.untilDisappears(ESPERA_BARRA),
                WaitInteractions.untilBeEnable(LBL_RECUPERACION_DFMS)
        );

        String codigoRecuperacion = LBL_RECUPERACION_DFMS.resolveFor(actor).getText();
        System.out.println(codigoRecuperacion);

        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInterrupted3Segundos.esperaConstante3(),
                Enter.theValue("Actualizacion de datos (mutacion)").into(MenuSistema.BUSQUEDA_INPUT),
                JavaScriptClick.on(MenuSistema.SELECCIONAR_OPT),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.BTN_RETOMAR_TRAMITE_MANUSCRITO),
                JavaScriptClick.on(FirmadoManuscritoSobre.BTN_RETOMAR_TRAMITE_MANUSCRITO),
                WaitInteractions.untilAppears(FirmadoManuscritoSobre.TXT_NUMERO_RECUPERACION_MANUSCRITO),
                Enter.theValue(codigoRecuperacion).into(FirmadoManuscritoSobre.TXT_NUMERO_RECUPERACION_MANUSCRITO)
        );
    }

    public static DataFirmadoManuscritoSobre enConfecamaraSII(String idConsultaPor, String idMatricula, String idCheckbox, String idDireccion,
                                                              String idTelefono) {
        return instrumented(DataFirmadoManuscritoSobre.class, idConsultaPor, idMatricula, idCheckbox,
                idDireccion, idTelefono);
    }
}