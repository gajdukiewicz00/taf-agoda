package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("Unable to find application.properties");
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getAgodaBaseUrl() {
        return getProperty("agoda.base.url");
    }

    public static String getAgodaBaseAPI() {
        return getProperty("agoda.base.api");
    }

    public static String getWebDriverPath() {
        return getProperty("webdriver.chrome.driver");
    }
}
