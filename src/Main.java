import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chromedriver = new ChromeDriver();


//        driver = new FirefoxDriver();
        WebDriver edriver = new EdgeDriver();
//        driver = new SafariDriver();
//        driver = new InternetExplorerDriver();
//        driver = new oPERA???

        runTest(edriver);
        runTest(chromedriver);
    }

    public static void runTest(WebDriver driver) throws InterruptedException {
        driver.get("https://www.google.com/");
// driver.navigate().to("https://www.google.com/");)

        TimeUnit.SECONDS.sleep(5);

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium");
        element.submit();

        System.out.println(driver.getTitle());

        TimeUnit.SECONDS.sleep(5);

              driver.quit();
//        driver.close();
    }
}
