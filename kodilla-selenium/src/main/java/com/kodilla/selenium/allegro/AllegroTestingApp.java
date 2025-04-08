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


        WebElement category = driver.findElement(By.name("_sacat"));
        WebElement search = driver.findElement(By.name("_nkw"));
        WebElement button = driver.findElement(By.className("gh-search-button__label"));

        search.sendKeys("zegarek");
        Select selectCategory = new Select(category);
        selectCategory.selectByIndex(3);
        button.submit();


        List<WebElement> elements = driver.findElements(By.className("s-item s-item__dsa-on-bottom s-item__pl-on-bottom"));
        if (!elements.isEmpty()) {
            elements.get(0).click();
            System.out.println(elements.get(0).getText());
        } else {
            System.out.println("Brak wyników wyszukiwania");
        }

    }
}
