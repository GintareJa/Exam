package lt.techin.stud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
//locators
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "registerButton")
    private WebElement registerButton;

//    methods
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}
