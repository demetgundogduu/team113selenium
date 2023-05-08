package ders03_locators_Relatıve_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C03_Relatıve_Locator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2 ) Berlin’i 3 farkli relative locator ile locate edin
        // Relative locator’larin dogru calistigini test edin


        //berlın locate: pid7_thumb
                // 1 .inci locate TAG'I İMG NYC ALTINDA
        WebElement NYC=driver.findElement(By.id("pid3_thumb"));
        WebElement BERLIN1= driver.findElement(RelativeLocator.with(By.tagName("img")).below(NYC));
        // BERLIN1.getAttribute("id");   degerın buna esıt olamsı lazım id=pid3_thumb
        if (BERLIN1.getAttribute("id").equals("pid7_thumb")){
            System.out.println("BERLIN1 locate testı PASSED");
        }else{
            System.out.println("BERLIN1 locate testı FAILED");
        }

                 //2.inci locate TAG'I İMG BOSTON SAGINDA

     WebElement BOSTON =driver.findElement(By.id("pid6_thumb"));
        WebElement BERLIN2= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(BOSTON));
        if (BERLIN2.getAttribute("id").equals("pid7_thumb")){
            System.out.println("BERLIN2 locate testı PASSED");
        }else{
            System.out.println("BERLIN2 locate testı FAILED");
        }

           //3.locate sailor ustunde

        WebElement SAILOR = driver.findElement(By.id("pid11_thumb"));
        WebElement BERLIN3= driver.findElement(RelativeLocator.with(By.tagName("img")).above(SAILOR));
        if (BERLIN3.getAttribute("id").equals("pid7_thumb")){
            System.out.println("BERLIN3 locate testı PASSED");
        }else {
            System.out.println("BERLIN3 locate testı FAILED");
        }
         driver.close();

    }
}
