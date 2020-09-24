import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FirstTierTest extends BaseTest {

    public FirstTierTest(WebDriver driver, BaseData data) {
        super(driver, data);
    }

    @Test
    public void createFirstTierFreeDataBase () {
        baseData.setUserName("setUserName");
        baseData.setPassword("setPassword");
        baseData.setFirstTier(true);
        baseData.setRegion("us-east1");
        launchWebsite("https://astra.datastax.com");
        SignInPage signInPage = new SignInPage(driver, baseData);
        signInPage.takeAction();
        CreateNewDataBase createNewDataBase = new CreateNewDataBase(driver, baseData);
        //waitForPageLoad can be a separate generic method
        waitSmartlyForWebElement(createNewDataBase.getFreeTierDataBase(), 20000);
        createNewDataBase.takeAction();
        waitSmartlyForWebElement(createNewDataBase.getStatusPrefix(), 20000);
        waitSmartlyForWebElement(createNewDataBase.getStatusValue(), 20000);
        Assert.assertEquals(createNewDataBase.getStatusValue().getText(), "Active");
    }

}
