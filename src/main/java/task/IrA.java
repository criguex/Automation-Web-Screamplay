package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.PaginaPrincipalGoogle;

public class IrA implements Task {

    private String
            busqueda;

    public IrA(String busqueda) {
        this.busqueda = busqueda;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(busqueda).into(PaginaPrincipalGoogle.BUSCAR_TRADUCTOR).thenHit(Keys.ENTER),

              //  Click.on(PaginaPrincipalGoogle.CLICK_BUSCAR),
                Click.on(PaginaPrincipalGoogle.SELECT_TRADUCTORGOOGLE));


    }
    public static IrA ElTraductorDeGoogle(String busqueda){
        return Tasks.instrumented(IrA.class,busqueda);
    }


}