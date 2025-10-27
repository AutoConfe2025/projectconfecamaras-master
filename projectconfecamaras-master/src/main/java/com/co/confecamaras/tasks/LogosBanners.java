package com.co.confecamaras.tasks;

import com.co.confecamaras.interactions.FileUpload;
import com.co.confecamaras.interactions.WaitInteractions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static com.co.confecamaras.userinterfaces.CamaraComercioVeinte.*;
import static com.co.confecamaras.userinterfaces.LogosBannersUI.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class LogosBanners implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitInteractions.untilDisappears(ESPERA),
                WaitInteractions.untilBeEnable(BTN_MENU_LATERAL),
                Click.on(BTN_MENU_LATERAL),
                WaitInteractions.untilBeEnable(BTN_ASEGURAMIENTO_SII),
                Scroll.to(BTN_ASEGURAMIENTO_SII).andAlignToBottom(),
                JavaScriptClick.on(BTN_ASEGURAMIENTO_SII),
                WaitInteractions.untilAppears(BTN_MANTENIMIENTO_SII),
                Scroll.to(BTN_MANTENIMIENTO_SII).andAlignToBottom(),
                JavaScriptClick.on(BTN_MANTENIMIENTO_SII),
                WaitInteractions.untilAppears(BTN_LOGOS_BANNERS),
                Scroll.to(BTN_LOGOS_BANNERS).andAlignToBottom(),
                JavaScriptClick.on(BTN_LOGOS_BANNERS),
                Switch.toNewWindow(),
                WaitInteractions.untilAppears(BTN_SELECCIONAR_ARCHIVO_LOGOS_BANNERS),
                Scroll.to(BTN_SELECCIONAR_ARCHIVO_LOGOS_BANNERS).andAlignToBottom(),
                SendKeys.of(FileUpload.subirArchivo().firma()).into(BTN_SELECCIONAR_ARCHIVO_LOGOS_BANNERS),
                Scroll.to(BTN_CARGAR_LOGOS_BANNERS).andAlignToBottom(),
                Click.on(BTN_CARGAR_LOGOS_BANNERS),
                Scroll.to(BTN_CARGAR_LOGOS_BANNERS).andAlignToBottom()
        );
    }

    public static LogosBanners enConfecamaraSII(){
        return instrumented(LogosBanners.class);
    }
}