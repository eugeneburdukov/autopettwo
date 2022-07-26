package tests.base;

import common.CommonActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.base.privatphonecharge.PrivatPhoneCharge;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected PrivatPhoneCharge privatPhoneCharge = new PrivatPhoneCharge(driver);

    @AfterEach
    void clearCookiesAndLocalStorage(){
        
    }

}
