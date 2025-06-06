package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://kodilla.com/pl/test/login");

        WebElement email = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
        email.sendKeys("test@email.com");
        password.sendKeys("pass123");

    }
}
