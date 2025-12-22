package com.co.confecamaras.tasks.mantenimientoeinformes.empresas_cfe;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.mantenimientoeinformes.EmpresasCfePage.*;
import static com.co.confecamaras.utils.mantenimientoeinformes.EmpresasCFE.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LlenaInforme implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_NUEVA_ENTIDAD,isPresent()).forNoMoreThan(10).seconds(),
                Click.on(BOTON_NUEVA_ENTIDAD),
                Click.on(LISTA_TIPO_IDENTIFICACION),
                Click.on(OPCION_CEDULA),
                Click.on(CAMPO_IDENTIFICACION),
                Enter.theValue(NOMBRE).into(CAMPO_IDENTIFICACION),
                Click.on(LISTA_TIPO_PERSONA),
                Click.on(OPCION_PERSONA_NATURAL),
                Click.on(LISTA_CODIGO_CAMARA),
                Click.on(OPCION_MANIZALES),
                Click.on(CAMPO_RAZON_SOCIAL),
                Enter.theValue(NOMBRE).into(CAMPO_RAZON_SOCIAL),
                Click.on(CAMPO_NOMBRE_REGISTRADO),
                Enter.theValue(NOMBRE).into(CAMPO_NOMBRE_REGISTRADO),
                Click.on(CAMPO_PRIMER_NOMBRE),
                Enter.theValue(NOMBRE).into(CAMPO_PRIMER_NOMBRE),
                Click.on(CAMPO_SEGUNDO_NOMBRE),
                Enter.theValue(NOMBRE).into(CAMPO_SEGUNDO_NOMBRE),
                Click.on(CAMPO_PRIMER_APELLIDO),
                Enter.theValue(NOMBRE).into(CAMPO_PRIMER_APELLIDO),
                Click.on(CAMPO_SEGUNDO_APELLIDO),
                Enter.theValue(NOMBRE).into(CAMPO_SEGUNDO_APELLIDO),
                Click.on(CAMPO_PARTICULA),
                Enter.theValue(NOMBRE).into(CAMPO_PARTICULA),
                Click.on(CAMPO_CORREO),
                Enter.theValue(CORREO).into(CAMPO_CORREO),
                Click.on(CAMPO_TELEFONO_1),
                Enter.theValue(NUMERO).into(CAMPO_TELEFONO_1),
                Click.on(CAMPO_DIRECCION_COMERCIAL),
                Enter.theValue(CIRECCION_COMERCIAL).into(CAMPO_DIRECCION_COMERCIAL),
                Click.on(LISTA_MUNICIPIO),
                Click.on(OPCION_MANIZALES_MUNICIPIO),
                Click.on(CAMPO_DIRECCION_NOTIFICACION),
                Enter.theValue(CIRECCION_COMERCIAL).into(CAMPO_DIRECCION_NOTIFICACION),
                Click.on(LISTA_DIRECCION_MUNICIPIO),
                Click.on(OPCION_MANIZALES_DIRECCION_MUNICIPIO),
                Click.on(BOTON_GRABAR_)
        );

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static LlenaInforme informeEmpresasCFE(){
        return new LlenaInforme();
    }
}
