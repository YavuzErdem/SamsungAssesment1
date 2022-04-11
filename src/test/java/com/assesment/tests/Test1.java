package com.assesment.tests;


import com.assesment.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Test1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void test() throws InterruptedException {

       WebElement hamburgerMenu = driver.findElement(By.xpath("//a/i[@class='hm-icon nav-sprite']"));

       hamburgerMenu.click();

        Thread.sleep(1000);


       WebElement TvApplicationsHamburgerMenu = driver.findElement(By.xpath("//a[@data-menu-id='9']"));

       TvApplicationsHamburgerMenu.click();

        Thread.sleep(1000);


       WebElement TelevisionsHamburgerMenu = driver.findElement(By.xpath("//li/a[@href='/gp/browse.html?node=1389396031&ref_=nav_em_sbc_tvelec_television_0_2_9_2']"));

       TelevisionsHamburgerMenu.click();

        Thread.sleep(1000);


        WebElement SamsungCheckBox = driver.findElement(By.xpath("(//*[text()='Samsung'])[1]"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("arguments[0].scrollIntoView(true)",SamsungCheckBox);

        Thread.sleep(2000);

        SamsungCheckBox.click();

        Thread.sleep(1000);


        WebElement dropdownTelevisions = driver.findElement(By.xpath("//span/span[@class='a-button-text a-declarative']    "));

        dropdownTelevisions.click();

        Thread.sleep(1000);


        WebElement dropdownHightoLowTelevisions = driver.findElement(By.xpath("(//li/a[@href='javascript:void(0)'])[3]"));

        dropdownHightoLowTelevisions.click();

        Thread.sleep(1000);


        WebElement SamsungTelevisionImage = driver.findElement(By.xpath("(//div/img[@class='s-image'])[2]"));

        SamsungTelevisionImage.click();

        Thread.sleep(2000);




        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {

            if(!handle.equals(currentWindowHandle)){
                driver.switchTo().window(handle);
            }
        }

        WebElement consoleReport = driver.findElement(By.xpath("//div[@id='feature-bullets']"));

        jse.executeScript("arguments[0].scrollIntoView(true)",consoleReport);

        Thread.sleep(2000);

        System.out.println(consoleReport.getText());


    }



}
