package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.GetSessionID;
import com.co.confecamaras.interactions.WaitConstant;
import com.co.confecamaras.userinterfaces.Actualizar;
import com.co.confecamaras.userinterfaces.RutaDocumentos;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import com.co.confecamaras.interactions.WaitInteractions;
import com.co.confecamaras.userinterfaces.LoginSistema;
import com.co.confecamaras.userinterfaces.MenuSistema;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.confecamaras.userinterfaces.MenuSistema.*;

public class DoMenu {
    public static Performable menu(){
        return Task.where("",
                WaitInteractions.untilDisappears(MenuSistema.ESPERA),
                WaitConstant.esperaConstante(),
                WaitUntil.the(CRITERIO_INPUT, WebElementStateMatchers.isPresent()),
                GetSessionID.session()
        ).with("").of("");
    }
}
