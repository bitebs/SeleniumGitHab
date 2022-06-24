
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GithubTest{
    private static WebDriver driver = null;
    private final String baseUrl = "https://www.github.com/";

    @Test
    @Order(1)
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","d:/гк/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test
    @Order(2)
    public void getTitle(){
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains("Github".toUpperCase()));
    }

    @Test
    @Order(3)
    public void gotoLink(){
        driver.get(baseUrl+"login");
    }

    @Test
    @Order(4)
    public void signIn(){
        WebElement input = driver.findElement(By.id("login_field"));
        input.sendKeys("bitebs");
        input = driver.findElement(By.id("password"));
        input.sendKeys("bitebs");
        input = driver.findElement(By.xpath("//input[@name='commit']"));
        input.click();
    }

    @Test
    @Order(5)
    public void signOut(){
        driver.get(baseUrl+"logout");
        WebElement input = driver.findElement(By.xpath("//input[@value='Sign out']"));
        input.click();
    }
}
