package test.certificationlogin.tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import test.certificationlogin.userinterface.CreateAccountPage;
import test.certificationlogin.userinterface.HomePageUnitTest;

public class RegisterUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(HomePageUnitTest.BTN_CREATE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(HomePageUnitTest.BTN_CREATE)),
                Click.on(HomePageUnitTest.BTN_CREATENEW),
                Enter.theValue("Alejandro12").into(CreateAccountPage.TXT_USERNAME),
                Enter.theValue("trappipeuddauje-8912@yopmail.com").into(CreateAccountPage.TXT_EMAIL),
                Enter.theValue("2163500aA").into(CreateAccountPage.TXT_PASSWORD),
                Enter.theValue("2163500aA").into(CreateAccountPage.TXT_CONFIRPASSWORD),
                Enter.theValue("Alejandro").into(CreateAccountPage.TXT_NAME),
                Enter.theValue("Caro").into(CreateAccountPage.TXT_LASTAME),
                Enter.theValue("3045487698").into(CreateAccountPage.TXT_PHONE),
                Click.on(CreateAccountPage.BTN_CONTRY),
                Enter.theValue("Medellín").into(CreateAccountPage.TXT_CITY),
                Enter.theValue("Calle 52 n 20-23").into(CreateAccountPage.TXT_ADDRESS),
                Enter.theValue("Antioquia").into(CreateAccountPage.TXT_STATE),
                Enter.theValue("56").into(CreateAccountPage.TXT_POSTAL),
                Click.on(CreateAccountPage.BTN_CHECK),
                Click.on(CreateAccountPage.BTN_REGISTER)
        );
    }
    public static Performable RegisterUsers(){
        return Tasks.instrumented(RegisterUser.class);
    }

}

