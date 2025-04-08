package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import com.testautomationguru.ocular.snapshot.Snap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Snap("WorldTime.png")
public class WorldTimePage {

    private static final String pageUrl = "https://www.worldtimeserver.com/current_time_in_AW.aspx";

    private WebDriver webDriver;

    public WorldTimePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open() throws InterruptedException {
        webDriver.get(pageUrl);
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div[3]/div/div[2]")).click();
    }

    public void close() {
        webDriver.quit();
    }

    public void compare() {
        Ocular.snapshot()
                .from(this)
                .sample().using(webDriver)
                .compare();
    }
}
