package istockphoto;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IStockPhotoEdge extends IStockPhotoChromeTest {
    //protected static WebDriver driver = null;
    //protected final String baseUrl="https://www.istockphoto.com/ru/";



    @Test
    @Order(1)
    public void openBrowser(){
        System.setProperty("webdriver.edge.driver", "d:/гк/msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }




}