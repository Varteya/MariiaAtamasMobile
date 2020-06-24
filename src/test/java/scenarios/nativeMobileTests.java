package scenarios;

import setup.GetProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;

public class nativeMobileTests extends BaseTest {


    @Test(groups = {"native"}, description = "Register new account test")
    public void registerNewUser() throws IllegalAccessException, NoSuchFieldException, InstantiationException, InterruptedException {
        getPo().getWelement("registerBtn").click();
        getPo().getWelement("registrationEmailField").sendKeys(GetProperties.getProperty("email"));
        getPo().getWelement("registrationUsernameField").sendKeys(GetProperties.getProperty("username"));
        getPo().getWelement("registrationPasswordField").sendKeys(GetProperties.getProperty("password"));
        getPo().getWelement("registrationConfirmPasswordField").sendKeys(GetProperties.getProperty("password"));
        getPo().getWelement("registerNewAccountBtn").click();
        System.out.println("Registration is completed");
        getPo().getWelement("loginUsernameField").sendKeys(GetProperties.getProperty("email"));
        getPo().getWelement("loginPasswordField").sendKeys(GetProperties.getProperty("password"));
        getPo().getWelement("signInBtn").click();
        System.out.println("Login is completed");
        String actionBarText = getPo().getWelement("actionBar").getText();
        System.out.println(actionBarText + " is opened");
        Assert.assertEquals(actionBarText, "BudgetActivity");

    }

}
