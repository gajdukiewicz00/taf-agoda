package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties;

    static {
        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() {
        return properties.getProperty("baseAPI");
    }

    public static String getDriverPath() {
        return properties.getProperty("driverPath");
    }
}
