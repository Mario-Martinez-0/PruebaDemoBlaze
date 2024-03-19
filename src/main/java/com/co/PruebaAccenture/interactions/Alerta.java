package com.co.PruebaAccenture.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Alerta implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Alert alert = driver.switchTo().alert();
        String textoAlerta = alert.getText();
        actor.remember("textoAlerta", textoAlerta);
        alert.accept();

    }

    public static Alerta on() {
        return Instrumented.instanceOf(Alerta.class).withProperties();
    }
}

