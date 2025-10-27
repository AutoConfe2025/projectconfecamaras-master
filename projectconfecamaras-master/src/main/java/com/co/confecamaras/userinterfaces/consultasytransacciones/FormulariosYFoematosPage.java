package com.co.confecamaras.userinterfaces.consultasytransacciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormulariosYFoematosPage {

    public static Target BTN_FORMULARIOS_Y_FORMATOS_EN_BLANCO = Target.the("Boton pára ingresar a la consulta de formatos y formularios en blanco")
            .located(By.xpath("/html/body/div[1]/main/div[1]/nav/div/div[2]/li/div/ul/li/div[1]/li/div/ul/li/li[13]/a"));

    public static Target BTN_FORMULARIO_EN_BLANCO_REGISTRO_MERCANTIL = Target.the("Boton pára ver formulario de registro mercatinl")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Formulario en blanco del Registro Mercantil(Persona Natural, Jurídica). Versión 2020' ]"));

    public static Target BTN_FORMULARIO_EN_BLANCO_MERCANTIL_ESTABLECIMEINTO = Target.the("Boton pára ver Formulario en blanco del Registro Mercantil(Establecimiento de comercio, Sucursal o Agencia)")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Formulario en blanco del Registro Mercantil(Establecimiento de comercio, Sucursal o Agencia)' ]"));

    public static Target BTN_FORMULARIO_EN_BLANCO_REGISTRO_ENTIDADES = Target.the("Boton pára ver formulario de egistro Mercantil(Establecimiento de comercio, Sucursal o Agencia")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Formulario en blanco del Registro Mercantil(Establecimiento de comercio, Sucursal o Agencia)' ]"));

    public static Target BTN_FORMULARIO_ANIOS_ANTERIORES_PERSONA = Target.the("Boton pára ver formulario persona natural")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Formulario años anteriores personas naturales y jurídicas' ]"));

    public static Target BTN_FORMULARIO_ANIOS_ANTERIORES_ESTABLECIMIENTO = Target.the("Boton pára ver formulario de establecimiento, sucursales")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Formulario años anteriores establecimientos, sucursales y agencias' ]"));

    public static Target BTN_PAGINAS_DEL_FORMULARIO_RUES = Target.the("Boton pára ver Páginas 1 y 2 del formulario RUES. Versión 2020")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Páginas 1 y 2 del formulario RUES. Versión 2020' ]"));

    public static Target BTN_ANEXO_DEL_REGISTRO = Target.the("Boton pára ver Anexo del Registro de Proponentes (5 páginas)")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Anexo del Registro de Proponentes (5 páginas)' ]"));

    public static Target BTN_FORMATO_DECRETO_DNP = Target.the("Boton pára ver Formato, Decreto 399 / 2021 DNP")
            .located(By.xpath("//a[@class='list-group-item ls-modal' and text() = 'Formato, Decreto 399 / 2021 DNP' ]"));

    public static Target BTN_CERRAR_FORMULARIO= Target.the("Boton CERRARr formulario")
            .located(By.cssSelector("#ModalInfo > div > div > div.modal-footer > button"));

    public static Target BTN_VER_FORMATOS= Target.the("Boton pára ver formulario de establecimiento, sucursales")
            .located(By.id("dropdownMenuButton"));

    public static Target TABLA_FORMATOS = Target.the("Tabla que muestra los formatos y dormylarios seleccionados")
            .located(By.xpath("//div[@class='dropdown-menu show']"));
}
