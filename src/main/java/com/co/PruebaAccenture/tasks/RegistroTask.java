package com.co.PruebaAccenture.tasks;

import com.co.PruebaAccenture.models.RegistroData;
import com.co.PruebaAccenture.ui.RegistroUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistroTask implements Task {

        private final RegistroData registroData;

    public RegistroTask(RegistroData registroData) {
        this.registroData = registroData;
    }

    public static RegistroTask registrar(RegistroData registroData) {
            return Instrumented.instanceOf(RegistroTask.class).withProperties(registroData);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RegistroUi.OPCION_REGISTRO),
                Enter.theValue(registroData.getUsuario()).into(RegistroUi.TXT_NOMBREUSUARIO),
                Enter.theValue(registroData.getClave()).into(RegistroUi.TXT_CLAVEUSUARIO),
                Click.on(RegistroUi.BTN_REGISTROUSUARIO));


    }
}
