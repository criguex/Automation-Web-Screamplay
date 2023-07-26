package test.certificationlogin.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/feature/Login/Register_page.feature",
        glue="test.certificationlogin.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class  TestLogin {
}