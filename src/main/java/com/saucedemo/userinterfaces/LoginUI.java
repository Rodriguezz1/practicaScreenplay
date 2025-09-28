package com.saucedemo.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.saucedemo.com/")
public class LoginUI extends PageObject {

    public static final Target TXT_USUARIO = Target.the("").located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("").located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("").located(By.id("login-button"));

}
