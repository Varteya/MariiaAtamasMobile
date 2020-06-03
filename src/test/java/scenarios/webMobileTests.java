package scenarios;

import getData.GetProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.WebPageObject;
import setup.BaseTest;

import java.util.List;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Check that google search is working")
    public void googleSearchTest() throws InterruptedException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        getDriver().get(GetProperties.getProperty("url"));
        // Make sure that page has been loaded completely
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        System.out.println(((WebDriver) getDriver()).getTitle() + " page is opened");

        getPo().getWelement("searchField").sendKeys("EPAM");
        getPo().getWelement("searchButton").click();
        new WebDriverWait(getDriver(), 10).until(
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
        WebElement element = getPo().getWelement("result");
        Assert.assertTrue(element.getText().contains("EPAM"));
        System.out.println("link " + element.getText() + " was found");
    }

}
