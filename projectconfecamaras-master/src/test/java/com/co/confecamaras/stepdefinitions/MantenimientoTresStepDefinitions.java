package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.MantenimientoComentarios;
import com.co.confecamaras.questions.RevisaMantenimientoBarrios;
import com.co.confecamaras.questions.RevisaMantenimientoMunicipiosDepartamentos;
import com.co.confecamaras.questions.RevisaMantenimientoSedesBiometria;
import com.co.confecamaras.questions.devdos.*;
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

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MantenimientoTresStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    // ---- Mantenimiento Maestro Transacciones Registro ---- //

    @Dado("^(.*) requiere realizar el mantenimiento maestro transacciones registro")
    public void confecamarasRequiereRealizarElMantenimientoMaestroTransaccionesRegistro(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoMaestroT", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion Maestro Transacciones Registro")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionMaestroTransaccionesRegistro() {}

    @Entonces("realizara el mantenimiento maestro transacciones registro")
    public void realizaraElMantenimientoMaestroTransaccionesRegistro() {
        withCurrentActor(
                DoMantenimientoMaestroT.mantenimientoMaestroT(data.get("Duplicar"), data.get("Codigo"), data.get("Nombre"),
                        data.get("Nombre Corto"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoMaestroTransaccionRegistroQuestion.validacion()));
    }

    // ---- Mantenimiento Tablas Codigos ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de tablas codigos")
    public void confecamarasRequiereRealizarElMantenimientoDeTablasCodigos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoTablasC", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion Tablas Codigos")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionTablasCodigos() {}

    @Entonces("realizara el mantenimiento de tabla codigos")
    public void realizaraElMantenimientoDeTablaCodigos() {
        withCurrentActor(
                DoMantenimientosCodigos.mantenimientosCodigos()
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoTablaCodigosQuestion.validacion()));
    }

    // ---- Mantenimiento Sedes ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de sedes")
    public void confecamarasRequiereRealizarElMantenimientoDeSedes(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoSedes", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion Sedes")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionSedes() {}

    @Entonces("realizara el mantenimiento sedes")
    public void realizaraElMantenimientoSedes() {
        withCurrentActor(
                DoMantenimientoSedes.mantenimientoSedes(data.get("S"), data.get("N"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoSedesQuestion.validacion()));
    }

    // ---- Mantenimiento Actos ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de actos")
    public void confecamarasRequiereRealizarElMantenimientoDeActos(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoActos", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion Actos")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionActos() {}

    @Entonces("realizara el mantenimiento actos")
    public void realizaraElMantenimientoActos() {
        withCurrentActor(
                DoMantenimientoActos.mantenimientoActos(data.get("Libro Uno"), data.get("Libro Dos"), data.get("Libro Tres"))
        );
        theActorInTheSpotlight().should(seeThat(MantenimientoActosQuestion.validacion()));
    }

    // ---- Mantenimiento Jurisdiccion ---- //

    @Dado("^(.*) requiere realizar el mantenimiento de jurisdiccion")
    public void confecamarasRequiereRealizarElMantenimientoDeJurisdiccion(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoJurisd", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion Municipios Jurisdiccion")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionMunicipiosJurisdiccion() {}

    @Entonces("realizara el mantenimiento jurisdiccion")
    public void realizaraElMantenimientoJurisdiccion() {
        withCurrentActor(
                DoJurisdiccion.jurisdiccion(data.get("CcosPub"), data.get("CcosPri"))
        );
        theActorInTheSpotlight().should(seeThat(MunicipiosJurisdiccionQuestion.validacion()));
    }


    @Dado("^(.*) requiere realizar el mantenimiento de tipos comentarios")
    public void confecamarasRequiereRealizarElMantenimientoDeTiposComentarios(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "MantenimientoComentarios", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Modulo de Registro, Registros Publicos, Administracion Tipos de Comentarios")
    public void seleccioneModuloDeRegistroRegistrosPublicosAdministracionTiposDeComentarios() {}
    @Entonces("realizara el mantenimiento de tipos comentarios")
    public void realizaraElMantenimientoDeTiposComentarios() {
        withCurrentActor(
                DoMantenimientoComentarios.matenimientoComentarios(data.get("ID_Cod"), data.get("Descripcion"))
        );

        theActorInTheSpotlight().should(seeThat(MantenimientoComentarios.validacion()));

    }

}