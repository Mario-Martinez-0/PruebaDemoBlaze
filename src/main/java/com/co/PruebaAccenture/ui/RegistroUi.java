package com.co.PruebaAccenture.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;


public class RegistroUi {
    public static final Target OPCION_REGISTRO = Target.the("Opcion del menu para registrase").
            located(By.id("signin2"));
    public static final Target TXT_NOMBREUSUARIO = Target.the("input del nombre de usuario").
            located(By.id("sign-username"));
    public static final Target TXT_CLAVEUSUARIO = Target.the("input del clave de usuario").
            located(By.id("sign-password"));
    public static final Target BTN_REGISTROUSUARIO = Target.the("button de registrar usuario").
            located(By.xpath("(//button[@class='btn btn-primary'])[2]"));


}
