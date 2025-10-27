package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaReingresoTramitesBloque;
import com.co.confecamaras.tasks.HacerLoginDatosExcel;
import com.co.confecamaras.tasks.ReingresoTramitesBloque;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.RunDataBaseQueryReingresoTramitesBloque;
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

public class ReingresoTramitesBloqueStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el Reingreso de tramites en bloque")
    public void confecamarasRequiereRealizarElReingresoDeTramitesEnBloque(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDevDos, "ReingresoTramitesBloque", true, 1);
        data = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryReingresoTramitesBloque.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("Confecamaras ingresa las credenciales asignadas en el home page")
    public void confecamarasIngresaLasCredencialesAsignadasEnElHomePage() {
        withCurrentActor(HacerLoginDatosExcel.enConfecamaraSII(data.get("NumeroCamara"), data.get("Usuario"),
                data.get("Identificacion"), data.get("Clave")));
    }

    @Cuando("seleccione el Modulo de Registro, Registros publicos - gestions de caja, Reingreso de tramites en bloque")
    public void seleccioneElModuloDeRegistroRegistrosPublicosGestionsDeCajaReingresoDeTramitesEnBloque() {
        withCurrentActor(ReingresoTramitesBloque.enConfecamaraSII(DataBase.getCodigoBarrasReingresoBloque(), data.get("NombreCompleto"), data.get("TipoIdentificacion"),
                data.get("NumeroIdentificacion"), data.get("FechaExpedicion")));
    }

    @Entonces("validara el reingreso de los codigos de barras")
    public void validaraElReingresoDeLosCodigosDeBarras() {
        theActorInTheSpotlight().should(seeThat(RevisaReingresoTramitesBloque.enConfecamaraSII()));
    }
}