package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import java.io.File;

public class FileUploadDos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        fileToUploadDos();
    }
    public String fileToUploadDos() {
        File file = new File("C:/Users/USER/Downloads/QA.pdf");
        String fileToUploadDos = file.getAbsolutePath();
        return fileToUploadDos;
    }
    public static FileUploadDos subirArchivo(){
        return new FileUploadDos();
    }
}
