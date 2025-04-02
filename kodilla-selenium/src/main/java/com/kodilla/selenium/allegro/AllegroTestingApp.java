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
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://allegro.pl");

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement category = driver.findElement(By.className("mse2_40 mqen_m6 m911_5r mefy_5r mnyp_5r mdwl_5r mj6k_n7 mg9e_0 mj7a_0 mh36_8 mvrt_8 _535b5_v6cmg"));
        WebElement search = driver.findElement(By.className("m7er_k4 mgn2_14 mp0t_0a m9tr_5r mx7m_1 m911_co mnyp_co mdwl_co mlkp_ag mefy_5r mm2b_0 mldj_0 mtag_2 msbw_2 mzaq_1 mjyo_6x mse2_40 mqu1_40 mg9e_8 mvrt_8 mj7a_8 mh36_8 msts_n7 _535b5_3WgCA"));
        WebElement button = driver.findElement(By.className("mh36_16 mvrt_16 mqu1_40 mpof_5r mpof_z0_m"));

        Select selectCategory = new Select(category);
        selectCategory.selectByIndex(3);
        search.sendKeys("Mavic mini");
        button.submit();
        List<WebElement> elements = driver.findElements(By.className("mvrt_8 mse2_k4"));
        elements.get(0).click();
        elements.get(0).getText();


    }
}
