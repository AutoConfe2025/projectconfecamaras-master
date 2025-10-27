package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaMantenimientoMunicipiosDepartamentos;
import com.co.confecamaras.questions.devdos.CertificasQuestion;
import com.co.confecamaras.questions.devdos.ReimpresionQuestion;
import com.co.confecamaras.questions.devdos.SecuenciasQuestion;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class MantenimientoCuatroDevStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    // ----- Mantenimiento  Secuencias ----- //

    @Dado("^(.*) requiere realizar el mantenimiento secuencias")
    public void confecamarasRequiereRealizarElMantenimientoSecuencias(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "Secuencias", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara el mantenimiento secuencias")
    public void realizaraElMantenimientoSecuencias() {
        withCurrentActor(
                DoMantenimientoSecuencias.mantenimientoSecuencias(datos.get("Valor Mod"), datos.get("Valor Original"))
        );
        theActorInTheSpotlight().should(seeThat(SecuenciasQuestion.validacion()));
    }

    // ----- Mantenimiento  Motivos Reimpresion ----- //

    @Dado("^(.*) requiere realizar el mantenimiento motivos reimpresion")
    public void confecamarasRequiereRealizarElMantenimientoMotivosReimpresion(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "Reimpresion", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara el mantenimiento motivos reimpresion")
    public void realizaraElMantenimientoMotivosReimpresion() {
        withCurrentActor(
                DoMantenimientoReimpresion.reimpresion(datos.get("Id"), datos.get("Nombre"))
        );
        theActorInTheSpotlight().should(seeThat(ReimpresionQuestion.validacion()));
    }

    // ----- Mantenimiento  Maestro Certificas ----- //

    @Dado("^(.*) requiere realizar el mantenimiento maestro certificas")
    public void confecamarasRequiereRealizarElMantenimientoMaestroCertificas(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "Certificas", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara el mantenimiento maestro certificas")
    public void realizaraElMantenimientoMaestroCertificas() {
        withCurrentActor(
                DoMantenimientoCertificas.certificas(datos.get("Descripcion"))
        );
        theActorInTheSpotlight().should(seeThat(CertificasQuestion.validacion()));
    }

    // ----- Mantenimiento  Maestro Tipo Devolucion ----- //

    @Dado("^(.*) requiere realizar el mantenimiento maestro tipo tramites devoluciones")
    public void confecamarasRequiereRealizarElMantenimientoMaestroTipoTramitesDevoluciones(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "Devolucion", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara el mantenimiento tipo tramites devoluciones")
    public void realizaraElMantenimientoTipoTramitesDevoluciones() {
        withCurrentActor(
                DoMantenimientoDevolucion.devolucion(datos.get("Descripcion"))
        );
        theActorInTheSpotlight().should(seeThat(CertificasQuestion.validacion()));
    }

    // ----- Mantenimiento  Maestro Identificadores ----- //

    @Dado("^(.*) requiere realizar el mantenimiento maestro identificadores")
    public void confecamarasRequiereRealizarElMantenimientoMaestroIdentificadores(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "Identificadores", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Entonces("realizara el mantenimiento de maestro identificadores")
    public void realizaraElMantenimientoDeMaestroIdentificadores() {
        withCurrentActor(
                DoMantenimientoIdentificadores.identificadores()
        );
        theActorInTheSpotlight().should(seeThat(CertificasQuestion.validacion()));
    }

}
