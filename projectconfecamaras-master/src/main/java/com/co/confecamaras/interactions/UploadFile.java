package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.io.File;

public class UploadFile implements Interaction{


    public <T extends Actor> void performAs(T actor) {
        uploadFile();
        uploadFileDev();
        uploadFileRut();
    }

    public String uploadFileDev() {
        File file = new File("src/test/resources/data/Devolutivo.pdf");
        String contenedorPathDev = file.getAbsolutePath();
        return contenedorPathDev;
    }

    public String uploadFileRut() {
        File file = new File("src/test/resources/data/TestRut.pdf");
        String contenedorPathRut = file.getAbsolutePath();
        return contenedorPathRut;
    }

    public String uploadFile() {
        File file = new File("src/test/resources/data/CertificadoPJ.pdf");
        String contenedorPathPJ = file.getAbsolutePath();
        return contenedorPathPJ;
    }

    public static UploadFile subirArchivo() {
        return new UploadFile();
    }

}