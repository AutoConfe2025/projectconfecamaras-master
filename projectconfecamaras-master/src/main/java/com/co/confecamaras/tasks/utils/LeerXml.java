package com.co.confecamaras.tasks.utils;

import com.co.confecamaras.utils.News.evidencias.Reportes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.junit.Assert;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.net.URL;



public class LeerXml implements Task {
    private final String url;
    private final String[] tags;

    public LeerXml(String url, String... tags) {
        this.url = url;
        this.tags = tags;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new URL(url).openStream());

            for (String tag : tags) {
                NodeList nodeList = document.getElementsByTagName(tag);
                if (nodeList.getLength() > 0) {
                    String valor = nodeList.item(0).getTextContent();
                    Reportes.reportEvent(Reportes.PASSED, "Valor del tag [" + tag.toUpperCase() + "]: " + valor);
                } else {
                    Reportes.reportEvent(Reportes.WARNING, "No se encontro el tag: [" + tag.toUpperCase() + "] en el XML");
                }
            }
        } catch (Exception e) {
            Reportes.reportEvent(Reportes.FAILED,e.getMessage());
            Assert.fail(e.getMessage());
        }
    }

    public static LeerXml leer(String url, String... tags) {
        return new LeerXml(url, tags);
    }
}
