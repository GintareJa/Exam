package lt.techin.stud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
//locators
@FindBy(css = "div#_desktop_user_info .hidden-sm-down")
private WebElement navigateToTheLogin;
    @FindBy(css = "input#field-email")
    private WebElement usernameField;

    @FindBy(css = "input#field-password")
    private WebElement passwordField;

    @FindBy(css = "button#submit-login")
    private WebElement loginButton;



//    methods
    public void setNavigateToTheLogin(){navigateToTheLogin.click();}
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
