package com.co.confecamaras.matchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

// Se extiende de TypeSafeMatcher en lugar de SubstringMatcher
public class StringContainsIgnoringCase extends TypeSafeMatcher<String> {

    private final String substring;

    // Constructor para guardar el texto que buscaremos
    public StringContainsIgnoringCase(String substring) {
        this.substring = substring.toLowerCase();
    }

    // Este es el método que contiene la lógica de la validación
    @Override
    protected boolean matchesSafely(String item) {
        return item.toLowerCase().contains(this.substring);
    }

    // Este método es para describir el error cuando la validación falla
    @Override
    public void describeTo(Description description) {
        description.appendText("una cadena que contenga (ignorando mayúsculas) '")
                .appendText(this.substring)
                .appendText("'");
    }

    // Este método estático no cambia, es para usarlo de forma legible
    public static Matcher<String> containsIgnoringCase(String substring) {
        return new StringContainsIgnoringCase(substring);
    }
}