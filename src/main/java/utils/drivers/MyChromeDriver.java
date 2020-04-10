package utils.drivers;

import com.gargoylesoftware.htmlunit.History;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MyChromeDriver {

    public static WebDriver chomeDriver;

    public static MyChromeDriver chromeHisBrowserWeb() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-infobars");

        chomeDriver = new ChromeDriver(options);
        return new MyChromeDriver();
    }

    public static History navigate() {
        return null;
    }


    public WebDriver enLaUrl(String url){
        chomeDriver.get(url);
        return chomeDriver;
    }

}
