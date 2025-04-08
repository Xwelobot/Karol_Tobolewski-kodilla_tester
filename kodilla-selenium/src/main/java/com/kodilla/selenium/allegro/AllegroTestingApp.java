package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.ebay.pl/");
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement category = driver.findElement(By.className("_sacat"));
        WebElement search = driver.findElement(By.className("_nkw"));
        WebElement button = driver.findElement(By.className("gh-search-button__label"));

        Select selectCategory = new Select(category);
        selectCategory.selectByIndex(3);
        search.sendKeys("zegarek");
        button.submit();


        List<WebElement> elements = driver.findElements(By.className("srp-results srp-grid clearfix"));
        elements.get(0).click();
        elements.get(0).getText();


    }
}
