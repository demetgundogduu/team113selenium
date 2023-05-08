package ders05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_EXERCISE {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        WebElement usernameKutusu= driver.findElement(By.id("user-name"));
        usernameKutusu.sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
       WebElement passwordKutusu= driver.findElement(By.xpath("//input[@id='password']"));
       passwordKutusu.sendKeys("secret_sauce");
        //4. Login tusuna basin
        WebElement logınTusuElementı=driver.findElement(By.id("login-button"));
        logınTusuElementı.click();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrunIsmı=driver.findElement(By.className("inventory_item_name"));

        //6. Add to Cart butonuna basin
      WebElement AddtoCartButonuElementı=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
      AddtoCartButonuElementı.click();
        //7. Alisveris sepetine tiklayin
        WebElement alısverısSepetıElementı=driver.findElement(By.className("shopping_cart_link"));
        alısverısSepetıElementı.click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin

       /// ??????????????????????????????????????????????????????????????????


        //??????????????????????????????????





        //9. Sayfayi kapatin
    }
}
