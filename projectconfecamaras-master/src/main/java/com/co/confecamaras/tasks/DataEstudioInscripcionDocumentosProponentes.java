package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.utils.RobotCambioPestana;
import com.co.confecamaras.utils.RobotCambioPestanaDos;
import com.co.confecamaras.utils.RobotCerrarPestana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_BANDEJAS;
import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static com.co.confecamaras.userinterfaces.InscripcionDocumentos.*;
import static com.co.confecamaras.models.VariableEstudioInscripcionDocumentosProponentes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DataEstudioInscripcionDocumentosProponentes implements Task {

    private final String consulta; private final String numProponente; private final String empresa;
    private final String numDoc; private final String fechaDoc; private final String origenDoc;
    private final String autorizo; private final String fechaCorte; private final String activoCorriente;
    private final String patrimonioNeto; private final String ingresosActividad; private final String grupoNif;
    private final String numDocDos; private final String fechaDocDos; private final String origenDocDos;
    private final String clasificaciones; private final String celebrado; private final String contratante;
    private final String fechaEjecucion; private final String valorPesos; private final String valor;
    private final String campoTexto; private final String numDocTres; private final String fechaDocTres;
    private final String origenDocTres; private final String ident; private final String email;

    public DataEstudioInscripcionDocumentosProponentes(String consulta, String numProponente, String empresa, String numDoc, String fechaDoc,
                                                       String origenDoc, String autorizo, String fechaCorte, String activoCorriente,
                                                       String patrimonioNeto, String ingresosActividad, String grupoNif, String numDocDos,
                                                       String fechaDocDos, String origenDocDos, String clasificaciones, String celebrado,
                                                       String contratante, String fechaEjecucion, String valorPesos, String valor,
                                                       String campoTexto, String numDocTres, String fechaDocTres, String origenDocTres,
                                                       String ident, String email) {
        this.consulta = consulta; this.numProponente = numProponente; this.empresa = empresa;
        this.numDoc = numDoc; this.fechaDoc = fechaDoc; this.origenDoc = origenDoc;
        this.autorizo = autorizo; this.fechaCorte = fechaCorte; this.activoCorriente = activoCorriente;
        this.patrimonioNeto = patrimonioNeto; this.ingresosActividad = ingresosActividad; this.grupoNif = grupoNif;
        this.numDocDos = numDocDos; this.fechaDocDos = fechaDocDos; this.origenDocDos = origenDocDos;
        this.clasificaciones = clasificaciones; this.celebrado = celebrado; this.contratante = contratante;
        this.fechaEjecucion = fechaEjecucion; this.valorPesos = valorPesos; this.valor = valor;
        this.campoTexto = campoTexto; this.numDocTres = numDocTres; this.fechaDocTres = fechaDocTres;
        this.origenDocTres = origenDocTres; this.ident = ident; this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                Click.on(BTN_MENU_LATERAL),
                WaitSeconds.seconds(3),
                Enter.theValue("Expedientes").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_DOS_OPT),
                SelectFromOptions.byVisibleText(consulta).from(CrudProponente.CONSULTA_POR_SLC),
                Enter.theValue(numProponente).into(CrudProponente.PROPONENTE_INPUT),
                Click.on(CrudProponente.CONTINUAR_BTN),
                Click.on(CrudProponente.ACCIONES_BTN),
                Click.on(CrudProponente.OPERACIONES_PROPONENTES_SLT),
                Click.on(CrudProponente.INSCRIPCION_PROPONENTE_BTN),
                Click.on(CrudProponente.CONTINUAR_IP_BTN),
                WaitSeconds.seconds(2),
                Click.on(CrudProponente.ACCIONES_DOS_BTN),
                WaitSeconds.seconds(5),
                WaitUntil.the(CrudProponente.FORMULARIO_BTN, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds(),
                JavaScriptClick.on(CrudProponente.FORMULARIO_BTN),
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                BloqueUnoInscripcionProponente.enConfecamarasSII(empresa, numDoc, fechaDoc, origenDoc),
                BloqueDosInscripcionProponente.enConfecamarasSII(autorizo),
                BloqueTresInscripcionProponente.enConfecamarasSII(fechaCorte, activoCorriente, patrimonioNeto, ingresosActividad,
                        grupoNif, numDocDos, fechaDocDos, origenDocDos),
                BloqueCuatroInscripcionProponente.enConfecamarasSII(clasificaciones),
                BloqueSeisInscripcionProponente.enConfecamaras(celebrado, contratante, fechaEjecucion, valorPesos,
                        valor, campoTexto, numDocTres, fechaDocTres, origenDocTres),
                JavaScriptClick.on(CrudProponente.RECIBIR_PAGO_BTN),
                WaitSeconds.seconds(2),
                Switch.toNewWindow(),
                WaitSeconds.seconds(2),
                Click.on(CrudProponente.CONTINUAR_TRES_BTN),
                Scroll.to(CrudProponente.TIPO_IDENTIFICACION_SLC),
                Clear.field(CrudProponente.IDENTIFICACION_INPUT),
                Enter.theValue(ident).into(CrudProponente.IDENTIFICACION_INPUT),
                Click.on(CrudProponente.VERIFICAR_IDENT_BTN),
                Scroll.to(CrudProponente.EMAIL_CONFIR_INPUT),
                Enter.theValue(email).into(CrudProponente.EMAIL_CONFIR_INPUT),
                Scroll.to(CrudProponente.DUPLICAR_DATOS_CLIENT_BTN),
                Click.on(CrudProponente.DUPLICAR_DATOS_CLIENT_BTN),
                Hit.the(Keys.SPACE).into(CrudProponente.FECHA_EXPEDICION_INPUT),
                Hit.the(Keys.ENTER).into(CrudProponente.FECHA_EXPEDICION_INPUT),
                WaitSeconds.seconds(2),
                Switch.toActiveElement(),
                WaitSeconds.seconds(2),
                Click.on(CrudProponente.GENERAR_RECIBO_BTN),
                Click.on(CrudProponente.CONTINUAR_MODAL_BTN),
                Ensure.that(LBL_CODIGO_BARRAS_ID).isEnabled()
        );
        String barcode = LBL_CODIGO_BARRAS_ID.resolveFor(actor).getText();
        System.out.println("¡ESTE ES EL CODIGO DE BARRAS!" + barcode);
        setBarcode(barcode);

        actor.attemptsTo(
                WaitSeconds.seconds(2),
                Switch.toTheOtherWindow(),
                WaitSeconds.seconds(2),
                RobotCambioPestana.toTab(),
                WaitSeconds.seconds(2),
                WaitInteractions.untilAppears(BTN_CERRAR_ID),
                Click.on(BTN_CERRAR_ID),
                WaitInteractions.untilAppears(BTN_CAMARA_COMERCIO_ID),
                Click.on(BTN_CAMARA_COMERCIO_ID)
        );
    }

    public static Performable DoInscripcionProponente(String consulta, String numProponente, String empresa, String numDoc, String fechaDoc,
                                                      String origenDoc, String autorizo, String fechaCorte, String activoCorriente,
                                                      String patrimonioNeto, String ingresosActividad, String grupoNif, String numDocDos,
                                                      String fechaDocDos, String origenDocDos, String clasificaciones, String celebrado,
                                                      String contratante, String fechaEjecucion, String valorPesos, String valor,
                                                      String campoTexto, String numDocTres, String fechaDocTres, String origenDocTres,
                                                      String ident, String email){
        return instrumented(DataEstudioInscripcionDocumentosProponentes.class, consulta, numProponente, empresa, numDoc, fechaDoc, origenDoc, autorizo, fechaCorte,
                activoCorriente, patrimonioNeto, ingresosActividad, grupoNif, numDocDos, fechaDocDos, origenDocDos, clasificaciones, celebrado,
                contratante, fechaEjecucion, valorPesos, valor, campoTexto, numDocTres, fechaDocTres, origenDocTres, ident, email);
    }
}