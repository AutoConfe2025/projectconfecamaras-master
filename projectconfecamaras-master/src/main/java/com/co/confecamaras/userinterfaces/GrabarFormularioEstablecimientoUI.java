package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class GrabarFormularioEstablecimientoUI extends PageObject {

    public static final Target BTN_GRABAR_FORMULARIO_ESTABLECIMIENTO = Target.the("Boton grabar formulario establecimiento")
            .located(By.xpath("(//*[contains(text(), 'Grabar formulario')])[1]"));

    public static final Target BTN_GENERADOR_DIRECCIONES_ESTABLECIMIENTO = Target.the("Boton generador direcciones")
            .located(By.xpath("(//button[contains(text(), 'Generador de direcciones')])[1]"));

    public static final Target SELECT_NOMENCALTURAS_ESTABLECIMIENTO = Target.the("Seleccionar nomenclaturas")
            .located(By.xpath("//select[@id=\"viappaltipo\"]"));

    public static final Target TXT_NOMBRE_VIAS_ESTABLECIMIENTO = Target.the("Escribir nombre vias")
            .located(By.id("viappalnombre"));

    public static final Target TXT_NRO_ESTABLECIMIENTO = Target.the("Escribir nro")
            .located(By.id("viappalnro"));

    public static final Target SELECT_LETRAS_ESTABLECIMIENTO = Target.the("Seleccionar letras")
            .located(By.xpath("//select[@id=\"viappalletras\"]"));

    public static final Target BTN_TRASLADAR_DIRECCION_ESTABLECIMIENTO = Target.the("Boton trasladar direccion")
            .located(By.xpath("//button[text() = 'Trasladar dirección al formulario']"));

    public static final Target SELECT_MUNICIPIO_ESTABLECIMIENTO = Target.the("Seleccionar municipio")
            .located(By.xpath("//select[@id=\"muncom\"]//option"));

    public static final Target SELECT_BARRIO_ESTABLECIMIENTO = Target.the("Escribir barrio")
            .located(By.xpath("//select[@id=\"barriocom\"]"));

    public static final Target TXT_TELEFONO_UNO_ESTABLECIMIENTO = Target.the("Escribir telefono uno")
            .located(By.id("telcom1"));

    public static final Target TXT_TELEFONO_DOS_ESTABLECIMIENTO = Target.the("Escribir telefono dos")
            .located(By.id("telcom2"));

    public static final Target SELECT_ZONA_ESTABLECIMIENTO = Target.the("Escribir zona")
            .located(By.xpath("//select[@id=\"codigozonacom\"]//option"));

    public static final Target TXT_CORREO_ELECTRONICO_ESTABLECIMIENTO = Target.the("Escribir correo electronico")
            .located(By.id("emailcom"));

    public static final Target SELECT_UBICACION_ESTABLECIMIENTO = Target.the("Escribir ubicacion")
            .located(By.xpath("//select[@id=\"ctrubi\"]//option"));

    public static final Target TXT_PERSONAL_OCUPADO_ESTABLECIMIENTO = Target.the("Escribir personal ocupado")
            .located(By.id("personal_2025"));

    public static final Target TXT_VALOR_ESTABLECIMIENTO = Target.the("Escribir Valor del Establecimiento")
            .located(By.id("actvin_2025"));

    public static final Target SELECT_TIPO_LOCAL_ESTABLECIMIENTO = Target.the("Escribir tipo local")
            .located(By.xpath("//select[@id=\"tipolocal\"]//option"));

    public static final Target TXT_ACTIVIDAD_ECONOMICA_ESTABLECIMIENTO = Target.the("Escribir actividad economica")
            .located(By.id("desactiv"));

    public static final Target BTN_CIUU_ESTABLECIMIENTO = Target.the("Boton ciiu")
            .located(By.xpath("(//label[@for='ciiu1']//a)[1]"));

    public static final Target TXT_CONSULTA_ESTABLECIMIENTO = Target.the("Escribir consulta")
            .located(By.id("textobuscar"));

    public static final Target BTN_CONSULTA_ESTABLECIMIENTO = Target.the("Boton consulta")
            .located(By.xpath("//*[contains(text(), 'Consultar')]"));

    public static final Target BTN_CONSULTA_G4761_ESTABLECIMIENTO = Target.the("Boton consulta G4761")
            .located(By.xpath("(//p[@class=\"text-dark \"]//a)[3]"));

    public static final Target SELECT_CAMARA_COMERCIO_ESTABLECIMIENTO = Target.the("Seleccionar camara comercio")
            .located(By.xpath("//select[@id=\"prop_1_camarapropietario\"]//option"));

    public static final Target TXT_MATRICULA_ESTABLECIMIENTO = Target.the("Escribir matricula")
            .located(By.id("prop_1_matriculapropietario"));

    public static final Target SELECT_ORGANIZACION_JURIDICA_ESTABLECIMIENTO = Target.the("Seleccionar organizacion juridica")
            .located(By.xpath("//select[@id=\"prop_1_organizacionpropietario\"]//option"));

    public static final Target TXT_DIRECCION_COMERCIAL_ESTABLECIMIENTO = Target.the("Escribir direccion comercial")
            .located(By.id("prop_1_direccionpropietario"));

    public static final Target SELECT_MUNICIPIO_COMERCIAL_ESTABLECIMIENTO = Target.the("Seleccionar municipio comercial")
            .located(By.xpath("//select[@id=\"prop_1_municipiopropietario\"]//option"));

    public static final Target TXT_DIRECCION_NOTIFICACION_ESTABLECIMIENTO = Target.the("Escribir direccion notificacion")
            .located(By.id("prop_1_direccionnotpropietario"));

    public static final Target SELECT_MUNICIPIO_NOTIFICACION_ESTABLECIMIENTO = Target.the("Seleccionar municipio notificacion")
            .located(By.xpath("//select[@id=\"prop_1_municipionotpropietario\"]"));

    public static final Target TXT_FIJO_ESTABLECIMIENTO = Target.the("Escribir fijo")
            .located(By.id("prop_1_telefonopropietario"));

    public static final Target TXT_CELULAR_ESTABLECIMIENTO = Target.the("Escribir celular")
            .located(By.id("prop_1_telefono2propietario"));

    public static final Target BTN_GRABAR_ESTABLECIMIENTO = Target.the("Boton grabar")
            .located(By.id("submit"));

    public static final Target BTN_OK_ESTABLECIMIENTO = Target.the("Boton ok")
            .located(By.xpath("//button[contains(text(), 'OK')]"));

    public static final Target BTN_RECIBIR_PAGO_ESTABLECIMIENTO = Target.the("Boton recibir pago")
            .located(By.xpath("//button[contains(text(), 'Recibir pago')]"));
}
