package com.saucedemo.stepsdefinitions;

import com.saucedemo.questions.ValidarMensaje;
import com.saucedemo.tasks.Carrito;
import com.saucedemo.tasks.Login;
import com.saucedemo.tasks.Productos;
import com.saucedemo.utils.WebDriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CompraExitosaStepDefinitions {


    @Before
    public void configuracion() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que el usuario ingrese a la pagina (.*)$")
    public void queElUsuarioIngreseALaPagina(String url) {
        OnStage.theActorCalled("Actor").can(BrowseTheWeb.with(WebDriverFactory.goToWeb(url)));

    }

    @Cuando("el ingrese las credenciales (.*) (.*)$")
    public void elIngreseLasCredencialesStandardUserSecretSauce(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.conCredenciales(usuario, clave));
    }
    @Cuando("seleccione los productos que desea comprar (.*)$")
    public void seleccioneLosProductosQueDeseaComprarCompraCompleta(String accion) {
        OnStage.theActorInTheSpotlight().attemptsTo(Productos.alCarrito());
        OnStage.theActorInTheSpotlight().attemptsTo(Carrito.ProductoCarrito());
    }
    @Entonces("validara un mensaje de compra exitosa")
    public void validaraUnMensajeDeCompraExitosa() {
        OnStage.theActorInTheSpotlight().should(seeThat("Validar Mensaje", ValidarMensaje.validar(), Matchers.containsString("Thank you for your order!")));
    }

}
