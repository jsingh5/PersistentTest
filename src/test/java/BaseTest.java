import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver = null;
    public BaseData baseData = null;

    public BaseTest(WebDriver driver, BaseData data) {
        this.driver = driver;
        this.baseData = data;
    }
    //in real project launching browser will be managed via System properties using selenium grid
    @BeforeTest
    public WebDriver launchBrowser () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @AfterTest
    public void afterTest () {
        driver.quit();
    }

    //we can have multiple starting points in the tests like create account page, sign in page and many other marketing pages
    public void launchWebsite (String url) {
        driver.navigate().to(url);
    }

    //This function will smartly wait for a webElement to appear and as soon as it is visible it will return the web element
    public WebElement waitSmartlyForWebElement(WebElement element, long duration) {
        long startTime = System.currentTimeMillis();
        while(System.currentTimeMillis() - startTime < duration) {
            if(element != null) {
                break;
            }
        }
        return element;
    }

}
