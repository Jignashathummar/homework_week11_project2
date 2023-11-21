package testsuite;
/**
 * 4. Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfull
 * y
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void openBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link Verify the text ‘Reset Password’

        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        Assert.assertEquals("Reset Password", driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText());
    }

    @After
    public void close() {
        closeBrowser();
    }
}
