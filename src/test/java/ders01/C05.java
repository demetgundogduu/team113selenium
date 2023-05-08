package ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdırın
        driver.get("https://www.facebook.com");
       String expectedTitle="facebook";
       String actualTitle=driver.getTitle();
       if (actualTitle.contains(expectedTitle)){
           System.out.println("sayfanın baslıgı facebook ıcverıyor test PASSED ");
       }else {
           System.out.println("sayfanın baslıgı facebook ıcermıyor test FAILED "+actualTitle);
       }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa  ,“actual” URL’i yazdirin.
        String expectedUrl="facebook";
       String actualUrl=driver.getCurrentUrl();
       if (expectedUrl.contains(expectedUrl)){
           System.out.println("sayfa url facebook kelimesi içeriyor,test PASSED");
       }else {
           System.out.println("sayfa url facebook kelımesı ıcermıyor, test FAILED " +actualUrl);
       }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedWalnartTitle="Walmart.com";
        String actualWalmartTitle=driver.getTitle();
        if (actualWalmartTitle.contains(expectedWalnartTitle)){
            System.out.println("sayfa baslıgı  Walmart.com içerıyor test,PASSED");
        }else {
            System.out.println("sayfa baslıgı  Walmart.com içermıyor test,FAILED");
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapati
        driver.quit();
    }
}
