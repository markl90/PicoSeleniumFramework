import org.openqa.selenium.WebDriver;

public class NavigationManager {

    WebDriver driver;

    public NavigationManager(WebDriver driver){
        this.driver = driver;
    }

    public void goTo(String page){
        driver.navigate().to(page);
    }

    public void searchTerm(String term){
        driver.navigate().to(System.getProperty("base-url")+ "/search?q="+ term);
    }
}
