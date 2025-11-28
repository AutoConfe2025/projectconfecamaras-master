package com.co.confecamaras.interactions;

import java.io.File;

public class FileUploadLimpio {

    public static String archivoDoc() {
        return new File("src/test/resources/data/TEST.docx").getAbsolutePath();
    }

    public static String archivoRut() {
        return new File("src/test/resources/data/TestRut.pdf").getAbsolutePath();
    }

    public static String archivoPj() {
        return new File("src/test/resources/data/CertificadoPJ.pdf").getAbsolutePath();
    }

    public static String archivoDev() {
        return new File("src/test/resources/data/Devolutivo.pdf").getAbsolutePath();
    }

    public static String archivoComandos() {
        return new File("src/test/resources/data/ComandosBasicosWebDriverPOM.pdf").getAbsolutePath();
    }

    public static String firma() {
        return new File("src/test/resources/data/Firma.png").getAbsolutePath();
    }
}
