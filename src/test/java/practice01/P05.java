package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {
    public static void main(String[] args) throws InterruptedException {

        /*
         1-Driver oluşturalim
    2-Java class'imiza chnomedriver. exetyi tanitalim
    3-Driver'in tum ekranı kaplamasini sagu ayalim
    4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
     Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
    5-Navigate to http://www.babayigit.net/murat/testpage.html
    6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
        alanlarına gerekli bilgileri yazsın
    7-Submit tuşuna bassın.
    8- All information was entered correctly.. yazısının göründüğünü test etsin
    9- Clear butonu ile tüm butonları temizlesin
    10- Manuel olarak temizlendiğini görecek kadar beklesin
    11- Sayfayı kapatsın
    10-8. maddededeki Test sonucunu yazdırsın
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.navigate().to(" http://www.babayigit.net/murat/testpage.html");

      //  6-first name, surname, age, Your Job, Birth Palace, Lastgraduated school, Number of Children
       // alanlarına gerekli bilgileri yazsın
        WebElement nameElementı= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        nameElementı.sendKeys("DERYA");
          WebElement surnameElementi = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
          surnameElementi.sendKeys("Gül");
        WebElement yasElementi= driver.findElement(By.id("yas"));
        yasElementi.sendKeys("28");

        WebElement meslekElementı= driver.findElement(By.id("meslek"));
        meslekElementı.sendKeys("Doktor");

        WebElement dogumYeriElementı= driver.findElement(By.id("dogum_yeri"));
        dogumYeriElementı.sendKeys("Istanbul");

        WebElement lastGraduadeSchoolElementı =driver.findElement(By.id("mezun_okul"));
        lastGraduadeSchoolElementı.sendKeys("HARVARD UNIVERSTY");

        WebElement numberOfChildren=driver.findElement(By.id("cocuk_sayisi"));
        numberOfChildren.sendKeys("1");

       WebElement submitButonuElemntı =driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
           submitButonuElemntı.click();

        //8- All information was entered correctly yazısının göründüğünü test etsin

           WebElement allInformatıonYazısıElementı=driver.findElement(By.id("uyari"));

           if (allInformatıonYazısıElementı.isDisplayed()){
               System.out.println("All information was entered correctly  gorunuyor test , PASSED");
           }else {
               System.out.println("All information was entered correctly  gorunmuyor test , FAILED");
           }


           //9- Clear butonu ile tüm butonları temizlesin
           WebElement clearButonuElementı=driver.findElement(By.xpath("//input[@type='reset']"));
           clearButonuElementı.click();


           //10- Manuel olarak temizlendiğini görecek kadar beklesin
            Thread.sleep(3000);

        //11- Sayfayı kapatsın
        driver.close();

           // 10-8. maddededeki Test sonucunu yazdırsın

        System.out.println("All information was entered correctly.. ");






    }
}
