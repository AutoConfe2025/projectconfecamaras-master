package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class NoticiasRegistrosPublicosPage {

    public static final Target CAMPO_FECHA_INICIAL = Target.the("Campo de ingreso de fecha inicial")
            .locatedBy("//input[@id='_calendario']");

    public static final Target BOTON_CONTINUAR_NOTICIA = Target.the("boton continuar noticia")
            .locatedBy("//input[@value='Continuar']");

    public static final Target BOTON_REGENERAR_SELLO = Target.the("boton regenerar sello")
            .locatedBy("//td[@align='center'][9]");

    public static final Target BOTON_CONSULTAR_LIBROS = Target.the("boton consultar")
            .locatedBy("//a[contains(text(),'Consultar')]");
}
