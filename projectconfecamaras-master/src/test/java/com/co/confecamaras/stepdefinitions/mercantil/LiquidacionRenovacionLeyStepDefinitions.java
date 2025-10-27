package com.co.confecamaras.stepdefinitions.mercantil;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.mercantil.TextoRecibo;
import com.co.confecamaras.questions.mercantil.ValoresActivosAnioUno;
import com.co.confecamaras.tasks.DataBase.RunDataBaseQueryCortesRenovacion;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.mercantil.LiquidacionRenovacionLey;
import com.co.confecamaras.tasks.mercantil.RunDataBaseQueryLiquidacionRenovacion;
import com.co.confecamaras.tasks.mercantil.RunDataBaseQueryRenovacionAnios;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.mercantil.LiquidacionRenovacionLeyConstans.TEXTO_DATOS_GENERALES_FACTURA;
import static com.co.confecamaras.utils.mercantil.RenovacionESDALAConstans.ANIO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class LiquidacionRenovacionLeyStepDefinitions {

    @Dado("^(.*) requiere liquidacion renovacion")
    public void confecamarasRequiereLiquidacionRenovacion(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryCortesRenovacion.query());
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryLiquidacionRenovacion.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("haga la liquidacion")
    public void hagaLaLiquidacion() {
        withCurrentActor(LiquidacionRenovacionLey.conMatricula(DataBase.getLiquidacionLey()));
    }
    @Entonces("debera ver el recibo con las generalidades")
    public void deberaVerElReciboConLasGeneralidades() {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoRecibo.es(), Matchers.is(TEXTO_DATOS_GENERALES_FACTURA)));
    }

}
