package com.co.confecamaras.utils;

import net.serenitybdd.screenplay.Actor;

public class Constantes {

    private Constantes(){}
    
    public static final Actor ANDREY = Actor.named("Andrey");
    public static final Actor TESTER = Actor.named("Tester");
    public static final Actor TESTER_UNO = Actor.named("Tester_uno");
    public static final Actor CONFECAMARAS = Actor.named("Confecamaras");
    public static final String INFO_DB_CONFECAMARAS = "srv-sii-bd-qa-cluster.cnmdad2ablmj.us-east-1.rds.amazonaws.com/sii_manizales";

    public static final String RECIBO = "Recibo";
    public static final String CLIENTE = "Cliente";
    public static final String ESTADO_ACTUAL = "09 - REINGRESADO";
    public static final String NUEVO_ESTADO = "Nuevo estado : 23 - ASIGNADO A DIGITADOR";
    public static final String CUENTA_PUBLICA = "1305989";
    public static final String CUENTA_PUBLICA_DOS = "1305981";
    public static final String MATRICULA = "9000100056";
    public static final String FINEST = "25";
    public static final String FINESTDOS = "23";
    public static final String PASO_UNO = "Importar Formulario VUE";
    public static final String PASO_UNO_FINAL = "Seleccione...";
    public static final String TIPO_MOTIVO = "FR.- Forma";
    public static final String TIPO_MOTIVO_FINAL = "NP.- No procedencia";
    public static final String DESCRIPCION = "SOCIO CAPITALISTA";
    public static final String TITULO_CESACION = "Aplicar cesación";
    public static final String RELACION_MOVIMIENTOS_RECIBO = "Relación de movimientos por recibo";
    public static final String VER_DOCUMENTO = "Ver documento";
    public static final String SERVICIO = "06010002";
}