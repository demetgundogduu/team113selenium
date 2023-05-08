package ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin
        driver.get("https://www.youtube.com");
        String expectedBaslık="youtube";
        String actualBaslık=driver.getTitle();
        if (actualBaslık.contains(expectedBaslık)){
            System.out.println("sayfanın baslıgı youtube ıcerır ,test PASSED");
        }else {
            System.out.println("sayfanın baslıgı Youtube içermez ,test FAILED" + actualBaslık);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String expectedUrl="youtube";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("sayfa URL youtube ıçerıyor ,test PASSED");
        }else {
            System.out.println("sayfa URL youtube içermıyor , test FAILED " +actualUrl);
        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedAmozonTitle="Amazon";
        String actualAmazonTitle=driver.getTitle();

        if (actualAmazonTitle.contains(expectedAmozonTitle)){
            System.out.println("sayfa baslıgı Amozon içerıyor test PASSED ");
        }else {
            System.out.println("sayfa baslıgı amazon ıcermıyor test FAILED "+actualAmazonTitle);
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        //doğru URL'yi yazdırın

        String expectedAmozonUrl="https://www.amazon.com/";
        String actualAmozonUrl=driver.getCurrentUrl();
        if (actualAmozonUrl.contains(expectedAmozonUrl)){
            System.out.println("sayda URL'li https://www.amazon.com/ icerır test PASSED ");
        }else {
            System.out.println("sayfa URL'li https://www.amazon.com/ içermıyor test FAILED " + actualAmozonUrl);
        }
        //11.Sayfayi kapati
        driver.quit();

    }
}
