package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.IOException;

public class StoreSearchExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver-win64\\chromedriver.exe");
//        System.setProperty("webdriver.firefox.driver", "C:\\selenium-drivers\\Firefox\\geckodriver.exe");

        WebDriver chromedriver = new ChromeDriver();
//        WebDriver geckodriver = new FirefoxDriver();

        chromedriver.get("https://kodilla.com/pl/test/store");
//        geckodriver.get("https://kodilla.com/pl/test/store");

        WebElement inputField = chromedriver.findElement(By.name("search"));
        inputField.sendKeys("School");
        inputField.submit();
    }
}
