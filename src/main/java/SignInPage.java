import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    protected SignInPage(WebDriver driver, BaseData baseData) {
        super(driver, baseData);
    }

    @FindBy(id="username")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    //just another way of finding elements in case id's are not present
    @FindBy(xpath="//a[@href='https://astra.datastax.com/register']")
    WebElement signUpButton;

    @FindBy(xpath="//input[@name='login']")
    WebElement loginButton;

    @FindBy(xpath="//a[@id='zocial-github']")
    WebElement signInWithGit;

    @FindBy(xpath="//a[@id='zocial-google']")
    WebElement signInWithGoogle;

    public void takeAction () {
        if (baseData.getUserName() != null && baseData.getPassword() != null) {
            userName.sendKeys(baseData.getUserName());
            password.sendKeys(baseData.getPassword());
            loginButton.click();
        } else if (baseData.isGithubSignIn()) {
            signInWithGit.click();
        } else if (baseData.isGoogleSignIn()) {
            signInWithGoogle.click();
        } else {
            signUpButton.click();
        }
    }
}
