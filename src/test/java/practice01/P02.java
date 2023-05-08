package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) {
         /*
     . .Exercise2...
          1-Driver oluşturalim
          2-Java class'imiza chnomedriver.exet i tanitalim
          3-Driver'in tum ekranı kaplamasini saglayalim
          4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
          Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
          5-"https://www.otto.de” adresine gidelim
          6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
         8-Ardindan "https://wisequarter.com/” adresine gidip
         9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        10-Bir onceki web sayfamiza geri donelim
         11-Sayfayı yenileyelim
        12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
         13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // 5-"https://www.otto.de” adresine gidelim
        driver.navigate().to("https://www.otto.de");
      //  6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
         String expectedTitlOtto="0TT0";
         String actualTitleOtto=driver.getTitle();
      //  7-Title ve url inin "0TT0” kelimesinin içerip icermedigini kontrol edelim
         if (actualTitleOtto.contains(expectedTitlOtto)){
             System.out.println("title OTTO içeriyor test ,PASSED");
         }else {
             System.out.println("title OTTO içermiyor test, FAILED");
         }

        String expectedUrlOtto="0TT0";
         String actualUrlOtto=driver.getCurrentUrl();
         if (actualUrlOtto.contains(expectedUrlOtto)){
             System.out.println("Url OTTO kelımesını içerıyor test, PASSED");
         }else {
             System.out.println("Url OTTO kelımesını içermıyor test, FAILED");
         }

        //8-Ardindan "https://wisequarter.com/” adresine gidip
        driver.navigate().to("https://wisequarter.com/");

        //  9-BU adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
        String expectedWiseTitle="Quarter";
        String actualWiseTitle=driver.getTitle();

         if (actualWiseTitle.contains(expectedWiseTitle)){
             System.out.println("title Quarter içeriyor test ,PASSED");
         }else {
             System.out.println("title Quarter içermiyor test, FAILED");
         }

       // 10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();


         // 11-Sayfayı yenileyelim
        driver.navigate().refresh();

       // 12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim

         driver.navigate().forward();

      //  13- En son adim olarak butun sayfalarimizi kapatmis olalim

        driver.quit();
    }
}
