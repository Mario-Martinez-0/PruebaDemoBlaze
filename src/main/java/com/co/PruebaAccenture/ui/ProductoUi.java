package com.co.PruebaAccenture.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoUi {

    public static final Target LINK_CATEGORIA = Target.the("link de categoria")
            .locatedBy("//a[contains(text(),'{0}')]");
    public static final Target BNT_AGREGAR = Target.the("boton de agregar")
            .locatedBy("//a[contains(text(),'Add to cart')]");
    public static final Target LINK_PROCDUTO = Target.the("link de producto")
            .locatedBy("(//a[contains(text(),'Samsung')])[2]");
    public static final Target LINK_INICIO = Target.the("link de inicio")
            .locatedBy("//a[contains(text(),'Home ')]");
    public static final Target LINK_CARRITO = Target.the("Opcion del menu de carrito")
            .locatedBy("//a[contains(text(),'Cart')]");
}
