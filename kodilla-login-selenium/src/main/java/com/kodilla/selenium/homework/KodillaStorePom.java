package com.kodilla.selenium.homework;

import com.kodilla.selenium.pom.AbstractPom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom extends AbstractPom {


    @FindBy(css = "input[type='text']")
    WebElement textField;

    public KodillaStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void input(String text) throws InterruptedException {
        textField.sendKeys(text);
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.className("element"));
        if (!elements.isEmpty()) {
            elements.size();
            System.out.println(elements.size());
        } else {
            System.out.println("Brak wyników wyszukiwania");
        }
        textField.clear();

    }

    public void close(){
        driver.close();
    }
}
