package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.interactions.WaitInterrupted2Segundos;
import com.co.confecamaras.interactions.menulateral.MenuLateral;
import com.co.confecamaras.interactions.waitinteractions.WaitInteractions;
import com.co.confecamaras.questions.devdos.MantenimientoUsuariosQuestion;
import com.co.confecamaras.questions.devdos.RenovacionPersonaNCEQuestion;
import com.co.confecamaras.userinterfaces.MantenimientoReciboCaja;
import com.co.confecamaras.userinterfaces.MantenimientoUsuarios;
import com.co.confecamaras.userinterfaces.MenuSistema;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.BTN_MENU_LATERAL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DoMantenimientoUsuarios implements Task {


    public static Performable matenimientoUsuarios(){
        return instrumented(DoMantenimientoUsuarios.class);
    }

    public static Performable toAlert() {
        return new DriverTask(driver -> driver.switchTo().alert().accept() );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MenuLateral.menuLateral(),
                Enter.theValue("Usuarios").into(MenuSistema.BUSQUEDA_INPUT),
                Click.on(MenuSistema.SELECCIONAR_OPT),
                Switch.toNewWindow(),
                /*Scroll.to(MantenimientoUsuarios.CAJAQA_SRC).andAlignToBottom(),*/
                Scroll.to(MantenimientoUsuarios.EDITAR_BTN).andAlignToBottom(),
                Click.on(MantenimientoUsuarios.EDITAR_BTN),
                Click.on(MantenimientoUsuarios.GRABAR_CAMBIOS_BTN)
                /*Scroll.to(MantenimientoUsuarios.CAJAQA_SRC),*/
                /*Click.on(MantenimientoUsuarios.EDITAR_BTN),
                Click.on(MantenimientoUsuarios.REGRESAR_BTN),
                Click.on(MantenimientoUsuarios.INACTIVAR_BTN),
                Scroll.to(MantenimientoUsuarios.CAJAQA_SRC),
                Click.on(MantenimientoUsuarios.ACTIVAR_BTN),
                Scroll.to(MantenimientoUsuarios.CAJAQA_SRC),
                Click.on(MantenimientoUsuarios.PERFIL_BTN),
                Click.on(MantenimientoUsuarios.GRABAR_BTN),
                Scroll.to(MantenimientoUsuarios.CAJAQA_SRC),
                Click.on(MantenimientoUsuarios.ESPECIALES_BTN),
                Click.on(MantenimientoUsuarios.GRABAR_BTN),
                Click.on(MantenimientoUsuarios.REGRESAR_DOS_BTN),
                Scroll.to(MantenimientoUsuarios.CAJAQA_SRC),
                Click.on(MantenimientoUsuarios.CLAVE_MAIL_BTN),
                toAlert(),
                Scroll.to(MantenimientoUsuarios.CAJAQA_SRC),
                Click.on(MantenimientoUsuarios.CLAVE_SMS_BTN),
                toAlert(),
                Scroll.to(MantenimientoUsuarios.CAJAQA_SRC));
        actor.should(seeThat(MantenimientoUsuariosQuestion.validacion()));
        actor.attemptsTo(
                Click.on(MantenimientoUsuarios.FIRMA_JPG_BTN),
                Click.on(MantenimientoUsuarios.REGRESAR_DOS_BTN),
                Click.on(MantenimientoUsuarios.FIRMA_GIF_BTN),
                Click.on(MantenimientoUsuarios.REGRESAR_DOS_BTN),
                Scroll.to(MantenimientoUsuarios.CAJAQA_SRC),
                Click.on(MantenimientoUsuarios.RUTAS_BTN),
                Click.on(MantenimientoUsuarios.GRABAR_BTN)*/
        );
    }

}
