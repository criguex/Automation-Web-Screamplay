package task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterfaces.PaginaPrincipalGoogle.*;

public class Traducir implements Task {

    private String  palabraInicial;

    public Traducir(String palabraInicial) {
        this.palabraInicial = palabraInicial;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SELECCIONAR_IDICOMA_FINAL),
                Click.on(SELECCIONAR_IDICOMA_INICIAL),
                Enter.theValue(palabraInicial).into(CAJA_DE_TEXTO));


    }
    public static Traducir laPalabra(String palabraInicial){
        return Tasks.instrumented(Traducir.class,palabraInicial);
    }
}
