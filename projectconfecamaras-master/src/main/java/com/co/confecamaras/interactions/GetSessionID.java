package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;

public class GetSessionID implements Interaction {

    public static String cookieDef;

    public static GetSessionID session() {
        return new GetSessionID();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        getSessionTwo();
    }

    public void getSession() {
        try {
            String currentUrl = getWebdriverManager().getCurrentDriver().getCurrentUrl();
            System.out.println("URL AQUI = " + currentUrl);
            URL url = new URL(currentUrl);
            URLConnection urlConn = url.openConnection();
            String myCookie = "";
            urlConn.setRequestProperty("Cookie", myCookie);
            urlConn.connect();
            System.out.println("FINALICE EL REQUEST CON MI SESSIONID = "+ myCookie);
        } catch (Exception e) {
            System.out.println(e + "ENTRO AL CATCH");
        }
    }

    public void getSessionTwo() {
        try {
            int size = getWebdriverManager().getCurrentDriver().findElements(By.tagName("iframe")).size();
            System.out.println("TOTAL AQUI ****" + size);

            /*for(int i=0; i<=size; i++){
                getWebdriverManager().getCurrentDriver().switchTo().frame(i);
                int total=getWebdriverManager().getCurrentDriver().findElements(By.xpath("html/body/a/img")).size();
                System.out.println("TOTAL AQUI ****" + total);
            }*/
            String currentUrl = getWebdriverManager().getCurrentDriver().getCurrentUrl();
            System.out.println("URL AQUI = " + currentUrl);
            URL url = new URL("https://sii3pruebas.confecamaras.co/controlador/Route.php");
            URLConnection urlConn = url.openConnection();
            urlConn.connect();
            //String headerName="";
            //headerName = urlConn.getHeaderField("Set-Cookie");
            //System.out.println("AQUI HEADER = "+headerName);
            String cookie = urlConn.getHeaderField("Set-Cookie");
            cookie = cookie.substring(0, cookie.indexOf(";"));
            //String cookieName = cookie.substring(0, cookie.indexOf("="));
            System.out.println("AQUI HEADER COOKIE = "+cookie);
            //System.out.println("AQUI HEADER NAME = "+cookieName);
            cookieDef = cookie;
            /*for (int i=1; (headerName = urlConn.getHeaderFieldKey(i))!=null; i++) {
                if (headerName.equals("Cookie")) {
                    String cookie = urlConn.getHeaderField(i);
                    cookie = cookie.substring(0, cookie.indexOf(";"));
                    String cookieName = cookie.substring(0, cookie.indexOf("="));
                    String cookieValue = cookie.substring(cookie.indexOf("=") + 1, cookie.length());
                    System.out.println("FINALICE EL REQUEST" + cookieName + "-" + cookieValue +"-");
        }*/

    } catch (MalformedURLException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    /*} catch (MalformedURLException e) {
            System.out.println("ERROR UNO" + e);
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("ERROR DOS" + e);
            throw new RuntimeException(e);
        }*/

    }

}
