package com.co.PruebaAccenture.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class InicioSesionUi {
    public static final Target OPCION_INICIOSESION = Target.the("Opcion del menu para inicio sesion").
            located(By.id("login2"));
    public static final Target TXT_NOMBREUSUARIO = Target.the("input del nombre de usuario").
            located(By.id("loginusername"));
    public static final Target TXT_CLAVEUSUARIO = Target.the("input del clave de usuario").
            located(By.id("loginpassword"));
    public static final Target BTN_INICIO = Target.the("button de registrar usuario").
            located(By.xpath("(//button[@class='btn btn-primary'])[3]"));
}
