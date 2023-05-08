package ders03_locators_Relatıve_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_exercıse {
    public static void main(String[] args) {

        //- bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        String expectedTitle="Spend less";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("sayfa baslıgı  Spend less ifadesını ıcerıyor test PASSES ");
        }else {
            System.out.println("sayfa baslıgı Spend less ifadesini içermıyor test ,FAILED");
        }
        //6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']")).click();
        //7- Birthday butonuna basin
        driver.findElement(By.xpath("//a[@aria-label='Birthday']")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
          driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        //9- Gift card details’den 25 $’i secin
       WebElement ucretElemnt=driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]"));
             ucretElemnt.click();
        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretElementıDegerı= driver.findElement(By.xpath("(//span[@class='a-color-price a-text-bold'])[1]"));
           String expectedUcreti="25$";
           String actualUcreti=ucretElemnt.getText();
           if (actualUcreti.equals(ucretElemnt)){
               System.out.println("test PASSED");
           }else {
               System.out.println("test FAILED");
           }


        //11-Sayfayi kapati
        driver.close();
    }
}
