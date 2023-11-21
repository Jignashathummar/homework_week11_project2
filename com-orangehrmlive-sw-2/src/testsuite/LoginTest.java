package testsuite;
/**
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void openBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    //Enter “Admin” username
    //* Enter “admin123 password
    //* Click on ‘LOGIN’ button
    //* Verify the ‘Dashboard’ text is display
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertEquals("Dashboard", driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText());
    }

    @After
    public void close() {
        closeBrowser();
    }
}
