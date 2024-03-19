package com.co.PruebaAccenture.tasks;

import com.co.PruebaAccenture.models.CarritoData;
import com.co.PruebaAccenture.models.RegistroData;
import com.co.PruebaAccenture.ui.CarritoUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CarritoTask implements Task {

    private final CarritoData carritoData;

    public CarritoTask(CarritoData carritoData) {
        this.carritoData = carritoData;
    }

    public static CarritoTask carrito(CarritoData carritoData) {
        return Instrumented.instanceOf(CarritoTask.class).withProperties(carritoData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CarritoUi.BTN_REALIZARPEDIDO),
                Enter.theValue(carritoData.getNombre()).into(CarritoUi.INPUT_NOMBRE),
                Enter.theValue(carritoData.getPais()).into(CarritoUi.INPUT_PAIS),
                Enter.theValue(carritoData.getCiudad()).into(CarritoUi.INPUT_CIUDAD),
                Enter.theValue(carritoData.getTarjeta()).into(CarritoUi.INPUT_TARGETA),
                Enter.theValue(carritoData.getMes()).into(CarritoUi.INPUT_MES),
                Enter.theValue(carritoData.getAno()).into(CarritoUi.INPUT_ANO),
                Click.on(CarritoUi.BTN_COMPRAR));
    }
}
