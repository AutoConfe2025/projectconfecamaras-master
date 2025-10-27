package com.co.confecamaras.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class MaestroAlcaldiasCaeUI extends PageObject {

    public static final Target BTN_EDITAR_ALCALDIAS_CAE = Target.the("Boton editar")
            .located(By.xpath("//a[text()='Editar']"));

    public static final Target BTN_GRABAR_REGISTRO_ALCALDIAS_CAE = Target.the("Boton grabar registro")
            .located(By.xpath("//input[@onmouseover=\"Tip('Grabar registro')\"]"));

    public static final Target BTN_BORRAR_ALCALDIAS_CAE = Target.the("Boton borrar")
            .located(By.xpath("//a[text()='Borrar']"));

    public static final Target BTN_ADICIONAR_REGISTRO_ALCALDIAS_CAE = Target.the("Boton adicionar registro")
            .located(By.xpath("//img[@onmouseover=\"Tip('Adicionar un registro')\"]"));

    public static final Target BTN_VER_LISTA_ALCALDIAS_CAE = Target.the("Boton adicionar registro")
            .located(By.xpath("//img[@onmouseover=\"Tip('Ver lista')\"]"));

    public static final Target BTN_CONSULTA_MUNICIPIOS_ALCALDIAS_CAE = Target.the("Boton consulta municipios")
            .located(By.xpath("//a[text()='17001']"));

    public static final Target TXT_PERSONA_RESPONSABLE_ALCALDIAS_CAE = Target.the("Escribir la persona responsable")
            .located(By.id("_nombreresponsable"));

    public static final Target TXT_CARGO_RESPONSABLE_ALCALDIAS_CAE = Target.the("Escribir el cargo responsable")
            .located(By.id("_cargoresponsable"));

    public static final Target SELECT_TIPO_WS_ALCALDIAS_CAE = Target.the("Seleccionar el tipo de ws")
            .located(By.id("_tipo"));

    public static final Target TXT_WS_ALCALDIAS_CAE = Target.the("Escribir el ws")
            .located(By.id("_ws"));

    public static final Target TXT_METODO_ALCALDIAS_CAE = Target.the("Escribir el metodo")
            .located(By.id("_wsmetodo"));

    public static final Target SELECT_CIFRADO_ALCALDIAS_CAE = Target.the("Seleccionar el cifrado")
            .located(By.id("_cifrado"));

    public static final Target SELECT_CUMPLE_ESTANDAR_ALCALDIAS_CAE = Target.the("Seleccionar si cumple estandar")
            .located(By.id("_cumpleestandar"));

    public static final Target SELECT_REQUIERE_AUTENTICACION_ALCALDIAS_CAE = Target.the("Seleccionar si requiere autenticacion")
            .located(By.id("_requiereautenticacion"));

    public static final Target TXT_USUARIO_ALCALDIAS_CAE = Target.the("Escribir el usuario")
            .located(By.id("_usuario"));

    public static final Target TXT_CONTRASENA_ALCALDIAS_CAE = Target.the("Escribir la contrasena")
            .located(By.id("_usuariocontrasena"));

    public static final Target TXT_EMAIL_ALCALDIAS_CAE = Target.the("Escribir el email")
            .located(By.id("_email"));

    public static final Target TXT_TELEFONO_FIJO_ALCALDIAS_CAE = Target.the("Escribir el telefono fijo")
            .located(By.id("_telefonofijo"));

    public static final Target TXT_NRO_CELULAR_ALCALDIAS_CAE = Target.the("Escribir el numero del celular")
            .located(By.id("_celular"));

    public static final Target TXT_INFORMA_CERTIFICADOS_ALCALDIAS_CAE = Target.the("Escribir informa certificados")
            .located(By.id("_informa"));

    public static final Target LBL_MAESTRO_ALCALDIAS_CAE = Target.the("Mensaje maestro alcaldias cae")
            .located(By.xpath("//td[contains(text(), ' Mantenimiento Alcaldías (Relación)')]"));
}