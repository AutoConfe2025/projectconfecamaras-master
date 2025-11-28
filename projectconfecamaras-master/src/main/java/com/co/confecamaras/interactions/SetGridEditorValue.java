package com.co.confecamaras.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SetGridEditorValue implements Interaction {

    private final String value;
    private final int timeoutSeconds;

    public SetGridEditorValue(String value, int timeoutSeconds) {
        this.value = value;
        this.timeoutSeconds = timeoutSeconds;
    }

    public static SetGridEditorValue to(String value) {
        return Tasks.instrumented(SetGridEditorValue.class, value, 5);
    }

    public static SetGridEditorValue to(String value, int timeoutSeconds) {
        return Tasks.instrumented(SetGridEditorValue.class, value, timeoutSeconds);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));

        By editorSelector = By.cssSelector(
                "#gridbox input[type='text'], " +
                        "#gridbox input.editable, " +
                        "#gridbox input"
        );

        WebElement editor = wait.until(
                ExpectedConditions.elementToBeClickable(editorSelector)
        );

        editor.clear();
        editor.sendKeys(value);
        editor.sendKeys(Keys.ENTER);
    }
}
