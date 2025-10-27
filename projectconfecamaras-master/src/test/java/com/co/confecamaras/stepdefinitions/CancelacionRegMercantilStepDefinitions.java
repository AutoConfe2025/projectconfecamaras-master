package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.devdos.RadicarSolCancelacionRegMercantilQuestion;
import com.co.confecamaras.tasks.DataBase.RunDataBaseQueryCancelacionRegMercantil;
import com.co.confecamaras.tasks.DoCancelacionRegMercantil;
import com.co.confecamaras.tasks.RunDataBase;
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

public class CancelacionRegMercantilStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere radicar la solicitud de cancelacion reg mercantil")
    public void confecamaras_requiere_consultar_el_detallado_de_caja(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryCancelacionRegMercantil.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("ingrese el numero de matricula para solicitar la cancelacion")
    public void seleccione_modulo_de_integracion_erp_rues_cfe_mantenimiento_e_informes_detallado_de_caja_por_cajero() {}

    @Entonces("podra radicar la solicitud de cancelacion")
    public void podra_consultar_el_detallado_de_caja_por_cajero_con_los_siguientes_datos() {
        Excel excel = new Excel(Excel.rutaExcelDev, "RadicarSolicitudCanc", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoCancelacionRegMercantil.cancelacionRegMercantil(datos.get("Consulta"), datos.get("Informacion"), datos.get("Motivo"), datos.get("Observacion"),
                        datos.get("Fecha"), datos.get("Entidad"), datos.get("Cedula"), datos.get("Email"), DataBase.getNumMatriculaCancelacion())
        );
        theActorInTheSpotlight().should(seeThat(RadicarSolCancelacionRegMercantilQuestion.validacion()));
    }

}