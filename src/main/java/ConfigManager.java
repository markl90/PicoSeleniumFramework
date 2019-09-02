import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class ConfigManager {


    Config config;
    protected final String defaultConfigurationPath = "environment.conf";


    public File getConfigurationFile(){
        File config = new File(Thread.currentThread().getContextClassLoader().getResource(defaultConfigurationPath).getFile());
         return config;
    }

    public void loadConfig(){
        File configFile =  new File(Thread.currentThread().getContextClassLoader().getResource(defaultConfigurationPath).getFile());

        config = ConfigFactory.parseFile(getConfigurationFile()).getConfig("Params").resolve();

        Set params = new HashSet<String>();
        for (Object o: config.entrySet()){
            String key = o.toString().split("=")[0];
            System.setProperty(key, config.getString(key));
        }
    }

    public ConfigManager(){
        loadConfig();
    }

    public String getBaseUrl(){
        return System.getProperty("base-url");
    }
}
