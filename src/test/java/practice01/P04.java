package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {
    public static void main(String[] args) {

          /*
    Navigate to website https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    click on Alerts
    print the URL
    navigate back
    print the URL
    Click on Basic Ajax
    print the URL
    enter value 20 and ENTER
    and then verify Submitted Values is displayed open page
    close driver
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//*[@id='alerts']")).click();

      //print the URL
        System.out.println(driver.getCurrentUrl());
      // navigate back
        driver.navigate().back();

        //print the URL

        System.out.println(driver.getCurrentUrl());

        //  Click on Basic Ajax
        driver.findElement(By.id("basicajax")).click();

        //print the URL

        System.out.println(driver.getCurrentUrl());

         //enter value 20 and ENTER
        WebElement valueElementı= driver.findElement(By.id("lteq30"));
         valueElementı.sendKeys("20" + Keys.ENTER);

         //and then verify Submitted Values is displayed open page
          String expected="Submitted Values";
        WebElement actualelementı=driver.findElement(By.xpath("//p[text()='Submitted Values']"));
           String actual=actualelementı.getText();
           if (actual.contains(expected)){
               System.out.println("test Passed");
           }else {
               System.out.println("test FAILED");

           }
        //    close driver
          driver.close();






    }
}
