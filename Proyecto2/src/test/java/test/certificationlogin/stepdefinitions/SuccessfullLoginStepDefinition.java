package test.certificationlogin.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.certificationlogin.questions.ResultLoginFail;
import test.certificationlogin.tasks.IncorrectSession;
import test.certificationlogin.utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.returnsAValueThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.ACTOR;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.URL;

public class SuccessfullLoginStepDefinition {
    @Before
    public void SetUp(){ OnStage.setTheStage(new OnlineCast());}


    @Given("that I am on the login page")
    public void thatIAmOnTheLoginPage() { theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));

    }
    @When("^I enter my valid (.*) and (.*)$")
    public void iEnterMyValidUsuarioAndContrasenia(String usuario,String contrasenia) {
        theActorCalled(ACTOR).wasAbleTo(IncorrectSession.IncorrectsSessions(usuario, contrasenia));
    }
    @When("click on the login button")
    public void clickOnTheLoginButton() {

    }
    @Then("I see a message or redirection confirming that the login has been successful.")
    public void iSeeAMessageOrRedirectionConfirmingThatTheLoginHasBeenSuccessful() {
        theActorInTheSpotlight().should(seeThat(ResultLoginFail.results(), equalTo(true)));

    }


}
