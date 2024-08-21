package lt.techin.stud;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePageTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://192.168.88.208/");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
