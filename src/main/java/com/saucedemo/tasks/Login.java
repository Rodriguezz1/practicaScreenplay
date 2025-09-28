package com.saucedemo.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.saucedemo.userinterfaces.LoginUI.*;

public class Login implements Task {

    String usuario, clave;

    public Login(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)

        );

    }

    public static Login conCredenciales(String usuario, String clave){
        return Tasks.instrumented(Login.class, usuario, clave);
    }

}
