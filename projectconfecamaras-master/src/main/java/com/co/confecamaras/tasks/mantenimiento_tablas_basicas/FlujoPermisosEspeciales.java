package com.co.confecamaras.tasks.mantenimiento_tablas_basicas;

import com.co.confecamaras.interactions.AceptAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.mantenimiento_tablas_basicas.PermisosEspecialesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class FlujoPermisosEspeciales implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_NUEVO_PERMISO_ESPECIAL,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_NUEVO_PERMISO_ESPECIAL),
                Click.on(CAMPO_ID_PERMISO),
                Enter.theValue("01.00").into(CAMPO_ID_PERMISO),
                Click.on(CAMPO_DESCRIPCION),
                Enter.theValue("QA").into(CAMPO_DESCRIPCION),
                Click.on(LISTA_TIPO_EMPRESA),
                WaitUntil.the(OPCION_CAMARA_SII,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_CAMARA_SII),
                Click.on(LISTA_ACTIVIDAD),
                WaitUntil.the(OPCION_ACTIVA,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_ACTIVA),
                Click.on(CAMPO_GRUPO),
                Enter.theValue("QA").into(CAMPO_GRUPO),
                Click.on(LISTA_CONTROL_USUARIO),
                WaitUntil.the(OPCION_TODOS_CONTROL_USUARIO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_TODOS_CONTROL_USUARIO),
                Click.on(LISTA_CONTROL_EXPEDIENTE),
                WaitUntil.the(OPCION_TODOS_CONTROL_EXPEDIENTE,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_TODOS_CONTROL_EXPEDIENTE),
                Click.on(LISTA_CONTROL_ESTADO),
                WaitUntil.the(OPCION_MA_CONTROL_ESTADO,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(OPCION_MA_CONTROL_ESTADO),
                Click.on(CAMPO_SCRIPT),
                Enter.theValue("QA").into(CAMPO_SCRIPT),
                Scroll.to(BOTON_GRABAR_AGREGAR_PERMISO_ESPECIAL),
                Click.on(BOTON_GRABAR_AGREGAR_PERMISO_ESPECIAL),
                Click.on(BOTON_ACEPTAR_GRABAR_AGREGAR_PERMISO_ESPECIAL),

                //ediatr
                WaitUntil.the(BOTON_EDITAR_PERMISO_ESPECIAL,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_EDITAR_PERMISO_ESPECIAL),
                Click.on(CAMPO_DESCRIPCION),
                Enter.theValue("QA1").into(CAMPO_DESCRIPCION),
                Scroll.to(BOTON_GRABAR_AGREGAR_PERMISO_ESPECIAL),
                Click.on(BOTON_GRABAR_AGREGAR_PERMISO_ESPECIAL),
                Click.on(BOTON_ACEPTAR_GRABAR_AGREGAR_PERMISO_ESPECIAL),


                //eliminar
                WaitUntil.the(BOTON_BORRAR_PERMISO_ESPECIAL,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_BORRAR_PERMISO_ESPECIAL),
                Click.on(BOTON_SI_BORRAR_PERMISO_ESPECIAL),
                Click.on(BOTON_ACEPTAR_GRABAR_AGREGAR_PERMISO_ESPECIAL)


        );
    }

    public static FlujoPermisosEspeciales flujoCompletoPermisoEspecial(){
        return new FlujoPermisosEspeciales();
    }
}
