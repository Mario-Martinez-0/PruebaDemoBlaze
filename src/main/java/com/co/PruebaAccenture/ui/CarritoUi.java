package com.co.PruebaAccenture.ui;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarritoUi {
    public static final Target BTN_REALIZARPEDIDO= Target.the("button de realizar pedido").located(By.xpath("//button[contains(text(),'Place Order')]"));
    public static final Target INPUT_NOMBRE = Target.the("campo de nombre").located(By.id("name"));
    public static final Target INPUT_PAIS = Target.the("campo de país").located(By.id("country"));
    public static final Target INPUT_CIUDAD = Target.the("campo de ciudad").located(By.id("city"));
    public static final Target INPUT_TARGETA = Target.the("campo de tarjeta de crédito").located(By.id("card"));
    public static final Target INPUT_MES = Target.the("campo de mes").located(By.id("month"));
    public static final Target INPUT_ANO = Target.the("campo de año").located(By.id("year"));
    public static final Target BTN_COMPRAR = Target.the("etiqueta de error").located(By.xpath("//button[contains(text(),'Purchase')]"));
    public static final Target BTN_VALIDACION_COMPRA = Target.the("mensaje final").located(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));

}
