package stepdefinitions;



import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.VerLaPalabra;
import utils.drivers.MyChromeDriver;



public class TraductorStepdefinition {
    @Before
    public void before()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^yo voy al traductor$")
    public void yoVoyAlTraductor() throws Exception {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().enLaUrl("https://www.google.com")));
        OnStage.theActorCalled("").wasAbleTo(task.IrA.ElTraductorDeGoogle("Traductor"));


    }

    @Cuando("^inserto la palara a traducir$")
    public void insertoLaPalaraATraducir() throws Exception {
            OnStage.theActorCalled("").wasAbleTo(task.Traducir.laPalabra("Ardilla"));



    }

    @Entonces("^la palabra se traduce$")
    public void laPalabraSeTraduce(String palabraFinal) {
        OnStage.theActorCalled("").should(GivenWhenThen.seeThat(VerLaPalabra.traducida(palabraFinal), Matchers.equalTo("chipmunk")));

    }

}
