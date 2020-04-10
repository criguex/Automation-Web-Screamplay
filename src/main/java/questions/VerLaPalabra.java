package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.PaginaPrincipalGoogle;

public class VerLaPalabra implements Question <String>{
    private String palabrafinal;

    public VerLaPalabra(String palabrafinal) {
        this.palabrafinal = palabrafinal;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaPrincipalGoogle.VERIFICAR_LA_PALABRA.of(palabrafinal)).viewedBy(actor).asString();
    }
    public static VerLaPalabra  traducida(String palabraFinal){
        return new VerLaPalabra(palabraFinal);
    }
}
