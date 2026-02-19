package com.co.confecamaras.userinterfaces.renovaciones;

import net.serenitybdd.screenplay.targets.Target;

public class FlujoPjEstCajaPage {

    public static final Target LISTA_PERTENECE_GRUPO_ETNICO_PJ = Target.the("lista de si pertenece a un grupo etnico en especifico")
            .locatedBy("//select[@id='etnias_socios_participacion']");

    public static final Target CAMPO_ROM_GITANOS_PJ = Target.the("campo de ingreso rom gitanos")
            .locatedBy("//input[@id='etnias_socios_rom_participacion']");

    public static final Target CAMPO_RAZIAL_PJ = Target.the("campo de razial")
            .locatedBy("//input[@id='etnias_socios_raizal_participacion']");

    public static final Target CAMPO_PALENQUEROS_PJ = Target.the("campo de palenqueros")
            .locatedBy("//input[@id='etnias_socios_palenquero_participacion']");

    public static final Target CAMPO_NEGROS_PJ = Target.the("campo de negros")
            .locatedBy("//input[@id='etnias_socios_negro_participacion']");

    public static final Target CAMPO_AFRODECENDIENTES_PJ = Target.the("campo de afrodecendientes")
            .locatedBy("//input[@id='etnias_socios_afrodescendiente_participacion']");

    public static final Target CAMPO_INGIGENAS_PJ = Target.the("campo de indigenas")
            .locatedBy("//input[@id='etnias_socios_indigenas_participacion']");

    public static final Target CAMPO_CUAL_INDIGENAS_PJ = Target.the("campo de cual indigenas")
            .locatedBy("//input[@id='etnias_socios_indigenas_cual']");

    public static final Target LISTA_ETNICOS_SI_ADMINISTRATIVOS = Target.the("Lista de seleccion de si se tienen personas de grupos etnicos con cargo administrativo")
            .locatedBy("//select[@id='etnias_empleados_participacion']");

    public static final Target CAMPO_GITANOS_EMPLEADOS = Target.the("campo de empleados gitanos")
            .locatedBy("//input[@id='etnias_empleados_rom_participacion']");

    public static final Target CAMPO_RAZIAL_EMPLEADOS = Target.the("campo de empleados razial")
            .locatedBy("//input[@id='etnias_empleados_raizal_participacion']");

    public static final Target CAMPO_PALENQUEROS_EMPLEADOS = Target.the("campo de empleados palenqueros")
            .locatedBy("//input[@id='etnias_empleados_palenquero_participacion']");

    public static final Target CAMPO_NEGROS_EMPLEADOS = Target.the("campo de empleados negros")
            .locatedBy("//input[@id='etnias_empleados_negro_participacion']");

    public static final Target CAMPO_AFRODECENDINTES_EMPLEADOS = Target.the("campo de empleados afrodecendientes")
            .locatedBy("//input[@id='etnias_empleados_afrodescendiente_participacion']");

    public static final Target CAMPO_INDIGENAS_EMPLEADOS = Target.the("campo de empleados indigenas")
            .locatedBy("//input[@id='etnias_empleados_indigenas_participacion']");

    public static final Target CAMPO_CUAL_INDIGENAS_EMPLEADOS = Target.the("campo de cual empleados indigenas")
            .locatedBy("//input[@id='etnias_empleados_indigenas_cual']");

    public static final Target LISTA_ETNIA_DIRECTIVOS = Target.the("Lista de seleccion de si tiene etnia con administrativos")
            .locatedBy("//select[@id='etnias_cargdir_participacion']");
}
