package com.example.Testing.Login;

import com.example.Testing.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sql.rowset.JdbcRowSet;
import javax.xml.stream.events.EntityReference;
import java.sql.Driver;

public class Help_Desk {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) throws InterruptedException {

        //--------------TEST CASE 1 ------------------------------------------


        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("http://login2.nextbasecrm.com/");
        // creating new account

        WebElement username = driver1.findElement(By.name("USER_LOGIN"));
        WebElement password = driver1.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt = driver1.findElement(By.className("login-btn"));


        username.sendKeys("helpdesk37@cybertekschool.com");
        // Thread.sleep(3000);

        password.sendKeys("UserUser");
        // Thread.sleep(3000);

        loginbt.click();
        //Thread.sleep(3000);

        String actualTitle;
        String exptedtedTitle;

        exptedtedTitle = "(50) Portal";
        actualTitle = driver1.getTitle();


        if (exptedtedTitle.equals(actualTitle)) {
            System.out.println(ANSI_CYAN +"Title correct ~ Test Case #1 Passed "+ANSI_CYAN);
            driver1.quit();
        } else {
            System.err.println("Title Failed ~ Test Case #1 ");
            driver1.quit();
        }

//------------------------TEST CASE 2----------------------------------------
        WebDriver driver2 = WebDriverFactory.getDriver("chrome");
        driver2.get("http://login2.nextbasecrm.com/");

        WebElement username2 = driver2.findElement(By.name("USER_LOGIN"));
        WebElement password2 = driver2.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt2 = driver2.findElement(By.className("login-btn"));

        username2.sendKeys("Invalied@cybertekschool.com");

        password2.sendKeys("UserUser");

        loginbt2.click();

        WebElement errMes1 = driver2.findElement(By.className("errortext"));
        String exptedtedTitle2 = "Incorrect login or password";

        String ErrorMessage = errMes1.getText();
        System.out.println(ErrorMessage);


        if (exptedtedTitle2.equals(ErrorMessage)) {
            System.out.println( "Title Correct ~ Test Case #2 Passed " + ANSI_CYAN);
            driver2.quit();
        } else {
            System.err.println("Title Failed ~ Test Case #2 Failed ");
            driver2.quit();
        }

        //------------------TEST CASE 3 ----------------------------------

        WebDriver driver3 = WebDriverFactory.getDriver("chrome");
        driver3.get("http://login2.nextbasecrm.com/");

        WebElement username3 = driver3.findElement(By.name("USER_LOGIN"));
        WebElement password3 = driver3.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt3 = driver3.findElement(By.className("login-btn"));

        username3.sendKeys("Invalied@cybertekschool.com");

        password3.sendKeys("InvalidPassword");

        loginbt3.click();

        WebElement errMes3 = driver3.findElement(By.className("errortext"));
        String exptedtedTitle3 = "Incorrect login or password";

        String ErrorMessage3 = errMes3.getText();
        System.out.println(ErrorMessage);


        if (exptedtedTitle3.equals(ErrorMessage3)) {
            System.out.println("Title Correct ~ Test Case #3 Passed ");
            driver3.quit();
        } else {
            System.err.println("Title Failed ~ Test Case #3 Failed ");
            driver3.quit();
        }

        //----------------TEST 4 ---------------------------------
        WebDriver driver4 = WebDriverFactory.getDriver("chrome");
        driver4.get("http://login2.nextbasecrm.com/");

        WebElement username4 = driver4.findElement(By.name("USER_LOGIN"));
        WebElement password4 = driver4.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt4 = driver4.findElement(By.className("login-btn"));

        username4.sendKeys("Invalied@cybertekschool.com");

        password4.sendKeys("");

        loginbt4.click();

        WebElement errMes4 = driver4.findElement(By.className("errortext"));
        String exptedtedTitle4 = "Incorrect login or password";

        String ErrorMessage4 = errMes4.getText();
        System.out.println(ErrorMessage);


        if (exptedtedTitle4.equals(ErrorMessage3)) {
            System.out.println("Title Correct ~ Test Case #4 Passed ");
            driver4.quit();
        } else {
            System.err.println("Title Failed ~ Test Case #4 Failed ");
            driver4.quit();
        }
        //----------TEST CASE 5 ------------------------

        WebDriver driver5 = WebDriverFactory.getDriver("chrome");
        driver5.get("http://login2.nextbasecrm.com/");

        WebElement username5 = driver5.findElement(By.name("USER_LOGIN"));
        WebElement password5 = driver5.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt5 = driver5.findElement(By.className("login-btn"));

        username5.sendKeys("Invalied@cybertekschool.com");

        password5.sendKeys("");

        loginbt5.click();

        WebElement errMes5 = driver5.findElement(By.className("errortext"));
        String exptedtedTitle5 = "Incorrect login or password";

        String ErrorMessage5 = errMes5.getText();
        System.out.println(ErrorMessage);


        if (exptedtedTitle5.equals(ErrorMessage3)) {
            System.out.println("Title Correct ~ Test Case #5 Passed ");
            driver5.quit();
        } else {
            System.err.println("Title Failed ~ Test Case #5 Failed ");
            driver5.quit();
        }
    }
}

