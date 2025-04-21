import org.junit.jupiter.api.Test;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

@Testcontainers
public class ApplicationTest {


    static Network network = Network.newNetwork();

    @Container
    static GenericContainer<?> webServer =
            new GenericContainer<>(new ImageFromDockerfile()
                    .withFileFromClasspath("wizytowka.html", "wizytowka.html")
                    .withDockerfileFromBuilder(builder ->
                            builder.from("httpd:2.4")
                                    .copy("wizytowka.html", "/usr/local/apache2/htdocs/index.html")
                                    .build()))
                    .withNetwork(network)
                    .withNetworkAliases("my-server")
                    .withExposedPorts(80);

    @Container
    static BrowserWebDriverContainer<?> firefox =
            new BrowserWebDriverContainer<>()
                    .withCapabilities(new FirefoxOptions())
                    .withRecordingMode(RECORD_ALL, new File("./build/"))
                    .withRecordingFileFactory(new DefaultRecordingFileFactory())
                    .withNetwork(network);

    @Test
    void customImageTest() throws IOException {
        RemoteWebDriver driver = firefox.getWebDriver();
        driver.get("http://my-server");

        File screenshot = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./build/screenshots/" + screenshot.getName()));

        String title = driver.findElement(By.tagName("h1")).getText();
        assertEquals("Cześć! Jestem Karol", title);
    }
}
