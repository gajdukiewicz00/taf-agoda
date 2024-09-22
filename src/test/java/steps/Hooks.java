package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hooks {
    private static final Logger logger = LogManager.getLogger(Hooks.class);

    @Before
    public void setup() {
        logger.info("Настройка теста: инициализация драйвера.");
        DriverFactory.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        logger.info("Завершение теста: закрытие драйвера.");
        DriverFactory.quitDriver();
    }
}
