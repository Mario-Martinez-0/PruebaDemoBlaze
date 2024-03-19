package com.co.PruebaAccenture.tasks;

import com.co.PruebaAccenture.interactions.Alerta;
import com.co.PruebaAccenture.ui.ProductoUi;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ProductoTask implements Task {

    private String categoria;
    private String producto;

    public ProductoTask(String categoria, String producto) {
        this.categoria = categoria;
        this.producto = producto;
    }

    public static ProductoTask producto(String categoria, String producto) {
        return Instrumented.instanceOf(ProductoTask.class).withProperties(categoria, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductoUi.LINK_CATEGORIA.of(categoria)),
                Click.on(ProductoUi.LINK_CATEGORIA.of(producto)),
                Click.on(ProductoUi.BNT_AGREGAR),
                Alerta.on(),
                Click.on(ProductoUi.LINK_CARRITO)
        );
    }
}
