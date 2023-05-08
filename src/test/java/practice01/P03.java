package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) {
           /* ...Exercise3...
    Navigate to  https://testpages.herokuapp.com/styled/index.html
    Click on  Calculater under Micro Apps
    Type any number in the first input
    Type any number in the second input
    Click on Calculate
    Get the result
    Print the result
      */


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //  Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();

      //   Type any number in the first input
       WebElement ılkInput = driver.findElement(By.id("number1"));
       ılkInput.sendKeys("20");

       // Type any number in the second input
        WebElement ıkıncıInput= driver.findElement(By.id("number2"));
        ıkıncıInput.sendKeys("30");

        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        // Get the result
        WebElement resulElementı= driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println(resulElementı.getText());


    }
}
