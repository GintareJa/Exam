package lt.techin.stud;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import lt.techin.stud.utils.TestData;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPageTest extends BasePageTest {

    @Test
    @DisplayName("Test Registration with Random Data")
    @Tag("registration")
    public void testRegistrationWithRandomData() {
        RegisterPage registerPage = new RegisterPage(driver);


        String randomUsername = TestData.generateRandomUsername();
        String randomPassword = TestData.generateRandomPassword();
        String randomEmail = TestData.generateRandomEmail();

        registerPage.enterUsername(randomUsername);
        registerPage.enterPassword(randomPassword);
        registerPage.enterEmail(randomEmail);
        registerPage.clickRegisterButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Expected Title After Registration"));

        assertEquals("Expected Title After Registration", registerPage.getPageTitle());
    }
}
