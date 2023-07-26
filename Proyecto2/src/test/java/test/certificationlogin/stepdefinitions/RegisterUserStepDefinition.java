package test.certificationlogin.stepdefinitions;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.certificationlogin.utils.drivers.MyChromeDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static test.certificationlogin.tasks.RegisterUser.RegisterUsers;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.ACTOR;
import static test.certificationlogin.utils.ConstanManage.ConstanManage.URL;

public class RegisterUserStepDefinition {
    @Before
    public void SetUp(){ OnStage.setTheStage(new OnlineCast());}

    @Given("that I am on the registration page")
    public void thatIAmOnTheHomePage() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));
    }
    @When("I enter the data requested by the form")
    public void iClickOnTheUserButton() { theActorCalled(ACTOR).wasAbleTo(RegisterUsers());

    }
    @Then("it shows me a successful registration.")
    public void iEnterTheDataAndItShowsMeSuccessfulRegistration() {

    }
}

