package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaDesbloquearLiquidacion;
import com.co.confecamaras.tasks.*;
import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.co.confecamaras.utils.Constantes.CONFECAMARAS;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DesbloquearLiquidacionStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    /*----------Pago en Caja----------*/

    @Dado("^(.*) se encuentra en el aplicativo ConfecamaraSII")
    public void confecamarasSeEncuentraEnElAplicativoConfecamaraSII(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "DesblLiquidacionPagoCaja", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryDesbloquearLiquidacionPagoCaja.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("el usuario ingresa el numero de recuperacion de la liquidacion pago en caja")
    public void elUsuarioIngresaElNumeroDeRecuperacionDeLaLiquidacionPagoEnCaja() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
        withCurrentActor(DesbloquearLiquidacionPagoCaja.enConfecamaraSII(DataBase.getNumRecuperacionPagoCaja()));
    }

    @Entonces("podra validar su correcta activacion en pago en caja")
    public void podraValidarSuCorrectaActivacionEnPagoEnCaja() {
        theActorInTheSpotlight().should(seeThat(RevisaDesbloquearLiquidacion.enConfecamaraSII()));
    }

    /*----------Pago Electronico----------*/

    @Dado("^(.*) requiere Desbloquear liquidacion Pago Electronico")
    public void confecamarasRequiereDesbloquearLiquidacionPagoElectronico(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "DesblLiquidacionPagoElectronico", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryDesbloquearLiquidacionPagoElectronico.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("el usuario ingresa el numero de recuperacion de la liquidacion en pago electronico")
    public void elUsuarioIngresaElNumeroDeRecuperacionDeLaLiquidacionEnPagoElectronico() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
        withCurrentActor(DesbloquearLiquidacionPagoElectronico.enConfecamaraSII(DataBase.getNumRecuperacionPagoElectronico()));
    }

    @Entonces("podra validar su correcta activacion en pago electronico")
    public void podraValidarSuCorrectaActivacionEnPagoElectronico() {
        theActorInTheSpotlight().should(seeThat(RevisaDesbloquearLiquidacion.enConfecamaraSII()));
    }

    /*----------Firmado Electronico----------*/

    @Dado("^(.*) requiere Desbloquear liquidacion Firmado Electronico")
    public void confecamarasRequiereDesbloquearLiquidacionFirmadoElectronico(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "DesblLiquidacionFirmadoElectron", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryDesbloquearLiquidacionFirmadoElectronico.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("el usuario ingresa el numero de recuperacion de la liquidacion en firmado electronico")
    public void elUsuarioIngresaElNumeroDeRecuperacionDeLaLiquidacionEnFirmadoElectronico() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
        withCurrentActor(DesbloquearLiquidacionFirmadoElectronico.enConfecamaraSII(DataBase.getNumRecuperacionFirmadoElectronico()));
    }

    @Entonces("podra validar su correcta activacion en firmado electronico")
    public void podraValidarSuCorrectaActivacionEnFirmadoElectronico() {
        theActorInTheSpotlight().should(seeThat(RevisaDesbloquearLiquidacion.enConfecamaraSII()));
    }

    /*----------Formulario Final----------*/

    @Dado("^(.*) requiere Desbloquear liquidacion Formulario Final")
    public void confecamarasRequiereDesbloquearLiquidacionFormularioFinal(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "DesblLiquidacionFormularioFinal", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryDesbloquearLiquidacionFormularioFinal.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("el usuario ingresa el numero de recuperacion de la liquidacion formulario final")
    public void elUsuarioIngresaElNumeroDeRecuperacionDeLaLiquidacionFormularioFinal() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"), data.get("Identificacion"), data.get("Clave")));
        withCurrentActor(DesbloquearLiquidacionFormularioFinal.enConfecamaraSII(DataBase.getNumRecuperacionFormularioFinal()));
    }

    @Entonces("podra validar su correcta activacion en formulario final")
    public void podraValidarSuCorrectaActivacionEnFormularioFinal() {
        theActorInTheSpotlight().should(seeThat(RevisaDesbloquearLiquidacion.enConfecamaraSII()));
    }
}