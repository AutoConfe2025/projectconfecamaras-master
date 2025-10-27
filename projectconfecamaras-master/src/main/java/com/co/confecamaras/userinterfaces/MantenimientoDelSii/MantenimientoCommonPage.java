package com.co.confecamaras.userinterfaces.MantenimientoDelSii;

import net.serenitybdd.screenplay.targets.Target;

public class MantenimientoCommonPage {
    public static Target TITULOS_SECCIONES = Target.the("titulos de cada seccion id").locatedBy("#tituloGrupo");
    public static Target TITULO = Target.the("titulo inicial").locatedBy("//td[contains(text(),'Mantenimiento al Common')]");
}
