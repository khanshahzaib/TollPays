package DataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    //region Class Function Explanation
    /**
     * propertyFilePath : This is just a String variable which holds the information of the config file path.
     * <p>
     * new FileReader(propertyFilePath) : Creates a new FileReader, given the name of the file to read from.
     * <p>
     * new BufferedReader(new FileReader(propertyFilePath)) : Reads text from a character-input stream, buffering
     * characters so as to provide for the efficient reading of characters, arrays, and lines.
     * <p>
     * new Properties() : The Properties class represents a persistent set of properties. The Properties can be
     * saved to a stream or loaded from a stream. Each key and its corresponding value in the property list is a string.
     * <p>
     * properties.load(reader) : Reads a property list (key and element pairs) from the input character stream in a
     * simple line-oriented format.
     * <p>
     * properties.getProperty(“driverPath”) :Properties object gives us a .getProperty method which takes the Key of
     * the property as a parameter and return the Value of the matched key from the .properties file.
     * If the properties file does not have the specified key, it returns the null. This is why we have put the null
     * check and in case of null we like to throw an exception to stop the test with the stack trace information.
     * <p>
     * Note: Although it is bad practice to create object of property file in every class. We created the object of the
     * same in Steps file and now we created again in the HomePage class. But do not worry for now, I got something
     * special for you in the next chapter.
     **/
    //endregion

    private Properties properties;

    //region This function is used to read the Key Value Pairs from the Config File
    public ConfigFileReader() {
        BufferedReader reader;
        String propertyFilePath = "Configuration//Config.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    //endregion

    //region This Function is used to get key value of a Browser
    public String getBrowser() {
        String WebBrowser = properties.getProperty("browser");
        if (WebBrowser != null) return WebBrowser;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }
    //endregion

    //region This Function is used to get key value of a Driver Path
    public String getDriverPath() {
        String driverPath = properties.getProperty("driverPath");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }
    //endregion

    //region This Function is used to get key value of a Implicitly Wait
    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }
    //endregion

    //region This Function is used to get key value of a Explicit Wait
    public long getExplicitWait() {
        String explicitWait = properties.getProperty("explicitWait");
        if (explicitWait != null) return Long.parseLong(explicitWait);
        else throw new RuntimeException("explicitWait not specified in the Configuration.properties file.");
    }
    //endregion

    //region This Function is used to get key value of a URL
    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }
    //endregion

    //region This Function is used to get key value of a TollPays App Keywords File Path
    public String getTollPaysAppKeywords() {
        String excelPath = properties.getProperty("tollPaysKeywords");
        if (excelPath != null) return excelPath;
        else throw new RuntimeException("TollPaysAppKeywords not specified in the Configuration.properties file.");
    }
    //endregion
}