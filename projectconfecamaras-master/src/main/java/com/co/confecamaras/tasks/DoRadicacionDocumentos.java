package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.News.WaitSeconds;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.waitinteractions.ModalLoader;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.userinterfaces.RecibirPago;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;
import com.co.confecamaras.userinterfaces.MenuSistema;
import com.co.confecamaras.userinterfaces.RadicacionDocumentos;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRadicacionDocumentos implements Task {

    private final String razonSocial; private final String organizacionJuridica; private final String domicilio;
    private final String tipo; private final String numero; private final String juntaSocios; private final String municipio;
    private final String activosVinculados; private final String personal; private final String ingresos;
    private final String codigoBuscar; private final String beneficiario; private final String capitalSuscrito;
    private final String numeroIdentficacion; private final String apellido; private final String apellidoDos;
    private final String nombre; private final String nombreDos; private final String email; private final String numeroC;

    private final String bic; private final String nomenclatura; private final String numDireccion;
    private final String numDireccionDos; private final String municipioSl; private final String barrio;
    private final String telefono; private final String telefonoDos; private final String zona; private final String emailCorp;

    private final String ubicacion; private final String sede; private final String autorizacion;
    private final String activosCorrientes; private final String patrimonio; private final String ingresosOperacionales;
    private final String grupoNif; private final String capitalNacional; private final String capitalNacionalPriv;
    private final String codigoBuscarDos;

    private final String ciuGenera; private final String aportante;
    private final String tipoIdentificacionP; private final String identifacionP; private final String correoP;
    private final String emprendimiento;




    public DoRadicacionDocumentos(String razonSocial, String organizacionJuridica, String domicilio, String tipo, String numero, String juntaSocios,
                                  String municipio, String activosVinculados, String personal, String ingresos, String codigoBuscar,
                                  String beneficiario, String capitalSuscrito, String numeroIdentficacion, String apellido,
                                  String apellidoDos, String nombre, String nombreDos, String email, String numeroC, String bic, String nomenclatura,
                                  String numDireccion, String numDireccionDos, String municipioSl, String barrio, String telefono,
                                  String telefonoDos, String zona, String emailCorp, String ubicacion, String sede, String autorizacion,
                                  String activosCorrientes, String patrimonio, String ingresosOperacionales, String grupoNif, String capitalNacional,
                                  String capitalNacionalPriv, String codigoBuscarDos, String ciuGenera, String aportante, String tipoIdentificacionP, String identifacionP,
                                  String correoP, String emprendimiento) {
        this.razonSocial = razonSocial; this.organizacionJuridica = organizacionJuridica; this.domicilio = domicilio;
        this.tipo = tipo; this.numero = numero; this.juntaSocios = juntaSocios; this.municipio = municipio;
        this.activosVinculados = activosVinculados; this.personal = personal; this.ingresos = ingresos;
        this.codigoBuscar = codigoBuscar; this.beneficiario = beneficiario; this.capitalSuscrito = capitalSuscrito;
        this.numeroIdentficacion = numeroIdentficacion; this.apellido = apellido; this.apellidoDos = apellidoDos;
        this.nombre = nombre; this.nombreDos = nombreDos; this.email = email; this.numeroC = numeroC;
        this.bic = bic; this.nomenclatura = nomenclatura; this.numDireccion = numDireccion; this.numDireccionDos = numDireccionDos;
        this.municipioSl = municipioSl; this.barrio = barrio; this.telefono = telefono; this.telefonoDos = telefonoDos;
        this.zona = zona; this.emailCorp = emailCorp; this.ubicacion = ubicacion; this.sede = sede;
        this.autorizacion = autorizacion; this.activosCorrientes = activosCorrientes; this.patrimonio = patrimonio;
        this.ingresosOperacionales = ingresosOperacionales; this.grupoNif = grupoNif; this.capitalNacional = capitalNacional;
        this.capitalNacionalPriv = capitalNacionalPriv; this.codigoBuscarDos = codigoBuscarDos;
        this.ciuGenera = ciuGenera; this.aportante = aportante;
        this.tipoIdentificacionP = tipoIdentificacionP; this.identifacionP = identifacionP; this.correoP = correoP; this.emprendimiento = emprendimiento;
    }

    public static Performable radicacionDocumentos(String razonSocial, String organizacionJuridica, String domicilio, String tipo, String numero, String juntaSocios,
                                                   String municipio, String activosVinculados, String personal, String ingresos, String codigoBuscar,
                                                   String beneficiario, String capitalSuscrito, String numeroIdentficacion, String apellido,
                                                   String apellidoDos, String nombre, String nombreDos, String email, String numeroC, String bic, String nomenclatura,
                                                   String numDireccion, String numDireccionDos, String municipioSl, String barrio, String telefono,
                                                   String telefonoDos, String zona, String emailCorp, String ubicacion, String sede, String autorizacion,
                                                   String activosCorrientes, String patrimonio, String ingresosOperacionales, String grupoNif, String capitalNacional,
                                                   String capitalNacionalPriv, String codigoBuscarDos, String ciuGenera, String aportante, String tipoIdentificacionP, String identifacionP,
                                                   String correoP, String emprendimiento
    ){
        return instrumented(DoRadicacionDocumentos.class, razonSocial, organizacionJuridica, domicilio, tipo, numero, juntaSocios,
                municipio, activosVinculados, personal, ingresos, codigoBuscar, beneficiario, capitalSuscrito, numeroIdentficacion, apellido,
                apellidoDos, nombre, nombreDos, email, numeroC, bic, nomenclatura, numDireccion, numDireccionDos, municipioSl, barrio, telefono,
                telefonoDos, zona, emailCorp, ubicacion, sede, autorizacion, activosCorrientes, patrimonio, ingresosOperacionales, grupoNif, capitalNacional,
                capitalNacionalPriv, codigoBuscarDos, ciuGenera, aportante, tipoIdentificacionP, identifacionP,
                correoP, emprendimiento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ModalLoader.modalLoader(),
                WaitInteractions.untilAppears(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitSeconds.seconds(2),
                Enter.theValue("Radicar documentos").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                Click.on(RadicacionDocumentos.CONSTITUCION_PERSONA_BTN),
                Enter.theValue(razonSocial).into(RadicacionDocumentos.RAZON_SOCIAL_INPUT),
                SelectFromOptions.byVisibleText(organizacionJuridica).from(RadicacionDocumentos.ORGANIZACION_JURIDICA_SLT),
                JavaScriptClick.on(RadicacionDocumentos.CONTINUAR_BTN),
                WaitSeconds.seconds(2),
                Click.on(RadicacionDocumentos.TRANSACCION_INCLUIR_LNK),
                Click.on(RadicacionDocumentos.CONSTITUCION_SAS_LNK),
//                SelectFromOptions.byVisibleText(domicilio).from(RadicacionDocumentos.DOMICILIO_SLT),
                SelectFromOptions.byVisibleText("MANZANARES (CALDAS)").from(RadicacionDocumentos.DOMICILIO_SLT),
                SelectFromOptions.byVisibleText(tipo).from(RadicacionDocumentos.TIPO_SLT),
                Enter.theValue(numero).into(RadicacionDocumentos.NUMERO_INPUT),
                Enter.theValue(juntaSocios).into(RadicacionDocumentos.ORIGEN_DOCUMENTO_INPUT),
//                SelectFromOptions.byVisibleText(municipio).from(RadicacionDocumentos.MUNICIPIO_ORIGEN_SLT),
                SelectFromOptions.byVisibleText("MANZANARES (CALDAS)").from(RadicacionDocumentos.MUNICIPIO_ORIGEN_SLT),
                Clear.field(RadicacionDocumentos.ACTIVOS_VINCULADOS_INPUT).then(Enter.theValue(activosVinculados).into(RadicacionDocumentos.ACTIVOS_VINCULADOS_INPUT)),
                Clear.field(RadicacionDocumentos.PERSONAL_INPUT).then(Enter.theValue(personal).into(RadicacionDocumentos.PERSONAL_INPUT)),
                WaitSeconds.seconds(2),
                Clear.field(RadicacionDocumentos.INGRESOS_INPUT).then(Enter.theValue(ingresos).into(RadicacionDocumentos.INGRESOS_INPUT)),
                Scroll.to(RadicacionDocumentos.CIIU_BTN),
                Click.on(RadicacionDocumentos.CIIU_BTN),
                JavaScriptClick.on(RadicacionDocumentos.CODIGO_BUSCAR_INPUT),
                Enter.theValue(codigoBuscar).into(RadicacionDocumentos.CODIGO_BUSCAR_INPUT),
                Click.on(RadicacionDocumentos.CONSULTAR_BTN),
                Click.on(RadicacionDocumentos.COD_CIIU_LNK),
                SelectFromOptions.byVisibleText(beneficiario).from(RadicacionDocumentos.BENEFICIARIO_SLT),
                Clear.field(RadicacionDocumentos.CAPITAL_SUSCRITO_INPUT).then(Enter.theValue(capitalSuscrito).into(RadicacionDocumentos.CAPITAL_SUSCRITO_INPUT)),
                JavaScriptClick.on(RadicacionDocumentos.CONTINUAR_BTN),
                Hit.the(Keys.DOWN).into(RadicacionDocumentos.TIPO_IDENT_SLT),
                Enter.theValue(numeroIdentficacion).into(RadicacionDocumentos.NUMERO_IDENT_INPUT),
                Enter.theValue(apellido).into(RadicacionDocumentos.APELLIDO_INPUT),
                Enter.theValue(apellidoDos).into(RadicacionDocumentos.APELLIDO_DOS_INPUT),
                Enter.theValue(nombre).into(RadicacionDocumentos.NOMBRE_INPUT),
                Enter.theValue(nombreDos).into(RadicacionDocumentos.NOMBRE_DOS_INPUT),
                Enter.theValue(email).into(RadicacionDocumentos.EMAIL_INPUT),
                Enter.theValue(numeroC).into(RadicacionDocumentos.NUMERO_CELULAR_INPUT),
                Click.on(RadicacionDocumentos.CONTINUAR_DOS_BTN),
                Click.on(RadicacionDocumentos.GRABAR_FORMULARIO_LNK),
                SelectFromOptions.byVisibleText(bic).from(RadicacionDocumentos.BIC_SLT),
                SelectFromOptions.byVisibleText(emprendimiento).from(RadicacionDocumentos.EMPRENDIMIENTO_SOCIAL_SLC),
                Click.on(RadicacionDocumentos.GENERADOR_DIREC_BTN),
                SelectFromOptions.byVisibleText(nomenclatura).from(RadicacionDocumentos.NOMENCLARUTA_SLT),
                Enter.theValue(numDireccion).into(RadicacionDocumentos.NUMERO_DIREC_INPUT).thenHit(Keys.TAB),
                Enter.theValue(numDireccionDos).into(RadicacionDocumentos.NUMERO_DIREC_INPUT).thenHit(Keys.TAB),
                Click.on(RadicacionDocumentos.TRASLADAR_DIREC_BTN),
                //SelectFromOptions.byVisibleText("MANIZALES").from(RadicacionDocumentos.MUNICIPIO_SLT),
                SelectFromOptions.byVisibleText(municipioSl).from(RadicacionDocumentos.MUNICIPIO_SLT),
                //SelectFromOptions.byVisibleText(barrio).from(RadicacionDocumentos.BARRIO_SLT),
                SelectFromOptions.byVisibleText("20 DE JULIO").from(RadicacionDocumentos.BARRIO_SLT),
                Enter.theValue(telefono).into(RadicacionDocumentos.TELEFONO_INPUT),
                Enter.theValue(telefonoDos).into(RadicacionDocumentos.TELEFONO_DOS_INPUT),
                SelectFromOptions.byVisibleText(zona).from(RadicacionDocumentos.ZONA_SLT),
                Enter.theValue(emailCorp).into(RadicacionDocumentos.EMAIL_CORP_INPUT),
                SelectFromOptions.byVisibleText(ubicacion).from(RadicacionDocumentos.UBICACION_SLT),
                SelectFromOptions.byVisibleText(sede).from(RadicacionDocumentos.SEDE_SLT),
                Click.on(RadicacionDocumentos.DUPLICAR_DATOS_BTN),
                SelectFromOptions.byVisibleText(autorizacion).from(RadicacionDocumentos.AUTORIZACION_SLT),
                Clear.field(RadicacionDocumentos.ACTIVOS_CORRIENTES_INPUT).then(Enter.theValue(activosCorrientes).into(RadicacionDocumentos.ACTIVOS_CORRIENTES_INPUT)),
                Clear.field(RadicacionDocumentos.PATRIMONIO_INPUT).then(Enter.theValue(patrimonio).into(RadicacionDocumentos.PATRIMONIO_INPUT)),
                Clear.field(RadicacionDocumentos.INGRESOS_OPERACIONALES).then(Enter.theValue(ingresosOperacionales).into(RadicacionDocumentos.INGRESOS_OPERACIONALES)),
                SelectFromOptions.byVisibleText(grupoNif).from(RadicacionDocumentos.GRUPO_NIF_SLT),
                Clear.field(RadicacionDocumentos.CAPITAL_NACIONAL_INPUT).then(Enter.theValue(capitalNacional).into(RadicacionDocumentos.CAPITAL_NACIONAL_INPUT)),
                Clear.field(RadicacionDocumentos.CAPITAL_NACIONAL_PRIV_INPUT).then(Enter.theValue(capitalNacionalPriv).into(RadicacionDocumentos.CAPITAL_NACIONAL_PRIV_INPUT)),
                Click.on(RadicacionDocumentos.CIIU_DOS_BTN),
                WaitConstant.esperaConstante(),
                Enter.theValue(codigoBuscarDos).into(RadicacionDocumentos.CODIGO_BUSCAR_INPUT),
                JavaScriptClick.on(RadicacionDocumentos.CONSULTAR_DOS_BTN),
                JavaScriptClick.on(RadicacionDocumentos.CIIU_DOS_LNK),
                Hit.the(Keys.SPACE).into(RadicacionDocumentos.FECHA_INPUT),
                Hit.the(Keys.ENTER).into(RadicacionDocumentos.FECHA_INPUT),
                SelectFromOptions.byVisibleText(ciuGenera).from(RadicacionDocumentos.CIIU_GENERA_SLT),
                SelectFromOptions.byVisibleText(aportante).from(RadicacionDocumentos.APORTANTE_SLT),
                Click.on(RadicacionDocumentos.RESPONSABILIDAD_TRIBUTARIA_UNO_BTN),
                Click.on(RadicacionDocumentos.CUARENTA_OCHO_LNK),
                //Click.on(RadicacionDocumentos.RESPONSABILIDAD_TRIBUTARIA_DOS),
                JavaScriptClick.on(RadicacionDocumentos.CONTINUAR_BTN),
                Click.on(RadicacionDocumentos.OK_BTN),
                Click.on(RecibirPago.RECIBIR_PAGO_BTN),
                Click.on(RecibirPago.CONTINUAR_BTN),
                SelectFromOptions.byVisibleText(tipoIdentificacionP).from(RecibirPago.TIPO_IDENTIFICACION_SLC),
                Enter.theValue(identifacionP).into(RecibirPago.IDENTIFICACION_INPUT),
                Click.on(RecibirPago.VERIFICAR_IDENT_BTN),
                Enter.theValue(correoP).into(RecibirPago.EMAIL_CONFIRMACION_INPUT),
                Scroll.to(RecibirPago.DUPLICAR_DATOS_BTN),
                Click.on(RecibirPago.DUPLICAR_DATOS_BTN),
                Scroll.to(RecibirPago.GENERAR_RECIBO_BTN),
                Click.on(RecibirPago.GENERAR_RECIBO_BTN),
                Click.on(RecibirPago.CONTINUAR_BTN),
                Click.on(RecibirPago.RECIBO_DESCARGAR_LNK)
        );
    }
}
