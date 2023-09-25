package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){

        System.setProperty("web-driver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        //driver.get("https://the-internet.herokuapp.com/");
        //System.out.println(driver.getTitle());
        homePage = new HomePage(driver);

    }

    //@AfterClass
    public void tearQuit(){
        driver.quit();
    }



}
