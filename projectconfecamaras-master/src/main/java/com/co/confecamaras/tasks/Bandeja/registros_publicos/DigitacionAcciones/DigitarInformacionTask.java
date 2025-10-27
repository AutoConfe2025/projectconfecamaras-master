package com.co.confecamaras.tasks.Bandeja.registros_publicos.DigitacionAcciones;

import com.co.confecamaras.interactions.News.SelectRandomOption;
import com.co.confecamaras.questions.Elementos.ElementoElegible;
import com.co.confecamaras.userinterfaces.Bandejas.registros_publicos.DigitacionPage;
import com.co.confecamaras.utils.constantes.bandeja.DigitarFormularioConstantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class DigitarInformacionTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(actor.asksFor(ElementoElegible.para(DigitacionPage.LINK_DIG_FORMULARIO))){
            actor.attemptsTo(
                    Click.on(DigitacionPage.LINK_DIG_FORMULARIO),
                    // DATOS GENERALES
                    Scroll.to(DigitacionPage.INP_MATRICULA),
                    Enter.theValue(DigitarFormularioConstantes.MATRICULA).into(DigitacionPage.INP_MATRICULA),
                    SelectFromOptions.byIndex(15).from(DigitacionPage.SLC_ORGANIZACION),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_CATEGORIA),
                    SelectFromOptions.byIndex(6).from(DigitacionPage.SLC_ESTADO_MATRICULA),
                    Enter.theValue(DigitarFormularioConstantes.FECHA_MATRICULA).into(DigitacionPage.INP_FECHA_MATRICULA),
                    // EXTINCION DE DOMINIO
                    Scroll.to(DigitacionPage.SLC_EXTINCION_DOMINIO),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_EXTINCION_DOMINIO),
                    // DATOS BASICOS
                    //Scroll.to(DigitacionRegMtilPage.SLC_DB_GENERO),
                    //SelectRandomOption.select(DigitacionRegMtilPage.SLC_DB_GENERO),
                    //Enter.theValue(DigitarFormularioConstantes.FECHA_NACIMIENTO).into(DigitacionRegMtilPage.INP_FECHA_NACIMIENTO),
                    //Enter.theValue(DigitarFormularioConstantes.FECHA_EXP_DOC).into(DigitacionRegMtilPage.INP_FECHA_EXP_DOC),
                    //Enter.theValue(DigitarFormularioConstantes.NACIONALIDAD).into(DigitacionRegMtilPage.INP_NACIONALIDAD),
                    Enter.theValue(DigitarFormularioConstantes.NIT).into(DigitacionPage.INP_NIT),
                    // EMPRENDIMIENTO SOCIAL
                    Scroll.to(DigitacionPage.SLC_EMP_SOCIAL),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_EMP_SOCIAL),
                    // DATOS DE UBICACION COMERCIAL
                    Scroll.to(DigitacionPage.SLC_UC_MUNICIPIO),
                    SelectRandomOption.select(DigitacionPage.SLC_UC_MUNICIPIO),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_UC_PAIS),
                    Enter.theValue(DigitarFormularioConstantes.TELEFONO).into(DigitacionPage.INP_UC_TELEFONO1),
                    SelectFromOptions.byIndex(2).from(DigitacionPage.SLC_UC_ZONA),
                    Enter.theValue(DigitarFormularioConstantes.EMAIL).into(DigitacionPage.INP_UC_EMAIL),
                    SelectFromOptions.byIndex(2).from(DigitacionPage.SLC_UC_UBICACION),
                    SelectFromOptions.byIndex(4).from(DigitacionPage.SLC_UC_SEDE),
                    // DATOS PARA NOTIFICACION JUDICIAL
                    Scroll.to(DigitacionPage.SLC_NJ_MUNICIPIO),
                    SelectRandomOption.select(DigitacionPage.SLC_NJ_MUNICIPIO),
                    Enter.theValue(DigitarFormularioConstantes.TELEFONO).into(DigitacionPage.INP_NJ_TELEFONO1),
                    SelectFromOptions.byIndex(2).from(DigitacionPage.SLC_NJ_ZONA),
                    Enter.theValue(DigitarFormularioConstantes.EMAIL).into(DigitacionPage.INP_NJ_EMAIL),
                    // NOTIFICAR A CORREOS ELECTRONICO
                    Scroll.to(DigitacionPage.SLC_AUTORIZACION),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_AUTORIZACION),
                    // INFORMACION FINANCIERA
                    Scroll.to(DigitacionPage.INP_ANYO_DATOS),
                    Enter.theValue(DigitarFormularioConstantes.ANYO_DATOS).into(DigitacionPage.INP_ANYO_DATOS),
                    Enter.theValue(DigitarFormularioConstantes.FECHA_DATOS).into(DigitacionPage.INP_FECHA_DATOS),
                    SelectRandomOption.select(DigitacionPage.SLC_GRUPO_NIFF),
                    // ACTIVIDAD ECONOMICA
                    Scroll.to(DigitacionPage.TXTA_ACT_ECONOMICA),
                    Enter.theValue(DigitarFormularioConstantes.TXT_TEST).into(DigitacionPage.TXTA_ACT_ECONOMICA),
                    Enter.theValue(DigitarFormularioConstantes.FECHA_INICIO).into(DigitacionPage.INP_FECHA_INICIO),
                    Enter.theValue(DigitarFormularioConstantes.FECHA_DATOS).into(DigitacionPage.INP_DATOS_FECHA),
                    // SEGURIDAD SOCIAL
                    Scroll.to(DigitacionPage.SLC_APORTANTE),
                    SelectFromOptions.byIndex(1).from(DigitacionPage.SLC_APORTANTE),
                    // GUARDAR INFORMACION
                    Scroll.to(DigitacionPage.BTN_GUARDAR),
                    Click.on(DigitacionPage.BTN_GUARDAR)
            );
        }
    }

    public static DigitarInformacionTask digitarInformacion() {
        return new DigitarInformacionTask();
    }
}
