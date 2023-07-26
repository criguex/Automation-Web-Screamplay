package test.certificationlogin.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final net.serenitybdd.screenplay.targets.Target TXT_USERNAME = Target.the("TXT_USERNAME").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[1]/sec-view[1]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_EMAIL = Target.the("TXT_EMAIL").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[1]/sec-view[2]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PASSWORD = Target.the("TXT_PASSWORD").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[2]/sec-view[1]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_CONFIRPASSWORD = Target.the("TXT_CONFIRPASSWORD").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[1]/div[2]/sec-view[2]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_NAME = Target.the("TXT_NAME").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[2]/div[1]/sec-view[1]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_LASTAME = Target.the("TXT_LASTNAME").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[2]/div[1]/sec-view[2]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PHONE = Target.the("TXT_PHONE").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[2]/div[2]/sec-view/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_CONTRY = Target.the("BTN_CONTRY").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[3]/div[1]/sec-view[1]/div/select/option[45]"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_CITY = Target.the("TXT_CITY").located(By.xpath("//input[@name='cityRegisterPage']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_ADDRESS = Target.the("TXT_ADDRESS").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[3]/div[2]/sec-view[1]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_STATE = Target.the("TXT_STATE").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[3]/div[2]/sec-view[2]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_POSTAL = Target.the("TXT_STATE").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/div[3]/div[3]/sec-view/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_CHECK = Target.the("BTN_CHECK").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[1]/div[2]/div/sec-view/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_REGISTER = Target.the("BTN_REGISTER").located(By.xpath("/html/body/div[3]/section/article/sec-form/div[2]/sec-sender/button"));

}
