package lt.techin.stud;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import lt.techin.stud.utils.TestData;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPageTest extends BasePageTest {

    @Test
    @DisplayName("Test Login with Valid Credentials")
    @Tag("valid")
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);


        String username = TestData.generateRandomUsername();
        String password = TestData.generateRandomPassword();
        loginPage.setNavigateToTheLogin();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Expected Title After Login"));

        assertEquals("Expected Title After Login", loginPage.getPageTitle());
    }
}
