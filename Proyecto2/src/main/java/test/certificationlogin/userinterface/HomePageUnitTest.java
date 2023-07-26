package test.certificationlogin.userinterface;

import net.serenitybdd.core.pages.ResolvableElement;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageUnitTest {
    public static final net.serenitybdd.screenplay.targets.Target BTN_CREATE= Target.the("caja USER").located(By.xpath("/html/body/header/nav/ul/li[3]/a"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_CREATENEW = Target.the("BTNCREATENEW").located(By.xpath("*//a[normalize-space()='CREATE NEW ACCOUNT']"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_USER = Target.the("TXT_USER").located(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_PASS = Target.the("TXT_PASS").located(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_REMEMBER = Target.the("TXT_PASS").located(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/div/input"));
    public static final net.serenitybdd.screenplay.targets.Target BTN_SINGIN = Target.the("TXT_PASS").located(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-sender/button"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_FAIL = Target.the("TXT_FAIL").located(By.xpath("/html/body/login-modal/div/div/div[3]/label"));
    public static final net.serenitybdd.screenplay.targets.Target TXT_LOGINEXITOSO = Target.the("TXT_LOGINEXITOSO").located(By.xpath(" /html/body/header/nav/ul/li[3]/a"));

}
