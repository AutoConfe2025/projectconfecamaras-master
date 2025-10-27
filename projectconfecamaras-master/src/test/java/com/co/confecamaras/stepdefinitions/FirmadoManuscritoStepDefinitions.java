package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.RevisaFirmadoElectronicoSobre;
import com.co.confecamaras.questions.devdos.FirmadoManuscritoSobreQuestion;
import com.co.confecamaras.tasks.DataFirmadoManuscritoSobre;
import com.co.confecamaras.tasks.DoFirmadoManuscritoSobre;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.RunDataBaseQueryRadicarActualizacionDatosMutacion;
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

public class FirmadoManuscritoStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere realizar el firmado de manuscrito sobre")
    public void confecamarasRequiereRealizarElFirmadoDeManuscritoSobre(String actor) {
        Excel excel = new Excel(Excel.rutaExcelDev, "FirmadoManuscritoSobre", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryRadicarActualizacionDatosMutacion.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Publicos, Actualizacion de datos mutacion")
    public void seleccioneConsultasYTransaccionesConsultasRegistrosPublicosActualizacionDeDatosMutacion() {}

    @Entonces("retomara el tramite y generara el codigo qr para su validacion")
    public void retomaraElTramiteYGeneraraElCodigoQrParaSuValidacion() {
        withCurrentActor(DataFirmadoManuscritoSobre.enConfecamaraSII(datos.get("ConsultaPor"), datos.get("Matricula"),
                datos.get("DatosModificar"), datos.get("Direccion"), datos.get("Telefono")));
        withCurrentActor(
                DoFirmadoManuscritoSobre.firmadoManuscritoSobre(datos.get("Celular"))
        );
        theActorInTheSpotlight().should(seeThat(FirmadoManuscritoSobreQuestion.validacion()));
    }
}