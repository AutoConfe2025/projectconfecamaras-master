package com.co.confecamaras.navigation;

import com.co.confecamaras.interactions.News.LogEvent;
import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable confecamarasHomePage() {
        return Task.where("{0} opens the Confecamaras home page",
                Open.browserOn().the(ConfecamarasHomePage.class), LogEvent.recordevent(Reportes.INFO,"*** Inicializando navegador"));
    }
}
