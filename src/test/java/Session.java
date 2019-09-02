import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class Session {

    ConfigManager config;
    DriverManager driverManager;
    WebDriver driver;
    NavigationManager navManager;


    public Session(){
        config = new ConfigManager();
        driverManager = new DriverManager();
        driver = driverManager.getDriver();
        driver.get(System.getProperty("base-url"));
        navManager = new NavigationManager(driver);
    }

   public void endSesion(){
        driver.close();
   }

   public NavigationManager getNavManager(){
        return navManager;
   }

   public WebDriver getDriver(){
        return driver;
   }

}
