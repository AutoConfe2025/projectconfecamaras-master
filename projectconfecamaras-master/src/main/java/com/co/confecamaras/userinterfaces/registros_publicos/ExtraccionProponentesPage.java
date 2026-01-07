package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class ExtraccionProponentesPage {

    public static final Target LISTA_ESTADOS = Target.the("Lista de estado")
            .locatedBy("//select[@id='_estado']");

    public static final Target OPCION_ACTIVOS = Target.the("opcion activos")
            .locatedBy("//option[contains(text(),'Activos')]");

    public static final Target LISTA_INCLUIR_HABILIDADES = Target.the("Lista de incluir habilidades")
            .locatedBy("//select[@id='_incluirinhabilidad']");

    public static final Target OPCION_NO_INCLUIR_HABILIDADES = Target.the("opcion no incluir inhabilidades")
            .locatedBy("//option[contains(text(),'NO')]");

    public static final Target CAMPO_EMAIL_CONTROL = Target.the("campo correo electronico control")
            .locatedBy("//input[@id='_emailusuariosistema']");

    public static final Target BOTON_GENERAR_EXTRACCION =Target.the("campo correo electronico control")
            .locatedBy("//button[contains(text(),'Generar')]");
}
