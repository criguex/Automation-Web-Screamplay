package test.certificationlogin.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import test.certificationlogin.userinterface.HomePageUnitTest;

public class ResultLoginFail implements Question <Boolean>{
 @Override
    public Boolean answeredBy(Actor actor) {
     return HomePageUnitTest.TXT_LOGINEXITOSO.resolveFor(actor).isVisible() || HomePageUnitTest.TXT_FAIL.resolveFor(actor).isVisible();}
    public static ResultLoginFail results() {return new ResultLoginFail();}

}
