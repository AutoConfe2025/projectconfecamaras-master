package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class GrabarFormularioPersonaNaturalUI extends PageObject {

    public static final Target BTN_GRABAR_FORMULARIO_PERSONA_NATURAL = Target.the("Boton grabar formulario persona natural")
            .located(By.xpath("(//*[contains(text(), 'Grabar formulario')])[1]"));

    public static final Target SELECT_GENERO_NATURAL = Target.the("Seleccionar genero")
            .located(By.xpath("//select[@id=\"sexo\"]//option"));

    public static final Target SELECT_GENERO_DOS_NATURAL = Target.the("Seleccionar genero")
            .located(By.id("sexo"));

    public static final Target SELECT_LUGAR_EXPEDICION_NATURAL = Target.the("Seleccionar lugar de expedicion")
            .located(By.xpath("//select[@id=\"idmunidoc\"]//option"));

    public static final Target SELECT_LUGAR_EXPEDICION_DOS_NATURAL = Target.the("Seleccionar lugar de expedicion")
            .located(By.id("idmunidoc"));

    public static final Target SELECT_PAIS_EXPEDICION_NATURAL = Target.the("Seleccionar pais de expedicion")
            .located(By.xpath("//select[@id=\"paisexpdoc\"]//option"));

    public static final Target SELECT_PAIS_EXPEDICION_DOS_NATURAL = Target.the("Seleccionar pais de expedicion")
            .located(By.id("paisexpdoc"));

    public static final Target SELECT_EMPRENDIMIENTO_SOCIAL_NATURAL = Target.the("Seleccionar emprendimiento social")
            .located(By.xpath("//select[@id=\"emprendimientosocial\"]//option"));

    public static final Target SELECT_EMPRENDIMIENTO_SOCIAL_DOS_NATURAL = Target.the("Seleccionar emprendimiento social")
            .located(By.id("emprendimientosocial"));

    public static final Target BTN_GENERADOR_DIRECCIONES_NATURAL = Target.the("Boton generador direcciones")
            .located(By.xpath("(//button[contains(text(), 'Generador de direcciones')])[1]"));

    public static final Target SELECT_NOMENCALTURAS_NATURAL = Target.the("Seleccionar nomenclaturas")
            .located(By.xpath("//select[@id=\"viappaltipo\"]"));

    public static final Target SELECT_NOMENCALTURAS_DOS_NATURAL = Target.the("Seleccionar nomenclaturas")
            .located(By.id("viappaltipo"));

    public static final Target TXT_NOMBRE_VIAS_NATURAL = Target.the("Escribir nombre vias")
            .located(By.id("viappalnombre"));

    public static final Target TXT_NRO_NATURAL = Target.the("Escribir nro")
            .located(By.id("viappalnro"));

    public static final Target SELECT_LETRAS_NATURAL = Target.the("Seleccionar letras")
            .located(By.xpath("//select[@id=\"viappalletras\"]"));

    public static final Target SELECT_LETRAS_DOS_NATURAL = Target.the("Seleccionar letras")
            .located(By.id("viappalletras"));

    public static final Target BTN_TRASLADAR_DIRECCION_NATURAL = Target.the("Boton trasladar direccion")
            .located(By.xpath("//button[text() = 'Trasladar dirección al formulario']"));

    public static final Target MENU_DES_MUNICIPIO = Target.the("Menu desplegable Municipio")
            .located(By.id("muncom"));

    public static final Target SELECT_BARRIO_NATURAL_UNO = Target.the("Escribir barrio")
            .located(By.xpath("//select[@id=\"barriocom\"]//option"));

    public static final Target SELECT_BARRIO_NATURAL = Target.the("Escribir barrio")
            .located(By.xpath("//select[@id=\"barriocom\"]//option"));

    public static final Target SELECT_BARRIO_DOS_NATURAL = Target.the("Escribir barrio")
            .located(By.id("barriocom"));

    public static final Target TXT_TELEFONO_UNO_NATURAL = Target.the("Escribir telefono uno")
            .located(By.id("telcom1"));

    public static final Target TXT_TELEFONO_DOS_NATURAL = Target.the("Escribir telefono dos")
            .located(By.id("telcom2"));

    public static final Target SELECT_ZONA_NATURAL = Target.the("Escribir zona")
            .located(By.xpath("//select[@id=\"codigozonacom\"]//option"));

    public static final Target SELECT_ZONA_DOS_NATURAL = Target.the("Escribir zona")
            .located(By.id("codigozonacom"));

    public static final Target TXT_CORREO_ELECTRONICO_NATURAL = Target.the("Escribir correo electronico")
            .located(By.id("emailcom"));

    public static final Target SELECT_UBICACION_NATURAL = Target.the("Escribir ubicacion")
            .located(By.xpath("//select[@id=\"ctrubi\"]//option"));

    public static final Target SELECT_UBICACION_DOS_NATURAL = Target.the("Escribir ubicacion")
            .located(By.id("ctrubi"));

    public static final Target SELECT_SEDE_NATURAL = Target.the("Escribir sede")
            .located(By.xpath("//select[@id=\"tiposedeadm\"]//option"));

    public static final Target SELECT_SEDE_DOS_NATURAL = Target.the("Escribir sede")
            .located(By.id("tiposedeadm"));

    public static final Target BTN_DUPLICAR_NATURAL = Target.the("Boton duplicar")
            .located(By.xpath("//*[contains(text(), 'Duplicar desde dirección comercial')]"));

    public static final Target SELECT_AUTORIZACION_NATURAL = Target.the("Seleccionar autorizacion")
            .located(By.xpath("//select[@id=\"ctrmennot\"]//option"));

    public static final Target SELECT_AUTORIZACION_DOS_NATURAL = Target.the("Seleccionar autorizacion")
            .located(By.id("ctrmennot"));

    public static final Target TXT_ACTIVOS_CORRIENTES_NATURAL = Target.the("Escribir activos corrientes")
            .located(By.id("actcte_2025"));

    public static final Target TXT_PATRIMONIO_NATURAL = Target.the("Escribir patrimonio")
            .located(By.id("pattot_2025"));

    public static final Target TXT_INGRESOS_OPERACIONALES_NATURAL = Target.the("Escribir ingresos operacionales")
            .located(By.id("ingope_2025"));

    public static final Target SELECT_GRUPO_NIIF_NATURAL = Target.the("Seleccionar grupo niif")
            .located(By.xpath("//select[@id=\"gruponiif\"]//option"));

    public static final Target SELECT_GRUPO_NIIF_DOS_NATURAL = Target.the("Seleccionar grupo niif")
            .located(By.id("gruponiif"));

    public static final Target TXT_ACTIVIDAD_ECONOMICA_NATURAL = Target.the("Escribir actividad economica")
            .located(By.id("desactiv"));

    public static final Target BTN_CIUU_NATURAL = Target.the("Boton ciiu")
            .located(By.xpath("(//label[@for='ciiu1']//a)[1]"));

    public static final Target TXT_CONSULTA_NATURAL = Target.the("Escribir consulta")
            .located(By.id("textobuscar"));

    public static final Target BTN_CONSULTA_NATURAL = Target.the("Boton consulta")
            .located(By.xpath("//*[contains(text(), 'Consultar')]"));

    public static final Target BTN_CONSULTA_G4761_NATURAL = Target.the("Boton consulta G4761")
            .located(By.xpath("(//p[@class=\"text-dark \"]//a)[3]"));

    public static final Target TXT_FECHA_INICIO_NATURAL = Target.the("Escribir fecha de inicio")
            .located(By.id("feciniact1"));

    public static final Target SELECT_GENERA_CIIU_NATURAL = Target.the("Seleccionar genera ciiu")
            .located(By.xpath("//select[@id=\"maying1\"]//option"));

    public static final Target SELECT_GENERA_CIIU_DOS_NATURAL = Target.the("Seleccionar genera ciiu")
            .located(By.id("maying1"));

    public static final Target SELECT_ES_APORTANTE_NATURAL = Target.the("Seleccionar es aportante")
            .located(By.xpath("//select[@id=\"aportantesegsocial\"]//option"));

    public static final Target SELECT_ES_APORTANTE_DOS_NATURAL = Target.the("Seleccionar es aportante")
            .located(By.id("aportantesegsocial"));

    public static final Target SELECT_QUE_TIPO_ES_NATURAL = Target.the("Seleccionar que tipo es")
            .located(By.xpath("//select[@id=\"tipoaportantesegsocial\"]//option"));

    public static final Target SELECT_QUE_TIPO_ES_DOS_NATURAL = Target.the("Seleccionar que tipo es")
            .located(By.id("tipoaportantesegsocial"));

    public static final Target BTN_GRABAR_NATURAL = Target.the("Boton grabar")
            .located(By.id("submit"));

    public static final Target BTN_REPOSNSABILIDADES_TRIBUTARIAS_NATURAL = Target.the("Boton responsabilidades tributarias")
            .located(By.xpath("//a[@href=\"javascript:seleccionarResponsabilidades('1');\"]"));

    public static final Target BTN_NO_RESPONSABLE_IVA_NATURAL = Target.the("Boton no responsable de iva")
            .located(By.xpath("//*[@id=\"modal900_body\"]/div/div/table/tbody/tr/td[2]/a[11]"));

    public static final Target BTN_OK_NATURAL = Target.the("Boton ok")
            .located(By.xpath("//button[contains(text(), 'OK')]"));
}
