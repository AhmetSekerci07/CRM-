package com.example.challance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Ebay {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

/*
        driver.get("https://www.ebay.com");

        WebElement search = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        search.sendKeys("apple watch series 7"+ Keys.ENTER);


        WebElement item = driver.findElement(By.partialLinkText("Apple Watch Series 7, All Sizes, All Cases, Black Sport Band, GPS/4G - Excellent"));
        item.sendKeys(Keys.ENTER);

*/
        driver.get("https://www.ebay.com/itm/384769370650?hash=item59960aaa1a:g:-E0AAOSwZPViJh1g&amdata=enc%3AAQAHAAAA8KOT35RM%2F%2BhPIrUxPwLsTL1mXfXziEWDYgx9lLnR9MQ1s4BTPHTocZXbA3ZfwYgAdFsWM%2Fmo9DOPOWkqGgGpDxTNH4CfLmv5j2QZuLVAyAYsG8EusMRQKE6GHr%2Fs5vy6HMANhBpbg5y1cwRwdMZyJYJFbl18OzY%2BgsCRPWxKUggH1JY8rFCQ3DF3eCwmT%2FBQGIOC2hPXF8pJ3A6mllMEXJW1pdFoQFu%2FYypxywM%2Fs3qUHzxM381aaNAFz41AIbRRXe4Jqu%2FHsbb40%2BXD97Ivsvdsez48pRY4yV%2BpVzwOym45nRQt9%2Fvyp2zVRbVEblNeZA%3D%3D%7Ctkp%3ABFBMnuzcxqBg");

        Select opt1 = new Select(driver.findElement(By.id("msku-sel-1")));
        opt1.selectByIndex(1);

        Select opt2 = new Select(driver.findElement(By.id("msku-sel-2")));
        opt2.selectByIndex(1);

        Select opt3 = new Select(driver.findElement(By.id("msku-sel-3")));
        opt3.selectByIndex(1);

        WebElement verifyprice = driver.findElement(By.id("mm-saleDscPrc"));
        verifyprice.getText();
        String expprice = "$611.99";


        WebElement verifytitle = driver.findElement(By.partialLinkText("Apple Watch Series 7, All Sizes, All Cases, Black Sport Band, GPS/4G - Excellent"));
        verifytitle.getText();
        String exptitle = "Apple Watch Series 7, All Sizes, All Cases, Black Sport Band, GPS/4G - Excellent";


    }


}

