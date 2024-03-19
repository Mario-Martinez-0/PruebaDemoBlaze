package com.co.PruebaAccenture.questions;

import com.co.PruebaAccenture.interactions.Alerta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarRegistro implements Question<String> {

    public static ValidarRegistro validarRegistro() {
        return new ValidarRegistro();
    }

    @Override
    public String answeredBy(Actor actor) {

        actor.attemptsTo(Alerta.on());
        return actor.recall("textoAlerta");

    }

}
