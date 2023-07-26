package test.certificationlogin.tasks;

import jxl.StringFormulaCell;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.WebElementLocator;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.certificationlogin.userinterface.HomePageUnitTest;

import static test.certificationlogin.userinterface.HomePageUnitTest.BTN_CREATE;

public class IncorrectSession implements Task {

    private String usuario,contrasenia;

    public IncorrectSession(String usuario,String contrasenia){this.usuario = usuario; this.contrasenia = contrasenia;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Check.whether(BTN_CREATE.resolveFor(actor).isVisible()).andIfSo(
                        Click.on(BTN_CREATE)),
                        WaitUntil.the(BTN_CREATE, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                        Enter.theValue(usuario).into(HomePageUnitTest.TXT_USER),
                        Enter.theValue(contrasenia).into(HomePageUnitTest.TXT_PASS),
                        Click.on(HomePageUnitTest.BTN_REMEMBER),
                        Click.on(HomePageUnitTest.BTN_SINGIN));
    }

    public static IncorrectSession IncorrectsSessions(String usuario,String contrasenia){
        return Tasks.instrumented(IncorrectSession.class,usuario,contrasenia);
    }
}

