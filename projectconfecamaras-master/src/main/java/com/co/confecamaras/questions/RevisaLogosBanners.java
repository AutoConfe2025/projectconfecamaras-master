package com.co.confecamaras.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.confecamaras.userinterfaces.LogosBannersUI.*;

public class RevisaLogosBanners implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean imagenLogosBanners = LBL_LOGOS_BANNERS.resolveFor(actor).isVisible();
        return imagenLogosBanners;
    }

    public static RevisaLogosBanners enConfecamaraSII(){
        return new RevisaLogosBanners();
    }
}