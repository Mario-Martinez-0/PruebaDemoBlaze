package com.co.PruebaAccenture.questions;

import com.co.PruebaAccenture.ui.CarritoUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCompra implements Question<Boolean> {

    public static ValidarRegistro ValidacionCompra() {
        return new  ValidarRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return CarritoUi.BTN_VALIDACION_COMPRA.resolveFor(actor).isDisplayed();
    }
}
