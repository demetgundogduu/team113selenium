package ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String baslıkexpected="Amozon";
        String baslıkactual=driver.getTitle();
        if (baslıkactual.contains(baslıkexpected)){
            System.out.println("baslık amazon ıcerır test PASSED");
        }else {
            System.out.println("baslık amazon ıcermez test FAILED");
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String urlexpected="https://www.amazon.com/";
        String urlactual=driver.getCurrentUrl();
        if (urlactual.contains(urlexpected)){
            System.out.println("sayfa url amazon ıcerıyor, test PASSED");
        }else {
            System.out.println("sayfa url amazon ıcermıyor, test FAILED");
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println("sayfanın handle degeri"+driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedıcerık="alısverıs";
        String actualPageSource=driver.getPageSource();
        if (actualPageSource.contains(expectedıcerık)){
            System.out.println("sayfa kaynak kodları alısverıs ıcerıyor test PASSED");
        }else {
            System.out.println("sayfa kaynak kodları alısverıs ıcermıyor test FAILED");
        }

        //10. Sayfayi kapati
        driver.close();
    }
}
