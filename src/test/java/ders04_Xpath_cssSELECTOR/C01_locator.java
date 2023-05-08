package ders04_Xpath_cssSELECTOR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_locator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://www.amazon.com/ sayfasına gidin.
       driver.get("https://www.amazon.com/");
        //2- Arama kutusuna “city bike” yazip aratin
        WebElement aramaKutusuElementı=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusuElementı.sendKeys("city bike" + Keys.ENTER);
        //3- Görüntülenen sonuçların sayısını yazdırın
        WebElement aramasonucElementi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(aramasonucElementi.getText());
        //4- Listeden ilk urunun resmine tıklayın.
        List<WebElement> urunElementlıstesi=driver.findElements(By.className("s-image"));
        urunElementlıstesi.get(1).click();

        Thread.sleep(2000);
        driver.close();
    }
}
