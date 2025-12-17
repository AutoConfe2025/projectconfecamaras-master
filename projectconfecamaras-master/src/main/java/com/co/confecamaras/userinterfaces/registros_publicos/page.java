package com.co.confecamaras.userinterfaces.registros_publicos;

import net.serenitybdd.screenplay.targets.Target;

public class page {
    public static final Target BOTON_NUEVO_SERVICIO = Target.the("boton de agregar un nuevo servicio")
            .locatedBy("//button[@class='btn btn-primary mb-2 add_servicio']");

    public static final Target CAMPO_INPUT_GEN = Target.the("campo de servicio")
            .locatedBy("(//input[@class='form-control p-inputtext p-component'])[1]");

    public static final Target LISTA_RUTA = Target.the("lista de la ruta")
            .locatedBy("(//select[@id='ruta'])");

    public static final Target OPCION_01_RUTA = Target.the("opcion de ruta 01")
            .locatedBy("(//option[@value='01'])[1]");

    public static final Target LISTA_BASE_CALCULO = Target.the("lista seleccion base de calculo")
            .locatedBy("//select[@id='tipobase']");

    public static final Target OPCION_ACTIVOS_BASE_CALCULO = Target.the("opcion activos de base de calculo")
            .locatedBy("//option[@value='activos']");

    public static final Target LISTA_APLICA_1429 = Target.the("lista de aplica ley 1429")
            .locatedBy("//select[@id='aplica1429']");

    public static final Target OPCION_LISTA_APLICA_1429 = Target.the("opcion de lista de aplica ley 1429")
            .locatedBy("(//option[@value='N'])[1]");

    public static final Target LISTA_CLASE_VALOR = Target.the("lista de clase valor")
            .locatedBy("//select[@id='claseValor']");

    public static final Target OPICION_FIJO_LISTA_CLASE_VALOR = Target.the("opcion fijo lista clase valor")
            .locatedBy("(//option[@value='1'])[1]");

    public static final Target LISTA_TIPO_VALOR = Target.the("Lista de tipo valor")
            .locatedBy("//select[@id='tipoValor']");

    public static final Target OPCION_PUBLICO_LISTA_TIPO_VALOR = Target.the("opcion publico en lista de tipo valor")
            .locatedBy("(//option[@value='1'])[2]");

    public static final Target LISTA_RECIBO_TARJETA = Target.the("lista de recibe tarjeta")
            .locatedBy("//select[@id='idrecibetarjeta']");

    public static final Target OPCION_NO_LISTA_RECIBO_TARJETA = Target.the("opcion no de lista de recibe tarjeta")
            .locatedBy("(//option[@value='N'])[2]");

    public static final Target LISTA_ES_IVA = Target.the("lista de si es iva o no")
            .locatedBy("//select[@id='idesiva']");

    public static final Target OPCION_NO_LISTA_ES_IVA = Target.the("Opcion no de si es iva")
            .locatedBy("(//option[@value='N'])[3]");

    public static final Target LISTA_MOSTRABLE_AL_CAJERO = Target.the("lista mostrable al cajero")
            .locatedBy("//select[@id='idmostrablealcajero']");

    public static final Target OPCION_NO_LISTA_MOSTRABLE_AL_CAJERO = Target.the("Opcion no de LISTA MOSTRABLE AL CAJERO")
            .locatedBy("(//option[@value='N'])[4]");

    public static final Target LISTA_GRUPO_VENTAS = Target.the("lista grupo de ventas")
            .locatedBy("//select[@id='grupoventas']");

    public static final Target OPCION_NO_LISTA_GRUPO_VENTAS = Target.the("opcion no se asocia grupo de ventas")
            .locatedBy("(//option[@value='00'])[1]");

    public static final Target LISTA_INDICADOR_CUANTIA = Target.the("lista indicador cuantia")
            .locatedBy("//select[@id='idindicadorcuantia']");

    public static final Target OPCION_LISTA_INDICADOR_CUANTIA = Target.the("opcion con cuantia")
            .locatedBy("(//option[@value='1'])[3]");

    public static final Target LISTA_PRIMA_COLOCACION_ACCIONES = Target.the("lista colocacion de acciones")
            .locatedBy("//select[@id='esprimacolocacionacciones']");

    public static final Target OPCION_LISTA_PRIMA_COLOCACION_ACCIONES = Target.the("opcion con no colocacion de acciones")
            .locatedBy("(//option[@value='N'])[7]");

    public static final Target LISTA_CONCEPTO_DEPARTAMENTAL = Target.the("lista concepto departamental")
            .locatedBy("//select[@id='conceptodepartamental']");

    public static final Target OPCION_LISTA_CONCEPTO_DEPARTAMENTAL = Target.the("opcion no se asocia concepto departamental")
            .locatedBy("(//option[@value='01'])[4]");

    public static final Target CAMPO_CENTRO_COSTOS_PRIVADO = Target.the("campo de centro de costos privado")
            .locatedBy("(//input[@class='form-control p-inputtext p-component'])[2]");

    public static final Target CAMPO_FECHA_INICIAL = Target.the("campo fecha inicial")
            .locatedBy("//input[@id='fechainicial']");

    public static final Target CAMPO_FECHA_FINAL = Target.the("campo fecha final")
            .locatedBy("//input[@id='fechafinal']");

    public static final Target LISTA_FACTURABLE_ELECTRONICAMENTE = Target.the("lista facturable electronicamente")
            .locatedBy("//select[@id='facturable_electronicamente']");

    public static final Target OPCION_LISTA_FACTURABLE_ELECTRONICAMENTE = Target.the("opcion no facturable electronicamente")
            .locatedBy("//option[@value='NO']");

    public static final Target LISTA_HOMOLOGACION_RUES = Target.the("lista homologacion RUES")
            .locatedBy("//select[@id='homologarues']");

    public static final Target OPCION_LISTA_HOMOLOGACION_RUES = Target.the("opcion matricula agencia")
            .locatedBy("//option[@value='01040400']");

    public static final Target LISTA_SERVICIO_GRAVADO_1 = Target.the("lista servicio gravado 1")
            .locatedBy("//select[@id='idgravado1']");

    public static final Target OPCION_LISTA_SERVICIO_GRAVADO_1 = Target.the("opcion ingresos publicos")
            .locatedBy("(//option[@value='01000000'])[2]");

    public static final Target LISTA_SERVICIO_DEPENDIENTE_1 = Target.the("lista servicio dependiente 1")
            .locatedBy("//select[@id='iddependiente1']");

    public static final Target OPCION_LISTA_SERVICIO_DEPENDIENTE_1 = Target.the("opcion ingresos publicos")
            .locatedBy("(//option[@value='01000000'])[9]");

    public static final Target BOTON_GRABAR = Target.the("boton de grabar")
            .locatedBy("//button[@class='btn btn-primary mt-3']");

    public static final Target BOTON_ACEPTAR = Target.the("boton aceptar")
            .locatedBy("//button[@class='swal2-confirm swal2-styled']");

    public static final Target BOTON_NIIF = Target.the("boton niif")
            .locatedBy("(//button[@class='btn btn-outline-primary param_niff'])[1]");

    public static final Target BOTON_EDITAR_NIIF = Target.the("boton editar niif")
            .locatedBy("(//span[@class='text-primary font-weight-bold'])[1]");

    public static final Target LISTA_DEBITO = Target.the("lista debito")
            .locatedBy("//select[@id='debito']");

    public static final Target OPCION_ACTIVOLISTA_DEBITO = Target.the("opcion activo lista debito")
            .locatedBy("(//option[@value='1'])[1]");

    public static final Target LISTA_CREDITO = Target.the("lista credito")
            .locatedBy("//select[@id='credito']");

    public static final Target OPCION_ACTIVO_LISTA_CREDITO = Target.the("opcion activo lista credito")
            .locatedBy("(//option[@value='1'])[2]");

    public static final Target BOTON_REGRESAR = Target.the("boton de regresar")
            .locatedBy("(//button[@class='btn btn-primary m-2 '])[2]");

    public static final Target BOTON_BORRAR_OPERADORES = Target.the("boton de borrar operadores")
            .locatedBy("(//button[@class='btn btn-primary m-2 '])[1]");

    public static final Target BOTON_SI_BORRAR_OPERADORES = Target.the("boton si borrar operadores")
            .locatedBy("(//button[@class='swal2-confirm swal2-styled'])[1]");

    public static final Target BOTON_EDITAR_ACCION = Target.the("boton editar")
            .locatedBy("(//button[@class='btn btn-outline-primary mr-2 update_servicio'])[1]");

    public static final Target LISTA_CERTIFICADO_ASOCIADO = Target.the("lista certificado asociado")
            .locatedBy("//select[@id='tipocertificado']");

    public static final Target OPCION_CERESADL_LISTA_CERTIFICADO_ASOCIADO = Target.the("opcion CerEsadl lista certificado asociado")
            .locatedBy("//option[@value='CerEsadl']");


    public static final Target BOTON_ELIMINAR = Target.the("boton de eliminar servicio")
            .locatedBy("(//button[@class='btn btn-outline-danger mr-2 delete_servicio'])[1]");



}
