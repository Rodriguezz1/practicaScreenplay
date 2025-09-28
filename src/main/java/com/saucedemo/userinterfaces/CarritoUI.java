package com.saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoUI {

    public static final Target BTN_REMOVER = Target.the("").located(By.xpath("//button[text()='Remove']"));
    public static final Target BTN_CHECKOUT = Target.the("").located(By.id("checkout"));
    public static final Target TXT_FIRST_NAME = Target.the("").located(By.id("first-name"));
    public static final Target TXT_LAST_NAME = Target.the("").located(By.id("last-name"));
    public static final Target TXT_ZIP = Target.the("").located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("").located(By.id("continue"));
    public static final Target BTN_FINALIZAR = Target.the("").located(By.id("finish"));
    public static final Target LBL_COMPRA_EXITOSA = Target.the("").located(By.xpath("//h2[normalize-space()='Thank you for your order!']"));

}
