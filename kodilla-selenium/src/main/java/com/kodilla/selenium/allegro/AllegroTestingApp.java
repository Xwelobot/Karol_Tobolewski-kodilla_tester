package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://allegro.pl");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement category = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/select[1]"));
        WebElement search = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/input[1]"));
        WebElement button = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/span[1]"));

        Select selectCategory = new Select(category);
        selectCategory.selectByIndex(3);
        search.sendKeys("Mavic mini");
        button.submit();

    }
}
