package ders05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_EXERCISE {
    public static void main(String[] args) {
        //1- C01_TekrarTesti isimli bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/ ");
        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        //5- Arama cubuguna “Nutella” yazip aratin
        WebElement aramaCubugu= driver.findElement(By.id("APjFqb"));
        aramaCubugu.sendKeys("Nutella" );
        aramaCubugu.submit();

        //6- Bulunan sonuc sayisini yazdirin
        WebElement sonucSayısıElementı = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayısıElementı.getText());

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu


        String sonucYazisiStr= sonucSayısıElementı.getText();
        String[] sonucYaziKelimeleriArr = sonucYazisiStr.split(" ");
        String sonucSayiAdediStr=sonucYaziKelimeleriArr[1]; // 130.000.000
        sonucSayiAdediStr = sonucSayiAdediStr.replaceAll("\\D",""); // "130000000"
        int sonucSayisiInt= Integer.parseInt(sonucSayiAdediStr);
        if (sonucSayisiInt>10000000){
            System.out.println("sonuc sayisi testi PASSED");
        }else{
            System.out.println("Sonuc sayisi testi FAILED");
        }








        //8- Sayfayi kapatin
        driver.close();
    }
}
