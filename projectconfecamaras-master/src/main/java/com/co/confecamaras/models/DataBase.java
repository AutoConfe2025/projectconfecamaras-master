package com.co.confecamaras.models;

import java.sql.Connection;

public class DataBase {

    private DataBase() {}

    private static Connection con;

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        DataBase.con = con;
    }

    /*----------Código de Barras Reasignación Código Barras----------*/

    private static String codigoBarras;

    public static String getCodigoBarras() {
        return codigoBarras;
    }
    public static void setCodigoBarras(String codigoBarras) {
        DataBase.codigoBarras = codigoBarras;
    }


    /*----------numero de matricula----------*/
    private static String numeroMatricula;

    public static String getNumeroMatricula() {
        return numeroMatricula;
    }
    public static void setNumeroMatricula(String numeroMatricula) {
        DataBase.numeroMatricula = numeroMatricula;
    }

    /*----------numero de matriculaBajaActivos----------*/

    private static String numeroMatriculaBajaActivos;

    public static String getNumeroMatriculaBajaActivos() {
        return numeroMatriculaBajaActivos;
    }
    public static void setNumeroMatriculaBajaActivos(String numeroMatriculaBajaActivos) {
        DataBase.numeroMatriculaBajaActivos = numeroMatriculaBajaActivos;
    }

    /*----------Numero de Matricula Renovacion Sociedad Baja Activos----------*/

    private static String numeroMatriculaSociedadBajaActivos;

    public static String getNumeroMatriculaSociedadBajaActivos() {
        return numeroMatriculaSociedadBajaActivos;
    }
    public static void setNumeroMatriculaSociedadBajaActivos(String numeroMatriculaSociedadBajaActivos) {
        DataBase.numeroMatriculaSociedadBajaActivos = numeroMatriculaSociedadBajaActivos;
    }

    /*----------Numero de Reversion de Recibos de Caja----------*/

    private static String numeroReversionRecibosCaja;

    public static String getNumeroReversionRecibosCaja() {
        return numeroReversionRecibosCaja;
    }
    public static void setNumeroReversionRecibosCaja(String numeroReversionRecibosCaja) {
        DataBase.numeroReversionRecibosCaja = numeroReversionRecibosCaja;
    }

    /*----------Numero de Matricula Renovacion PN en Estado Inactivo----------*/

    private static String numeroMatriculaPnEstadoInactivo;

    public static String getNumeroMatriculaPnEstadoInactivo() {
        return numeroMatriculaPnEstadoInactivo;
    }
    public static void setNumeroMatriculaPnEstadoInactivo(String numeroMatriculaPnEstadoInactivo) {
        DataBase.numeroMatriculaPnEstadoInactivo = numeroMatriculaPnEstadoInactivo;
    }

    /*----------Código de Barras Reingreso de Trámites----------*/

    private static String codigoBarrasReingreso;

    public static String getCodigoBarrasReingreso() {
        return codigoBarrasReingreso;
    }
    public static void setCodigoBarrasReingreso(String codigoBarrasReingreso) {
        DataBase.codigoBarrasReingreso = codigoBarrasReingreso;
    }

    /*----------Código de Barras Reingreso de Trámites en Bloque----------*/

    private static String codigoBarrasReingresoBloque;

    public static String getCodigoBarrasReingresoBloque() {
        return codigoBarrasReingresoBloque;
    }
    public static void setCodigoBarrasReingresoBloque(String codigoBarrasReingresoBloque) {
        DataBase.codigoBarrasReingresoBloque = codigoBarrasReingresoBloque;
    }

    /*----------Desbloquear Liquidación Pago en Caja----------*/

    private static String numRecuperacionPagoCaja;

    public static String getNumRecuperacionPagoCaja() {
        return numRecuperacionPagoCaja;
    }
    public static void setNumRecuperacionPagoCaja(String numRecuperacionPagoCaja) {
        DataBase.numRecuperacionPagoCaja = numRecuperacionPagoCaja;
    }

    /*----------Desbloquear Liquidación Pago Electrónico----------*/

    private static String numRecuperacionPagoElectronico;

    public static String getNumRecuperacionPagoElectronico() {
        return numRecuperacionPagoElectronico;
    }
    public static void setNumRecuperacionPagoElectronico(String numRecuperacionPagoElectronico) {
        DataBase.numRecuperacionPagoElectronico = numRecuperacionPagoElectronico;
    }

    /*----------Desbloquear Liquidación Firmado Electrónico----------*/

    private static String numRecuperacionFirmadoElectronico;

    public static String getNumRecuperacionFirmadoElectronico() {
        return numRecuperacionFirmadoElectronico;
    }
    public static void setNumRecuperacionFirmadoElectronico(String numRecuperacionFirmadoElectronico) {
        DataBase.numRecuperacionFirmadoElectronico = numRecuperacionFirmadoElectronico;
    }

    /*----------Desbloquear Liquidación Formulario Final----------*/

    private static String numRecuperacionFormularioFinal;

    public static String getNumRecuperacionFormularioFinal() {
        return numRecuperacionFormularioFinal;
    }
    public static void setNumRecuperacionFormularioFinal(String numRecuperacionFormularioFinal) {
        DataBase.numRecuperacionFormularioFinal = numRecuperacionFormularioFinal;
    }

    /*----------Numero de Matricula Renovacion Sociedad----------*/

    private static String numeroMatriculaSociedad;

    public static String getNumeroMatriculaSociedad() {
        return numeroMatriculaSociedad;
    }
    public static void setNumeroMatriculaSociedad(String numeroMatriculaSociedad) {
        DataBase.numeroMatriculaSociedad = numeroMatriculaSociedad;
    }

    /*----------Numero de Matricula Renovacion Sucursal----------*/

    private static String numeroMatriculaSucursal;

    public static String getNumeroMatriculaSucursal() {
        return numeroMatriculaSucursal;
    }
    public static void setNumeroMatriculaSucursal(String numeroMatriculaSucursal) {
        DataBase.numeroMatriculaSucursal = numeroMatriculaSucursal;
    }

    /*----------Numero de Matricula Renovacion Agencia----------*/

    private static String numeroMatriculaAgencia;

    public static String getNumeroMatriculaAgencia() {
        return numeroMatriculaAgencia;
    }
    public static void setNumeroMatriculaAgencia(String numeroMatriculaAgencia) {
        DataBase.numeroMatriculaAgencia = numeroMatriculaAgencia;
    }

    /*----------Numero de Matricula Renovacion PJ en Estado Inactivo----------*/

    private static String numeroMatriculaPjEstadoInactivo;

    public static String getNumeroMatriculaPjEstadoInactivo() {
        return numeroMatriculaPjEstadoInactivo;
    }
    public static void setNumeroMatriculaPjEstadoInactivo(String numeroMatriculaPjEstadoInactivo) {
        DataBase.numeroMatriculaPjEstadoInactivo = numeroMatriculaPjEstadoInactivo;
    }

    /*----------Numero de Matricula Renovacion PN con Establecimiento----------*/

    private static String numeroMatriculaPnEstablecimiento;

    public static String getNumeroMatriculaPnEstablecimiento() {
        return numeroMatriculaPnEstablecimiento;
    }
    public static void setNumeroMatriculaPnEstablecimiento(String numeroMatriculaPnEstablecimiento) {
        DataBase.numeroMatriculaPnEstablecimiento = numeroMatriculaPnEstablecimiento;
    }

    /*----------Numero de Matricula Renovacion Esadl Org 12----------*/

    private static String numeroMatriculaEsadlOrgDoce;

    public static String getNumeroMatriculaEsadlOrgDoce() {
        return numeroMatriculaEsadlOrgDoce;
    }
    public static void setNumeroMatriculaEsadlOrgDoce(String numeroMatriculaEsadlOrgDoce) {
        DataBase.numeroMatriculaEsadlOrgDoce = numeroMatriculaEsadlOrgDoce;
    }

    /*----------Numero de Matricula Renovacion Esadl Org 14----------*/

    private static String numeroMatriculaEsadlOrgCatorce;

    public static String getNumeroMatriculaEsadlOrgCatorce() {
        return numeroMatriculaEsadlOrgCatorce;
    }
    public static void setNumeroMatriculaEsadlOrgCatorce(String numeroMatriculaEsadlOrgCatorce) {
        DataBase.numeroMatriculaEsadlOrgCatorce = numeroMatriculaEsadlOrgCatorce;
    }

    /*----------Numero de Matricula Renovacion Actividad No Comercial----------*/

    private static String numeroMatriculaActividadNoComercial;

    public static String getNumeroMatriculaActividadNoComercial() {
        return numeroMatriculaActividadNoComercial;
    }
    public static void setNumeroMatriculaActividadNoComercial(String numeroMatriculaActividadNoComercial) {
        DataBase.numeroMatriculaActividadNoComercial = numeroMatriculaActividadNoComercial;
    }

    /*----------Numero de Matricula Renovacion PN ya Renovada (Reliquidacion)----------*/

    private static String numMatriculaPnRenovadaReliquidacion;

    public static String getNumMatriculaPnRenovadaReliquidacion() {
        return numMatriculaPnRenovadaReliquidacion;
    }
    public static void setNumMatriculaPnRenovadaReliquidacion(String numMatriculaPnRenovadaReliquidacion) {
        DataBase.numMatriculaPnRenovadaReliquidacion = numMatriculaPnRenovadaReliquidacion;
    }

    /*----------Numero de Matricula Renovacion Actividad No Comercial Comercial----------*/

    private static String numMatActividadNoComercialComercial;

    public static String getNumMatActividadNoComercialComercial() {
        return numMatActividadNoComercialComercial;
    }
    public static void setNumMatActividadNoComercialComercial(String numMatActividadNoComercialComercial) {
        DataBase.numMatActividadNoComercialComercial = numMatActividadNoComercialComercial;
    }

    /*----------Numero de Matricula Renovacion Pn Establecimiento Usuario Externo----------*/

    private static String numMatPnEstUsuarioExterno;

    public static String getNumMatPnEstUsuarioExterno() {
        return numMatPnEstUsuarioExterno;
    }
    public static void setNumMatPnEstUsuarioExterno(String numMatPnEstUsuarioExterno) {
        DataBase.numMatPnEstUsuarioExterno = numMatPnEstUsuarioExterno;
    }

    /*----------Numero de Recibo S Reversion Parcial----------*/

    private static String numReciboS;

    public static String getNumReciboS() {
        return numReciboS;
    }
    public static void setNumReciboS(String numReciboS) {
        DataBase.numReciboS = numReciboS;
    }

    /*----------Numero de Matricula Estudio Inscripcion Proponentes----------*/

    private static String numMatEstInsProp;

    public static String getNumMatEstInsProp() {
        return numMatEstInsProp;
    }
    public static void setNumMatEstInsProp(String numMatEstInsProp) {
        DataBase.numMatEstInsProp = numMatEstInsProp;
    }


    /*----------Renovacion Matricula Varios Años----------*/

    public static String matriculaAnios;

    public static String getMatriculaAnios() {
        return matriculaAnios;
    }

    public static void setMatriculaAnios(String matriculaAnios) {
        DataBase.matriculaAnios = matriculaAnios;
    }

    /*----------Liquidación renovación con ley 1780 - básico----------*/
    public static String liquidacionLey;

    public static String getLiquidacionLey() {
        return liquidacionLey;
    }
    public static void setLiquidacionLey(String liquidacionLey) {
        DataBase.liquidacionLey = liquidacionLey;
    }

    /*----------Cancelacion matricula----------*/
    private static String numMatriculaCancelacion;

    public static String getNumMatriculaCancelacion() {
        return numMatriculaCancelacion;
    }
    public static void setNumMatriculaCancelacion(String numeroMatriculaCancel) {DataBase.numMatriculaCancelacion = numeroMatriculaCancel;
    }

    /*----------BandejaPonalSinAsentamiento codigo Barras----------*/
    private static String numMaricula;

    public static String getNumMatricula() {
        return numMaricula;
    }
    public static void setNumMatricula(String numeroMatricula) {DataBase.numMaricula = numeroMatricula;
    }


}