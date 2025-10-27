package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.devdos.RecibirPagoNuevoQuestion;
import com.co.confecamaras.tasks.DataRecibirPagoNuevo;
import com.co.confecamaras.tasks.DoRecibirPagoNuevo;
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

public class RecibirPagoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar recibir pago nuevo")
    public void confecamarasRequiereRealizarRecibirPagoNuevo(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Modulo de Registro, Registros Publicos, Gestion de Caja")
    public void seleccioneModuloDeRegistroRegistrosPublicosGestionDeCaja() {
        Excel excel = new Excel(Excel.rutaExcelDev, "RecibirPago", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(DataRecibirPagoNuevo.enConfecamaraSII(datos.get("ConsultaPor"), datos.get("Matricula"),
                datos.get("CertificadosMatricula")));
        withCurrentActor(DoRecibirPagoNuevo.recibirPagoNuevo(datos.get("Incluir Cobro"),
                datos.get("Forzar Descuento"), datos.get("Tipo"), datos.get("Identificacion"), datos.get("Email")));
    }

    @Entonces("podra realizar la accion de recibir pago nuevo")
    public void podraRealizarLaAccionDeRecibirPagoNuevo() {
        theActorInTheSpotlight().should(seeThat(RecibirPagoNuevoQuestion.validacion()));
    }
}