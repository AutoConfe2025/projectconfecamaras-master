package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaReingresoTramites;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.ReingresoTramites;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.RunDataBaseQueryReingresoTramites;
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

public class ReingresoTramitesStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el Reingreso de Tramites")
    public void confecamarasRequiereRealizarElReingresoDeTramites(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ReingresoTramites", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryReingresoTramites.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa las credenciales asignadas en el aplicativo")
    public void confecamarasIngresaLasCredencialesAsignadasEnElAplicativo() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione el Modulo de Registro, Registros publicos - gestions de caja, Reingreso de tramites")
    public void seleccioneElModuloDeRegistroRegistrosPublicosGestionsDeCajaReingresoDeTramites() {
        withCurrentActor(ReingresoTramites.enConfecamaraSII(DataBase.getCodigoBarrasReingreso(), data.get("Nombre"), data.get("TipoIdentificacion"),
                data.get("NumeroIdentificacion"), data.get("FechaExpedicion"), data.get("Email"), data.get("TelefonoFijo"), data.get("Celular")));
    }

    @Entonces("validara el reingreso del codigo de barras")
    public void validaraElReingresoDelCodigoDeBarras() {
        theActorInTheSpotlight().should(seeThat(RevisaReingresoTramites.enConfecamaraSII()));
    }
}