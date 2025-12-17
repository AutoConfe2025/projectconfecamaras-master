package com.co.confecamaras.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class SwitchToNewWindow implements Interaction {

    private final int previousTabCount;
    private final boolean onlyWait;

    // Constructor usado por waitForNewTabToOpen()
    public SwitchToNewWindow(boolean onlyWait){
        this.onlyWait = true;
        this.previousTabCount = 0;
    }

    public SwitchToNewWindow(int previousTabCount){
        this.previousTabCount = previousTabCount;
        this.onlyWait = false;
    }

    public SwitchToNewWindow(){
        this.previousTabCount = 0;
        this.onlyWait = false;
    }

    @Override
    @Step("{0} switching browser tab")
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        if(onlyWait){
            int initialTabs = driver.getWindowHandles().size();

            for (int i = 0; i < 20; i++) {
                if (driver.getWindowHandles().size() > initialTabs) break;
                try { Thread.sleep(150); } catch (Exception ignored) {}
            }
            return; // no cambiamos pestaña
        }

        // esperar cuando se usa toNewTab()
        for (int i = 0; i < 20; i++) {
            if (driver.getWindowHandles().size() > previousTabCount) break;
            try { Thread.sleep(150); } catch (Exception ignored) {}
        }

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(windows.size() - 1));
    }

    // ============================================================
    // PUBLIC METHODS
    // ============================================================

    /** Espera a que abra una nueva pestaña sin cambiarse */
    public static Interaction waitForNewTabToOpen(){
        return Instrumented.instanceOf(SwitchToNewWindow.class)
                .withProperties(true);
    }

    /** Cambia a la última pestaña (versión clásica que usabas antes) */
    public static Interaction switchToNewTab(){
        return Instrumented.instanceOf(SwitchToNewWindow.class)
                .withProperties(0);
    }

    /** Cambia a nueva pestaña basada en tabs actuales */
    public static Interaction toNewTab(Actor actor){
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        int existingTabs = driver.getWindowHandles().size();

        return Instrumented.instanceOf(SwitchToNewWindow.class)
                .withProperties(existingTabs);
    }
}
