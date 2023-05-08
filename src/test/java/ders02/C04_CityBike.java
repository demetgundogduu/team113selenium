package ders02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_CityBike {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
        //2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusuElementi.sendKeys("city bike");
        aramaKutusuElementi.submit();
        //3- Görüntülenen sonuçların sayısını yazdırın
        WebElement aramaSonucuElementi= driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucuElementi.getText());
        //lısteden ilk urunun resmıne tıklayın
      List<WebElement> ılkUrunResmıElemenlerLıstesı= driver.findElements(By.className("s-image"));

       ılkUrunResmıElemenlerLıstesı.get(0).click();








    }
}
