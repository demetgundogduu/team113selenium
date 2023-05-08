package ders02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Aoutomation_Exercise_Category {
    public static void main(String[] args) {


        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
        List<WebElement> aramaBolumundekıElementler=driver.findElements(By.className("panel-title"));

        //4- Category bolumunde 3 element oldugunu test edin
      int expectedCategoryElement=3;
      int actualCtegoryElement=aramaBolumundekıElementler.size();
      if (actualCtegoryElement==expectedCategoryElement){
          System.out.println("category bolumunde 3 element vardır ,test PASSED");
      }else {
          System.out.println("category bolumunde 3 element yoktur, test FAILED");

      }
        //5- Category isimlerini yazdirin
        for (WebElement eachCategoryElementlerı:aramaBolumundekıElementler
             ) {
            System.out.println(eachCategoryElementlerı.getText());

        }

        //6- Sayfayi kapatin
        driver.close();
    }
}
