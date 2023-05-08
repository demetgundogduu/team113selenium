package ders05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_EXERCISE1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//i[@class='icon-signin']")).click();
        //3. Login alanine “username” yazdirin
        WebElement logınAlanıElementı= driver.findElement(By.xpath("//input[@id='user_login']"));
        logınAlanıElementı.sendKeys("username");
        //4. Password alanina “password” yazdirin
        WebElement passwordAlanı= driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordAlanı.sendKeys("password");
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        //6. Back tusu ile sayfaya donun
        driver.navigate().back();
        //7. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        //8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amounElementi=driver.findElement(By.xpath("//input[@id='sp_amount']"));
         amounElementi.sendKeys("200");
        //9. tarih kismina “2020-09-10” yazdirin
        WebElement tarihElementı=driver.findElement(By.xpath("//input[@id='sp_date']"));
        tarihElementı.sendKeys("2020-09-10");
        //10. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//div[@class='pull-right']")).click();
        //11. “The payment was successfully submitted.” mesajinin   ciktigini test edin
        WebElement paymentWasSuccessfullyMesajı=driver.findElement(By.xpath("//div[@id='alert_content']"));
        String expectedPaymentSuccessfullyMesajı="The payment was successfully submitted.";
        String actualPaymentSuccessfullyMesajı=paymentWasSuccessfullyMesajı.getText();

        if (actualPaymentSuccessfullyMesajı.contains(expectedPaymentSuccessfullyMesajı)){
            System.out.println("The payment was successfully submitted mesajını ıcerır test PASSED");
        }else {
            System.out.println("The payment was successfully submitted mesajını ıcermıyor test FAILED");
        }
         driver.close();
    }
}
