package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.io.File;


public class FileUpload implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        archivoDev();
        archivoPj();
        archivoRut();
        archivoComandos();
        archivoDoc();
        firma();
       }

    public String archivoPj() {
        File file = new File("src/test/resources/data/CertificadoPJ.pdf");
        String archivoPj = file.getAbsolutePath();
        return archivoPj;
    }

    public String archivoRut() {
        File file = new File("src/test/resources/data/TestRut.pdf");
        String archivoRut = file.getAbsolutePath();
        return archivoRut;
    }

    public String archivoDev() {
        File file = new File("src/test/resources/data/Devolutivo.pdf");
        String archivoDev = file.getAbsolutePath();
        return archivoDev;
    }

    public String archivoComandos() {
        File file = new File("src/test/resources/data/ComandosBasicosWebDriverPOM.pdf");
        //File file = new File("C:/Users/USER/Downloads/State of Sottware Quality Report 2024.pdf");
        //File file = new File("C:\\Users\\BrunoIsaacGomezMangu\\Documents\\Documento AUTO\\qa.pdf");
        String archivoComandos = file.getAbsolutePath();
        return archivoComandos;
    }

    public String archivoDoc() {
        File file = new File("src/test/resources/data/TEST.docx");
        String contenedorPathDoc = file.getAbsolutePath();
        return contenedorPathDoc;
    }

    public String firma() {
        File file = new File("src/test/resources/data/Firma.png");
        String archivoPng = file.getAbsolutePath();
        return archivoPng;
    }

    public static FileUpload subirArchivo() {
        return new FileUpload();
    }

}
