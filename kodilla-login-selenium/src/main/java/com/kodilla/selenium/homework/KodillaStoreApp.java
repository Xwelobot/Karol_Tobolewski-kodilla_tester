package com.kodilla.selenium.homework;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaStoreApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("C:\\Users\\garuu\\IdeaProjects\\Karol_Tobolewski-kodilla_tester\\chromedriver.exe", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);

        storePom.input("NoteBook");
        storePom.input("School");
        storePom.input("Business");
        storePom.input("Gaming");
        storePom.input("Powerful");
        driver.close();
    }
}
