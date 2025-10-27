package com.co.confecamaras.stepdefinitions.usuariosNacionales;

import com.co.confecamaras.navigation.NavigateTo;
import com.co.confecamaras.questions.usuariosnacionales.TextoUsuarioNacional;
import com.co.confecamaras.tasks.RunDataBase;
import com.co.confecamaras.tasks.usuariosnacionales.ModificarUsuarioNacional;
import com.co.confecamaras.tasks.usuariosnacionales.RunDataBaseQueryUsuariosNacionales;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static com.co.confecamaras.utils.usuariosnacionales.UsuariosNacionalesConstans.MENSAJE_SIN_RESULTADOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;

public class UsuarioNacionalStepdDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^(.*) requiere modificar un usuario nacional")
    public void confecamarasRequiereModificarUnUsuarioNacional(String actor) {
        theActorCalled(actor).attemptsTo(RunDataBase.dataBase("drios", "Di3gOri2021*"));
        theActorCalled(actor).attemptsTo(RunDataBaseQueryUsuariosNacionales.query());
        theActorCalled(actor).attemptsTo(NavigateTo.confecamarasHomePage());
    }
    @Cuando("realice las modificaciones necesarias")
    public void realiceLasModificacionesNecesarias() {
        withCurrentActor(ModificarUsuarioNacional.modificar());
    }
    @Entonces("podra ver que las modificaciones fueron realizadas")
    public void podraVerQueLasModificacionesFueronRealizadas() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextoUsuarioNacional.es(), Matchers.is(MENSAJE_SIN_RESULTADOS)));
    }

}
