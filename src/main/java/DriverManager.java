import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private WebDriver driver;

    public DriverManager(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("driver-path"));
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }


}
