package ders02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Aoutomatıon_Exercise_Link {
    public static void main(String[] args) {
        //Automation Exercise Link Testi
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> elementLıstesi=driver.findElements(By.tagName("a"));
        int expectedElementLıstesi=147;
        int actualElementLıstesı=elementLıstesi.size();
        if (actualElementLıstesı==expectedElementLıstesi){
            System.out.println("sayfada 147 adet lınk bulunur test ,PASSED");
        }else {
            System.out.println("sayfada 147 adet lınk bulunmaztest ,FAILED");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText(" Products")).click();
        //5- special offer yazisinin gorundugunu test edin
        WebElement specıalOfferr=driver.findElement(By.id("sale_image"));
        if (specıalOfferr.isDisplayed()){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}
