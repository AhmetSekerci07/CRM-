package com.example.Testing.Login;
import com.example.Base.TestBase;
import com.example.Testing.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sql.rowset.JdbcRowSet;
import javax.xml.stream.events.EntityReference;
import java.sql.Driver;

public class Help_Desk extends TestBase {


    //--------------TEST CASE 1 ------------------------------------------

    @Test
    public void HdTest1() throws InterruptedException {

        driver.get("http://login2.nextbasecrm.com/");


        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt = driver.findElement(By.className("login-btn"));

        username.sendKeys("helpdesk37@cybertekschool.com");
        password.sendKeys("UserUser");
        loginbt.click();


        String exptedtedTitle = "(50) Portal";
        String  actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, exptedtedTitle);

    }
        @Test
        public void HdTest2 () {

            driver.get("http://login2.nextbasecrm.com/");

            WebElement username2 = driver.findElement(By.name("USER_LOGIN"));
            WebElement password2 = driver.findElement(By.name("USER_PASSWORD"));
            WebElement loginbt2 = driver.findElement(By.className("login-btn"));

            username2.sendKeys("Invalied@cybertekschool.com");
            password2.sendKeys("UserUser");

            loginbt2.click();

            WebElement errMes1 = driver.findElement(By.className("errortext"));

            String exptedtedTitle2 = "Incorrect login or password";

           Assert.assertEquals(errMes1.getText(),exptedtedTitle2);

        }
    @Test
    public void HdTest3 (){


        driver.get("http://login2.nextbasecrm.com/");

        WebElement username3 = driver.findElement(By.name("USER_LOGIN"));
        WebElement password3 = driver.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt3 = driver.findElement(By.className("login-btn"));

        username3.sendKeys("Invalied@cybertekschool.com");

        password3.sendKeys("InvalidPassword");

        loginbt3.click();

        WebElement errMes3 = driver.findElement(By.className("errortext"));
        String exptedtedTitle3 = "Incorrect login or password";
        String ErrorMessage3 = errMes3.getText();

        Assert.assertEquals(exptedtedTitle3,ErrorMessage3);
    }

      //----------------TEST 4 ---------------------------------
@Test
    public void HdTest4(){

    driver.get("http://login2.nextbasecrm.com/");

        WebElement username4 = driver.findElement(By.name("USER_LOGIN"));
        WebElement password4 = driver.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt4 = driver.findElement(By.className("login-btn"));

        username4.sendKeys("Invalied@cybertekschool.com");

        password4.sendKeys("");

        loginbt4.click();

        WebElement errMes4 = driver.findElement(By.className("errortext"));

        String exptedtedTitle4 = "Incorrect login or password";
        String ErrorMessage4 = errMes4.getText();

        Assert.assertEquals(exptedtedTitle4,ErrorMessage4);




}

        //----------TEST CASE 5 ------------------------


    @Test

    public void HdTest5 (){

        driver.get("http://login2.nextbasecrm.com/");

        WebElement username5 = driver.findElement(By.name("USER_LOGIN"));
        WebElement password5 = driver.findElement(By.name("USER_PASSWORD"));
        WebElement loginbt5 = driver.findElement(By.className("login-btn"));
        username5.sendKeys("Invalied@cybertekschool.com");
        password5.sendKeys("");
        loginbt5.click();

        WebElement errMes5 = driver.findElement(By.className("errortext"));
        String exptedtedTitle5 = "Incorrect login or password";
        String ErrorMessage5 = errMes5.getText();

        Assert.assertEquals(exptedtedTitle5,ErrorMessage5);



    }

    }




