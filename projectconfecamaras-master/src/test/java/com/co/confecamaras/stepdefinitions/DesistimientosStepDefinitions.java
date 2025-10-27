package com.co.confecamaras.stepdefinitions;

import com.co.confecamaras.utils.DataDrivenExcel;
import com.co.confecamaras.utils.Excel;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.Validations;
import com.co.confecamaras.tasks.DoDesistimientos;


import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DesistimientosStepDefinitions {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> datos = new HashMap<>();

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^(.*) requiere consultar Desistimientos Decretados")
    public void confecamaras_requiere_consultar_desistimientos_decretados(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("seleccione Consultas y Transacciones, Consultas Registros Publicos, Desistimientos decretados")
    public void seleccione_consultas_y_transacciones_consultas_registros_publicos_desistimientos_decretados() {}

    @Entonces("podra visualizar el Acto de desistimiento con el numero")
    public void podra_visualizar_el_acto_de_desistimiento_con_numero() {
        Excel excel = new Excel(Excel.rutaExcelDev, "DesistimientosDecretados", true, 1);
        datos = dataDriverExcel.leerExcel(excel);
        withCurrentActor(
                DoDesistimientos.desistimientosDecretados(datos.get("Numero Desistimiento"))
        );
    }

    @Entonces("validara el resultado mostrado")
    public void validara_el_resultado_mostrado() {
        System.out.println("****" + Validations.desistimientos().answeredBy(theActorInTheSpotlight()) + "****");
    }

}
