package com.kodilla.selenium.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTest {

    KodillaStorePom storePom;

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\garuu\\IdeaProjects\\Karol_Tobolewski-kodilla_tester\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void testIfGetsSameNumberOfSearch() throws InterruptedException {
        String text = "NoteBook";
        storePom.input(text);
        assertEquals(storePom.elements.size(), 2);
    }

    @Test
    public void testIfDiffrentSignsMatter() throws InterruptedException{
        String text = "nOtEbooK";
        storePom.input(text);
        assertEquals(storePom.elements.size(), 2);

    }


    @AfterEach
    public void close(){
        driver.close();
    }

}