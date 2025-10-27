package com.co.confecamaras.tasks;


import com.co.confecamaras.interactions.WaitConstantTwo;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import net.serenitybdd.screenplay.waits.WaitUntil;
import com.co.confecamaras.userinterfaces.LoginSistema;


public class DoLogin {
    public static Performable login(String mail, String numIdentificacion, String clave){
        return Task.where("",
                WaitUntil.the(LoginSistema.BUSQUEDA_INPUT, WebElementStateMatchers.isEnabled()),
                Enter.theValue("20").into(LoginSistema.BUSQUEDA_INPUT),
                WaitConstantTwo.esperaConstante(),
                WaitUntil.the(LoginSistema.CAMARA_IMG, WebElementStateMatchers.isClickable()),
                Click.on(LoginSistema.CAMARA_IMG),
                Enter.theValue(mail).into(LoginSistema.CORREO_INPUT),
                Enter.theValue(numIdentificacion).into(LoginSistema.IDENTIFICACION_INPUT),
                Enter.theValue(clave).into(LoginSistema.CLAVE_INPUT),
                Click.on(LoginSistema.INGRESAR_BTN)
        ).with("").of(mail);
    }
}
