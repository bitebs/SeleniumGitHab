package istockphoto;

import org.junit.jupiter.api.*;// именно этот всегда надо подключать
import
        org.openqa.selenium.By
        ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IStockPhotoChromeTest {
    protected static WebDriver driver = null;
    protected final String baseUrl="https://www.istockphoto.com/ru/";



    @Test
    @Order(1)
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "d:/гк/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @Test
    @Order(2)
    @Disabled
    //Перейти по ссылке "Архитектура"
    public void getArchitecture(){
        driver.get(baseUrl+"/стоковое-видео/архитектура");
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("стоковые hd видеоклипы".toUpperCase()));
    }
    @Test
    @Order(3)
    //зарегистрироваться
    public void register()
    {
        driver.get(baseUrl+"join");
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("Регистрация".toUpperCase()));
    }

    @Test
    @Order(4)

    public void SignUp(){
        //*[@id="register_email"]
        //*[@id="register_password"]
        //*[@id="register_password_confirmation"]
        WebElement email = driver.findElement(By.id("register_email"));

        email.sendKeys(generate());
        WebElement password = driver.findElement(By.id("register_password"));
        password.sendKeys("11111111a");
        WebElement passwordConfirm = driver.findElement(By.id("register_password_confirmation"));
        passwordConfirm.sendKeys("11111111a");
        Select countries = new Select(driver.findElement(By.id("register_country_code")));
        countries.selectByVisibleText("Российская Федерация");
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        checkbox.click();
        WebElement button = driver.findElement(By.xpath("//*[@id='register-button']"));
        button.click();

        //*[@id="register-button"]
        //register_email_preference


    }

    @Test
    @Order(5)
    public void SignOut(){
        driver.get(baseUrl+"sign-out");
        Assertions.assertTrue(driver.getTitle().toUpperCase().contains
                ("Stock images".toUpperCase()));
    }

    @Test
    @Order(6)
    public String generate(){
        //String s = "abcd";
        String s = "";
        Random random = new Random();
        for(int i=0; i<4; i++){
            int n = random.nextInt(122-97+1)+97;
            char c = (char)n;
            s+=c;
        }

        int number = random.nextInt(1000)+1000;
        s+=String.valueOf(number);
        s+="gmail.com";
        return s;
    }


}