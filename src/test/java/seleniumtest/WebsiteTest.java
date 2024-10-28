import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.Assert;

public class WebsiteTest {

    @Test
    public void testWebsite() {
       

        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        try {
            // Open a website
            driver.get("https://www.mhssce.ac.in/");

           driver.manage().window().maximize();

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
