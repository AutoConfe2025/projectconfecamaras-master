package com.co.confecamaras.stepdefinitions.BandejaLeyPonal;

import com.co.confecamaras.models.DataBase;
import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.bandeja.BandejaPonalTexto;
import com.co.confecamaras.tasks.Bandeja.BandejaPonalCon;
import com.co.confecamaras.tasks.Bandeja.DataBandejaPonalSinAsentamiento;
import com.co.confecamaras.tasks.DataBase.RunDataBaseQueryBandejaPonalSinAsentamiento;
import com.co.confecamaras.tasks.RunDataBase;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.bandejaponal.BandejaPonalConstans.MENSAJE_INFORMATIVO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class BandejaPonalConAsentamientoStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^(.*) requiere hacer un asentamiento completo")
    public void confecamarasRequiereHacerUnAsentamientoCompleto(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryBandejaPonalSinAsentamiento.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }

    @Cuando("ingrese la informacion necesaria para el asentamiento")
    public void ingreseLaInformacionNecesariaParaElAsentamiento() {
        withCurrentActor(DataBandejaPonalSinAsentamiento.dataBandejaPonalSinAsentamiento(DataBase.getNumMatricula()));
       withCurrentActor(BandejaPonalCon.asentamiento());
    }

    @Entonces("podra ver el asentamiento exitoso")
    public void podraVerElAsentamientoExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(BandejaPonalTexto.es(), Matchers.is(MENSAJE_INFORMATIVO)));

    }
}
