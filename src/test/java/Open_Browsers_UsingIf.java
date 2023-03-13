import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Open_Browsers_UsingIf {


    public static void main(String[] args) {
        String BrowserType="chrome";
        WebDriver driver = null ;

        if(BrowserType.equals("chrome")){
            //1- Define the bridge using one of two techniques (System.setProperty, WebDriverManager)   if needed‏
           // WebDriverManager.chromedriver().setup();
            //2- Create new object from WebDriver Interface‏
            driver = new ChromeDriver();
        } else if (BrowserType.equals("edge")) {
            //1- Define the bridge using one of two techniques (System.setProperty, WebDriverManager)   if needed‏
            WebDriverManager.edgedriver().setup();
            //2- Create new object from WebDriver Interface‏
            driver= new EdgeDriver();
        }

        //3- driver Configurations
        //3.1- maximize window‏
        //3.2- implicit wait‏
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        //4- User go to the website‏
        driver.navigate().to("https://the-internet.herokuapp.com/login");



        // wait for 3 seconds before quitting the driver using sleep() method inside Thread class (Java)‏
        // last Step‏
        driver.quit();
    }
}
