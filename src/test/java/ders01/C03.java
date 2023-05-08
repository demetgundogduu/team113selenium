package ders01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
          driver.get("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("ekran boyutu"+driver.manage().window().getSize());
        System.out.println("ekran konumu" +driver.manage().window().getPosition());
        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //8. Sayfanin konumunu ve boyutlarini fullsceen durumunda yazdırın
        driver.manage().window().fullscreen();
        System.out.println("konumu fullscreen "+driver.manage().window().getSize());
        System.out.println("boyutu fullscreen "+ driver.manage().window().getPosition());

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapini
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        driver.manage().window().maximize();
        System.out.println("konumu maximize "+driver.manage().window().getSize());
        System.out.println("boyutu maximize "+ driver.manage().window().getPosition());
        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //8. Sayfanin konumunu ve boyutlarini fullsceen durumunda yazdırın

        System.out.println("konumu fullscreen "+driver.manage().window().getSize());
        System.out.println("boyutu fullscreen "+ driver.manage().window().getPosition());

        //9. Sayfayi kapatin
        driver.quit();
    }
}
