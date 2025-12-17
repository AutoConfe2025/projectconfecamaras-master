package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class AdministracionTablas {

    public static final Target BOTON_NUEVA_TABLA = Target.the("boton nueva tabla")
            .locatedBy("//button[@class='btn btn-secondary btn-lg']");

    public static final Target CAMPO_TABLA = Target.the("campo tabla")
            .locatedBy("(//input[@class='form-control border-danger'])[1]");

    public static final Target CAMPO_NOMBRE = Target.the("campo tabla")
            .locatedBy("(//input[@class='form-control border-danger'])[2]");

    public static final Target CAMPO_DESCRIPCION = Target.the("campo descripcion")
            .locatedBy("//textarea[@class='form-control border-danger']");

    public static final Target BOTON_GRABAR_TABLA = Target.the("boton grabar tabla")
            .locatedBy("(//button[@class='btn btn-primary btn-md'])[1]");

    public static final Target BOTON_EDITAR = Target.the("boton de editar")
            .locatedBy("(//a[@data-original-title='Editar'])[1]");

    public static final Target CAMPO_FUENTE = Target.the("campo fuente")
            .locatedBy("(//input[@class='form-control'])[1]");

    public static final Target CAMPO_FFUENTE_CAMPOS = Target.the("campo fuente campos")
            .locatedBy("(//input[@class='form-control'])[2]");

    public static final Target CAMPO_ARCHIVO_GENERAR = Target.the("campo archivo a generar")
            .locatedBy("(//input[@class='form-control'])[3]");

    public static final Target CAMPO_1 = Target.the("campo 1")
            .locatedBy("(//input[@class='form-control'])[4]");

    public static final Target BOTON_TRUNCAR_CONTENIDO = Target.the("boton de truncar contenido")
            .locatedBy("(//a[@data-original-title='Truncar contenido tabla'])[1]");

    public static final Target BOTON_BORRAR_TRUNCAR_CONTENIDO = Target.the("boton borrar de truncar contenido")
            .locatedBy("//button[@class='btn btn-success']");

    public static final Target BOTON_CARGAR_TABLA = Target.the("boton de cargar tabla")
            .locatedBy("(//a[@data-original-title='Cargar tabla'])[1]");

    public static final Target BOTON_ELIMINAR = Target.the("boton de eliminar")
            .locatedBy("(//a[@data-original-title='Borrar tabla del índice'])[1]");
}
