package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaMantenimientoTipoTramite;
import com.co.confecamaras.questions.devdos.MantenimientoKardexQuestion;
import com.co.confecamaras.questions.devdos.MantenimientoRecibosCajaQuestion;
import com.co.confecamaras.questions.devdos.MantenimientoTablaCodigosQuestion;
import com.co.confecamaras.tasks.DoMantenimientoKardex;
import com.co.confecamaras.tasks.DoMantenimientoReciboCaja;
import com.co.confecamaras.tasks.DoMantenimientoUsuarios;
import com.co.confecamaras.questions.RevisaMantenimientoOpciones;
import com.co.confecamaras.questions.RevisaMantenimientoServicios;
import com.co.confecamaras.questions.RevisaMantenimientoServiciosRues;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MantenimientoStepDefinition {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el Mantenimiento Kardex SII")
    public void confecamarasRequiereRealizarElMantenimientoKardexSII(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoKardex", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Mantenimiento Kardex SII")
    public void seleccioneModuloDeRegistroRegistrosPublicosMantenimientoKardexSII() {}

    @Entonces("capturara y validara los datos para la prueba")
    public void capturaraYValidaraLosDatosConElSiguienteNumeroInicial() {
        withCurrentActor(
                DoMantenimientoKardex.matenimientoKardex(datos.get("Libro"), datos.get("Numero Inicial"), datos.get("Texto Modificado"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoKardexQuestion.validacion()));
    }

    // ----- Step Definitions Mantenimiento Recibos Caja ----- //

    @Dado("^(.*) requiere realizar el Mantenimiento Recibos de Caja")
    public void confecamarasRequiereRealizarElMantenimientoRecibosDeCaja(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Mantenimiento Recibos Caja")
    public void seleccioneModuloDeRegistroRegistrosPublicosMantenimientoRecibosCaja() {}
    @Entonces("capturara y validara los datos para la prueba de recibos")
    public void capturaraYValidaraLosDatosParaLaPruebaDeRecibos() {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoReciboCaja", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoMantenimientoReciboCaja.matenimientoReciboCaja(datos.get("Numero Recibo"), datos.get("Beneficiario"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoRecibosCajaQuestion.validacion()));
    }

    // ----- Step Definitions Mantenimiento Usuarios ----- //

    @Dado("^(.*) requiere realizar el Mantenimiento de Usuarios")
    public void confecamarasRequiereRealizarElMantenimientoDeUsuarios(String actor) {
        //Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoReciboCaja", true, 1);
        //datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingrese en la aplicacion con sus credenciales admin")
    public void confecamarasIngreseEnLaAplicacionConSusCredencialesAdmin() {
        Excel excel = new Excel(Excel.rutaExcelDev, "LoginAdmin", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(DoLogin.login(datos.get("Usuario"), datos.get("Identificacion"), datos.get("Clave")), DoMenu.menu());
    }

    @Cuando("seleccione Parametrizacion ERP, Tablas Basicas, Usuarios")
    public void seleccioneParametrizacionERPTablasBasicasUsuarios() {}

    @Entonces("comenzara con el mantenimiento de usuarios")
    public void comenzaraConElMantenimientoDeUsuarios() {
        withCurrentActor(
                DoMantenimientoUsuarios.matenimientoUsuarios()
        );
    }

    /*----------Mantenimiento Opciones----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Opciones")
    public void confecamarasRequiereRealizarElMantenimientoOpciones(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantenimientoOpciones", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con las credenciales de administrador")
    public void confecamarasIngresaEnLaAplicacionConLasCredencialesDeAdministrador() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(datos.get("NumeroCamara"), datos.get("Usuario"),
                datos.get("Identificacion"), datos.get("Clave")));
    }

    @Cuando("seleccione Parametrizacion ERP, Mantenimiento tablas basicas, Opciones")
    public void seleccioneParametrizacionERPMantenimientoTablasBasicasOpciones() {
        withCurrentActor(MantenimientoOpciones.enConfecamaraSII());
    }

    @Entonces("validara que las opciones funcionen correctamente")
    public void validaraQueLasOpcionesFuncionenCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoOpciones.enConfecamaraSII()));
    }

    /*----------Mantenimiento Servicios----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Servicios")
    public void confecamarasRequiereRealizarElMantenimientoServicios(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantenimientoServicios", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con sus credenciales de administrador")
    public void confecamarasIngresaEnLaAplicacionConSusCredencialesDeAdministrador() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(datos.get("NumeroCamara"), datos.get("Usuario"),
                datos.get("Identificacion"), datos.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos - administracion, Servicios")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionServicios() {
        withCurrentActor(MantenimientoServicios.enConfecamaraSII(datos.get("DuplicarDesde")));
    }

    @Entonces("validara que las opciones funcionan correctamente")
    public void validaraQueLasOpcionesFuncionanCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoServicios.enConfecamaraSII()));
    }

    /*----------Mantenimiento Servicios RUES----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento servicios RUES")
    public void confecamarasRequiereRealizarElMantenimientoServiciosRUES(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantenimientoServiciosRUES", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con sus credenciales administrador")
    public void confecamarasIngresaEnLaAplicacionConSusCredencialesAdministrador() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(datos.get("NumeroCamara"), datos.get("Usuario"),
                datos.get("Identificacion"), datos.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos - administracion, Servicios RUES")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionServiciosRUES() {
        withCurrentActor(MantenimientoServiciosRues.enConfecamaraSII());
    }

    @Entonces("validara que la opcion editar funciona correctamente")
    public void validaraQueLaOpcionEditarFuncionaCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoServiciosRues.enConfecamaraSII()));
    }

    /*----------Mantenimiento Tipo de Tramite----------*/

    @Dado("^(.*) requiere realizar el Mantenimiento Tipo de Tramite")
    public void confecamarasRequiereRealizarElMantenimientoTipoDeTramite(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "MantenimientoTipoTramite", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa en la aplicacion con las credenciales administrador")
    public void confecamarasIngresaEnLaAplicacionConLasCredencialesAdministrador() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(datos.get("NumeroCamara"), datos.get("Usuario"),
                datos.get("Identificacion"), datos.get("Clave")));
    }

    @Cuando("seleccione Modulo de Registro, Registros publicos - administracion, Tipo de Tramite")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionTipoDeTramite() {
        withCurrentActor(MantenimientoTipoTramite.enConfecamaraSII());
    }

    @Entonces("validara que funciona correctamente")
    public void validaraQueFuncionaCorrectamente() {
        theActorInTheSpotlight().should(seeThat(RevisaMantenimientoTipoTramite.enConfecamaraSII()));
    }
}