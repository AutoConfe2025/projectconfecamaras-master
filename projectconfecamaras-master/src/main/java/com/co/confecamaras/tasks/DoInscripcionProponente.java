package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.*;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import com.co.confecamaras.userinterfaces.CrudProponente;
import com.co.confecamaras.userinterfaces.MenuSistema;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DoInscripcionProponente implements Task {

    private final String consulta; private final String numProponente; private final String empresa;
    private final String numDoc; private final String fechaDoc; private final String origenDoc;
    private final String autorizo; private final String fechaCorte; private final String activoCorriente;
    private final String patrimonioNeto; private final String ingresosActividad; private final String grupoNif;
    private final String numDocDos; private final String fechaDocDos; private final String origenDocDos;
    private final String clasificaciones; private final String celebrado; private final String contratante;
    private final String fechaEjecucion; private final String valorPesos; private final String valor;
    private final String campoTexto; private final String numDocTres; private final String fechaDocTres;
    private final String origenDocTres; private final String ident; private final String email;

    public DoInscripcionProponente(String consulta, String numProponente, String empresa, String numDoc, String fechaDoc,
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


    public static Performable DoInscripcionProponente(String consulta, String numProponente, String empresa, String numDoc, String fechaDoc,
                                                      String origenDoc, String autorizo, String fechaCorte, String activoCorriente,
                                                      String patrimonioNeto, String ingresosActividad, String grupoNif, String numDocDos,
                                                      String fechaDocDos, String origenDocDos, String clasificaciones, String celebrado,
                                                      String contratante, String fechaEjecucion, String valorPesos, String valor,
                                                      String campoTexto, String numDocTres, String fechaDocTres, String origenDocTres,
                                                      String ident, String email){
        return instrumented(DoInscripcionProponente.class, consulta, numProponente, empresa, numDoc, fechaDoc, origenDoc, autorizo, fechaCorte,
                activoCorriente, patrimonioNeto, ingresosActividad, grupoNif, numDocDos, fechaDocDos, origenDocDos, clasificaciones, celebrado,
                contratante, fechaEjecucion, valorPesos, valor, campoTexto, numDocTres, fechaDocTres, origenDocTres, ident, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Expedientes").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_DOS_OPT),
                SelectFromOptions.byVisibleText(consulta).from(CrudProponente.CONSULTA_POR_SLC),
                Enter.theValue(numProponente).into(CrudProponente.PROPONENTE_INPUT),
                Click.on(CrudProponente.CONTINUAR_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.ACCIONES_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.OPERACIONES_PROPONENTES_SLT),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.INSCRIPCION_PROPONENTE_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.CONTINUAR_IP_BTN),
                Scroll.to(CrudProponente.ACCIONES_DOS_BTN),
                WaitInterrupted2Segundos.esperaConstante2(),
                Click.on(CrudProponente.ACCIONES_DOS_BTN),
                WaitConstant.esperaConstante(),
                WaitUntil.the(CrudProponente.FORMULARIO_BTN, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds(),
                Scroll.to(CrudProponente.FORMULARIO_BTN),
                JavaScriptClick.on(CrudProponente.FORMULARIO_BTN),
                WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                //--------------- Inicio Bloques -----------------------
                BloqueUnoInscripcionProponente.enConfecamarasSII(empresa, numDoc, fechaDoc, origenDoc),
                BloqueDosInscripcionProponente.enConfecamarasSII(autorizo),
                BloqueTresInscripcionProponente.enConfecamarasSII(fechaCorte, activoCorriente, patrimonioNeto, ingresosActividad,
                        grupoNif, numDocDos, fechaDocDos, origenDocDos),
                BloqueCuatroInscripcionProponente.enConfecamarasSII(clasificaciones),
                BloqueSeisInscripcionProponente.enConfecamaras(celebrado, contratante, fechaEjecucion, valorPesos,
                        valor, campoTexto, numDocTres, fechaDocTres, origenDocTres),
                WaitInterrupted3Segundos.esperaConstante3(),
                JavaScriptClick.on(CrudProponente.RECIBIR_PAGO_BTN),
                Switch.toNewWindow(),
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
                Switch.toActiveElement()
        );
        actor.attemptsTo(
                Click.on(CrudProponente.GENERAR_RECIBO_BTN),
                Click.on(CrudProponente.CONTINUAR_MODAL_BTN),
                Click.on(CrudProponente.DESCARGAR_DOS_BTN),
                Switch.toTheOtherWindow(),
                WaitInterrupted2Segundos.esperaConstante2(),
                WaitUntil.the(CrudProponente.BTN_CERRAR_BTN, WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds(),
                WaitInterrupted2Segundos.esperaConstante2(),
                JavaScriptClick.on(CrudProponente.BTN_CERRAR_BTN),
                JavaScriptClick.on(CrudProponente.SERVICIOS_FINAL_BTN),
                JavaScriptClick.on(CrudProponente.SOPORTES_FINAL_BTN)

                //WaitInteractions.untilDisappears(CrudProponente.ESPERA_FORM),
                //Click.on(CrudProponente.VALIDAR_FORMULARIO_BTN),
                //JavaScriptClick.on(CrudProponente.IMPRIMIR_FORMULARIO_BTN),
                //JavaScriptClick.on(CrudProponente.MODAL_CERRAR_BTN)*/
        );
    }
}