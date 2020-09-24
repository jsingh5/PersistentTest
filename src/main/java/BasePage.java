import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected BaseData baseData;
    protected BasePage (WebDriver driver, BaseData data) {
        this.driver = driver;
        this.baseData = data;
    }

}
