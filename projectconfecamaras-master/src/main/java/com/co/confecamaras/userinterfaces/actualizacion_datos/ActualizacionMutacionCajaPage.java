package com.co.confecamaras.userinterfaces.actualizacion_datos;

import net.serenitybdd.screenplay.targets.Target;

public class ActualizacionMutacionCajaPage {

    public static final Target BOTON_ACTUALIZACION_DATOS = Target.the("Opcion de lista actualizacion de datos")
            .locatedBy("(//div[@class='p-card-content'])[10]");

    public static final Target CAMPO_DIRECCION = Target.the("campo de ingreso de direccion")
            .locatedBy("//textarea[@id='dircom']");

    public static final Target CAMPO_TELEFONO_1 = Target.the("campo de ingreso de telefono 1")
            .locatedBy("//input[@id='telcom1']");

    public static final Target CAMPO_CELULAR = Target.the("campo de ingreso de celular")
            .locatedBy("//input[@id='celcom']");

    public static final Target BOTON_BUSQUEDA_CIIU_2 = Target.the("boton buscar ciiu 2")
            .locatedBy("(//button[@data-id='ciiu2'])[1]");

    public static final Target CAMPO_BUSQUEDA_CIIU_2 = Target.the("campo de ingreso de celular")
            .locatedBy("//input[@class='w-100 p-inputtext p-component']");

    public static final Target BOTON_REALIZAR_BUSQUEDA_CIIU_2 = Target.the("boton realizar buscar ciiu 2")
            .locatedBy("//span[@class='pi pi-search accionCursor p-input-icon']");

    public static final Target PRIMER_OPCION_BUSQUEDA_CIIU_2 = Target.the("primer opcion busqueda ciiu 2")
            .locatedBy("(//span[@class='p-accordion-header-text'])[1]");

    public static final Target BOTON_AGREGAR_CIIU_2 = Target.the("boton para agregar ciiu2 uno")
            .locatedBy("(//button[@class='btn btn-outline-primary'])[1]");

    public static final Target BOTON_SI_AGREGAR_CIIU_2 = Target.the("boton de si para agregar ciiu2 uno")
            .locatedBy("(//button[@class='swal2-confirm swal2-styled'])[1]");

    public static final Target BOTON_LIQUIDAR_MUTACION = Target.the("boton de liquidar")
            .locatedBy("//button[@id='btnLiquidar']");

    public static final Target BOTON_VER_SOPORTE_MUTACION = Target.the("boton de ver soporte de la mutacion")
            .locatedBy("//button[@id='btnSoporte']");

    public static final Target BOTON_CERRAR_SOPORTE_MUTACION = Target.the("boton de cerrar soporte de la mutacion")
            .locatedBy("//button[@class='p-dialog-header-icon p-dialog-header-close p-link']");

    public static final Target BOTON_RECIBIR_PAGO_MUTACION = Target.the("boton de recibir el pago de la mutacion")
            .locatedBy("//button[@id='btnRpago']");
}
