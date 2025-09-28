package com.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.saucedemo.userinterfaces.CarritoUI.*;

public class ValidarMensaje implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LBL_COMPRA_EXITOSA.resolveFor(actor).getText();
    }

    public static Question<String> validar(){

        return new ValidarMensaje();
    }
}
