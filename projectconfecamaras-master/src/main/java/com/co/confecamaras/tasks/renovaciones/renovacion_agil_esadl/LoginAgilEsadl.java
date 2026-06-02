package com.co.confecamaras.tasks.renovaciones.renovacion_agil_esadl;

import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.models.UsuarioPublicoModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilEsadlPage.BOTON_SELECCION_MATRICULA;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.*;
import static com.co.confecamaras.userinterfaces.renovaciones.FlujoAgilPnPage.BOTON_INGRESAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

@AllArgsConstructor
public class LoginAgilEsadl implements Task {

    private final UsuarioPublicoModel usuario;
    @Override
    public <T extends Actor> void performAs(T actor) {
       String numIdentificacion= actor.recall("numid");

        actor.attemptsTo(

                Enter.theValue(usuario.getUsuario()).into(CAMPO_CORREO_AGIL),
                Enter.theValue(numIdentificacion).into(CAMPO_IDENTIFICACION_AGIL),
                Enter.theValue(usuario.getContrasena()).into(CAMPO_CONTRASEÑA_AGIL),
                Click.on(BOTON_INGRESAR),
                WaitInterrupted2Segundos.esperaConstante2()
        );

        if (BOTON_SELECCION_MATRICULA.isVisibleFor(actor)){
            actor.attemptsTo(
                    Click.on(BOTON_SELECCION_MATRICULA)
            );
        }
    }

    public static LoginAgilEsadl loginAgilEsadl(UsuarioPublicoModel usuario){
        return instrumented(LoginAgilEsadl.class, usuario);
    }
}
