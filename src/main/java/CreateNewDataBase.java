import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateNewDataBase extends BasePage {

    protected CreateNewDataBase(WebDriver driver, BaseData data) {
        super(driver, data);
    }

    @FindBy(xpath="//input[@value='developer']")
    WebElement freeTierDataBase;

    @FindBy(xpath="//a[@value='c10']")
    WebElement c10DataBase;

    @FindBy(xpath="//a[@value='c20']")
    WebElement c20DataBase;

    @FindBy(xpath="//input[@value='developer']")
    WebElement dataBaseName;

    @FindBy(xpath="//a[@value='c10']")
    WebElement keySpaceName;

    @FindBy(xpath="//a[@value='c20']")
    WebElement dbUserName;

    @FindBy(xpath="//a[@value='c20']")
    WebElement dbPassword;

    @FindBy(xpath="//a[@value='c20']")
    WebElement dbConirmPassword;

    @FindBy(xpath="//button[@data-test-id='Button']")
    WebElement launchDataBase;

    @FindBy(xpath="//span[@data-test-id='ClusterStatusPrefix']")
    WebElement statusPrefix;

    @FindBy(xpath="//span[@data-test-id='ClusterStatusInnerText']")
    WebElement statusValue;

    //react-select-react-select-chip--value

    public void takeAction () {
        if (baseData.isSecondTier()) {
            c10DataBase.click();
        } else if (baseData.isFirstTier()) {
            freeTierDataBase.click();
        }
        Select dropdown = new Select(driver.findElement(By.id("react-select-react-select-chip--value")));
        dropdown.selectByVisibleText(baseData.getRegion());
        dataBaseName.sendKeys(baseData.getDbName());
        keySpaceName.sendKeys(baseData.getKeySpaceName());
        dbUserName.sendKeys(baseData.getDbUserName());
        dbPassword.sendKeys(baseData.getDbPassword());
        dbConirmPassword.sendKeys(baseData.getDbPassword());
        launchDataBase.click();
    }

    public WebElement getStatusPrefix() {
        return statusPrefix;
    }

    public WebElement getStatusValue() {
        return statusValue;
    }

    public WebElement getFreeTierDataBase() {
        return freeTierDataBase;
    }
}
